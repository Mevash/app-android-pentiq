package com.example.pentiq.ui.alarm

import android.app.AlarmManager
import android.content.Context.ALARM_SERVICE
import android.graphics.Canvas
import android.util.Log
import android.view.View
import com.airbnb.epoxy.EpoxyTouchHelper
import com.example.domain.model.Alarm
import com.example.domain.util.Resource
import com.example.pentiq.AlarmBindingModel_
import com.example.pentiq.databinding.FragmentScheduledAlarmsBinding
import com.example.pentiq.scheduler.NotificationAlarmScheduler
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat
import org.joda.time.DateTime
import kotlin.math.abs

class ScheduledAlarmsPresenter(
    private val fragment: ScheduledAlarmsFragment,
    private val binding: FragmentScheduledAlarmsBinding,
    private val scheduledAlarmsViewModel: ScheduledAlarmsViewModel
) : EpoxyTouchHelper.SwipeCallbacks<AlarmBindingModel_>() {

    init {
        initViews()
    }

    fun onAddAlarmClick() {
        val now = DateTime.now()
        val timePicker = MaterialTimePicker.Builder()
            .setTimeFormat(TimeFormat.CLOCK_24H)
            .setHour(now.hourOfDay)
            .setMinute(now.minuteOfHour)
            .setTitleText("Select Appointment time")
            .build()
        with(timePicker) {
            addOnPositiveButtonClickListener {
                scheduledAlarmsViewModel.addAlarm(Alarm(hour = hour, minute = minute, enabled = true))
            }
            show(fragment.parentFragmentManager, null)
        }

    }

    private fun initViews() {
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val scheduledAlarmController = ScheduledAlarmController(::onAlarmCheckedChangeListener)

        binding.alarmsRecycler.adapter = scheduledAlarmController.adapter

        EpoxyTouchHelper.initSwiping(binding.alarmsRecycler)
            .leftAndRight()
            .withTarget(AlarmBindingModel_::class.java)
            .andCallbacks(this)

        scheduledAlarmsViewModel.allAlarms.observe(fragment.viewLifecycleOwner) {
            when (it.status) {
                Resource.Status.SUCCESS -> {
                    Log.d("HEN", "Success - allAlarms")
                    scheduledAlarmController.setData(it.data)

                }
                Resource.Status.ERROR -> {
                    Log.d("HEN", "Error - allAlarms")
                }
                Resource.Status.LOADING -> {
                    Log.e("HEN", "Loading - allAlarms")
                }
            }
        }
    }

    private fun onAlarmCheckedChangeListener(alarm: Alarm) {
        scheduledAlarmsViewModel.updateAlarm(alarm)
    }

    override fun onSwipeCompleted(model: AlarmBindingModel_, itemView: View, position: Int, direction: Int) {
        scheduledAlarmsViewModel.deleteAlarm(model.presenter().alarm)
    }

    override fun onSwipeProgressChanged(model: AlarmBindingModel_, itemView: View, progress: Float, canvas: Canvas) {
        val alpha = (abs(progress) * 255).toInt()
        canvas.drawARGB(alpha, 255, 0, 0)
    }

    override fun isSwipeEnabledForModel(model: AlarmBindingModel_?) = true
}

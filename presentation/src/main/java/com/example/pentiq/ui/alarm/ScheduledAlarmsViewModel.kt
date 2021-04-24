package com.example.pentiq.ui.alarm

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.domain.interactor.alarm.*
import com.example.domain.model.Alarm
import com.example.domain.util.Resource
import com.example.pentiq.scheduler.AlarmScheduler
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class ScheduledAlarmsViewModel(
    private val addAlarmUseCase: AddAlarmUseCase,
    private val deleteAlarmUseCase: DeleteAlarmUseCase,
    private val getAllAlarmsUseCase: GetAllAlarmsUseCase,
    private val getEnabledAlarmsUseCase: GetEnabledAlarmsUseCase,
    private val updateAlarmUseCase: UpdateAlarmUseCase,
    private val alarmScheduler: AlarmScheduler
) : ViewModel() {

    private val _allAlarms = MutableStateFlow<Resource<List<Alarm>>>(Resource.success(emptyList()))
    val allAlarms = _allAlarms.asLiveData()

    init {
        fetchAlarms()
        scheduleEnabledAlarms()
    }

    fun addAlarm(alarm: Alarm) {
        viewModelScope.launch { addAlarmUseCase(alarm) }
    }

    fun updateAlarm(alarm: Alarm) {
        viewModelScope.launch { updateAlarmUseCase(alarm) }
    }

    fun deleteAlarm(alarm: Alarm) {
        viewModelScope.launch { deleteAlarmUseCase(alarm) }
    }

    private fun fetchAlarms() {
        viewModelScope.launch {
            getAllAlarmsUseCase().collect {
                _allAlarms.emit(it)
            }
        }
    }

    private fun scheduleEnabledAlarms() {
        viewModelScope.launch {
            getEnabledAlarmsUseCase().collect {
                when (it.status) {
                    Resource.Status.SUCCESS -> {
                        Log.d("HEN", "Success - enabledAlarms")
                        it.data?.let { enabledAlarms -> alarmScheduler.schedule(enabledAlarms) }
                    }
                    else -> {
                        Log.d("HEN", "Error - enabledAlarms")
                    }
                }
            }
        }
    }
}

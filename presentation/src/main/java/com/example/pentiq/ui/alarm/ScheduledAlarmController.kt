package com.example.pentiq.ui.alarm

import com.airbnb.epoxy.TypedEpoxyController
import com.example.domain.model.Alarm
import com.example.pentiq.alarm

class ScheduledAlarmController(private val onAlarmCheckedChangeListener: (Alarm) -> Unit) :
    TypedEpoxyController<List<Alarm>>() {

    override fun buildModels(alarms: List<Alarm>) {
        alarms.forEach {
            val scheduledAlarmPresenter = ScheduledAlarmPresenter(it)
            alarm {
                id(it.id)
                presenter(scheduledAlarmPresenter)
                checkedChangeListener { _, _, _, isChecked, _ ->
                    onAlarmCheckedChangeListener(it.copy(enabled = isChecked))
                }
            }
        }
    }
}
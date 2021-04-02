package com.example.pentiq.ui.alarm

import androidx.databinding.ObservableField
import com.example.domain.model.Alarm
import com.example.pentiq.extension.timeText

class ScheduledAlarmPresenter(val alarm: Alarm) {

    val time = ObservableField(alarm.timeText())
    val enabled = ObservableField(alarm.enabled)

    override fun equals(other: Any?): Boolean {
        return alarm.id == (other as? ScheduledAlarmPresenter)?.alarm?.id
    }

    override fun hashCode(): Int {
        return alarm.hashCode()
    }
}
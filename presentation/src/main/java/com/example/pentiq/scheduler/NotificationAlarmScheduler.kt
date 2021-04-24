package com.example.pentiq.scheduler

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.util.Log
import com.example.data.extension.dateTime
import com.example.domain.model.Alarm
import com.example.pentiq.receiver.AlarmReceiver
import org.joda.time.DateTime

class NotificationAlarmScheduler(
    private val context: Context,
    private val alarmManager: AlarmManager
) : AlarmScheduler {

    private var alarms: List<Alarm> = emptyList()
    private var nextFiredAlarm: Alarm? = null

    override fun schedule(alarms: List<Alarm>) {
        this.alarms = alarms

        if (alarms.isEmpty()) {
            return
        }

        val nowDateTime = DateTime.now()
        var nextFiredAlarmDateTime: DateTime? = null
        val tempNextFiredAlarm = nextFiredAlarm

        nextFiredAlarm = alarms.firstOrNull { element ->
            nextFiredAlarmDateTime = element.dateTime()
            nextFiredAlarmDateTime?.isAfter(nowDateTime) == true
        } ?: let {
            val firstAlarm = alarms.first()
            nextFiredAlarmDateTime = firstAlarm.dateTime().plusDays(1)
            firstAlarm
        }

        if (tempNextFiredAlarm != nextFiredAlarm) {
            nextFiredAlarmDateTime?.let { schedule(it) }
        }
    }

    override fun scheduleNext() {
        schedule(alarms)
    }

    override fun resetAll() {
        TODO("Not yet implemented")
    }

    private fun schedule(alarmDateTime: DateTime) {
        cancelAllAlarms()
        Log.d("HEN", "Next scheduled alarm : $alarmDateTime ")
        val intent = Intent(context, AlarmReceiver::class.java)
        alarmManager.setExactAndAllowWhileIdle(
            AlarmManager.RTC_WAKEUP,
            alarmDateTime.millis,
            PendingIntent.getBroadcast(context, 123, intent, 0)
        )
    }

    private fun cancelAllAlarms() {
    }
}
package com.example.pentiq.scheduler

import com.example.domain.model.Alarm

interface AlarmScheduler {
    fun schedule(alarms: List<Alarm>)
    fun scheduleNext()
    fun resetAll()
}
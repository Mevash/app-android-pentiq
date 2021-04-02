package com.example.pentiq.extension

import com.example.domain.model.Alarm
import org.joda.time.LocalTime

fun Alarm.timeText(): String {
    return LocalTime(hour, minute).toString("HH:mm")
}
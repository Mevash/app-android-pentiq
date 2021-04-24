package com.example.data.extension

import com.example.domain.model.Alarm
import org.joda.time.DateTime

fun Alarm.dateTime(): DateTime {
    val nowDateTime = DateTime.now()
    return DateTime(
        nowDateTime.year,
        nowDateTime.monthOfYear,
        nowDateTime.dayOfMonth,
        hour,
        minute
    )
}
package com.example.data.datasource

import com.example.domain.model.Alarm
import kotlinx.coroutines.flow.Flow

interface AlarmDataSource {
    fun alarms(): Flow<List<Alarm>>
    fun enabledAlarms(): Flow<List<Alarm>>
    suspend fun addAlarm(alarm: Alarm)
    suspend fun deleteAlarm(alarm: Alarm)
    suspend fun updateAlarm(alarm: Alarm)
}
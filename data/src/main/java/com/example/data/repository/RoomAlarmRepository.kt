package com.example.data.repository

import com.example.data.datasource.AlarmDataSource
import com.example.domain.model.Alarm
import com.example.domain.repository.AlarmRepository
import kotlinx.coroutines.flow.Flow

class RoomAlarmRepository(private val alarmDataSource: AlarmDataSource) : AlarmRepository {
    override fun alarms(): Flow<List<Alarm>> {
        return alarmDataSource.alarms()
    }

    override fun enabledAlarms(): Flow<List<Alarm>> {
        return alarmDataSource.enabledAlarms()
    }

    override suspend fun addAlarm(alarm: Alarm) {
        alarmDataSource.addAlarm(alarm)
    }

    override suspend fun deleteAlarm(alarm: Alarm) {
        alarmDataSource.deleteAlarm(alarm)
    }

    override suspend fun updateAlarm(alarm: Alarm) {
        alarmDataSource.updateAlarm(alarm)
    }
}
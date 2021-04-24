package com.example.data.datasource

import com.example.data.db.dao.AlarmDao
import com.example.data.mapper.AlarmMapper
import com.example.domain.model.Alarm
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class RoomAlarmDataSource(
    private val alarmDao: AlarmDao,
    private val mapper: AlarmMapper
) : AlarmDataSource {
    override fun alarms(): Flow<List<Alarm>> {
        return alarmDao.alarms().map { mapper.fromEntityList(it) }
    }

    override fun enabledAlarms(): Flow<List<Alarm>> {
        return alarmDao.alarms(true).map { mapper.fromEntityList(it) }
    }

    override suspend fun addAlarm(alarm: Alarm) {
        alarmDao.insertAlarm(mapper.toEntity(alarm))
    }

    override suspend fun deleteAlarm(alarm: Alarm) {
        alarmDao.deleteAlarm(mapper.toEntity(alarm))
    }

    override suspend fun updateAlarm(alarm: Alarm) {
        alarmDao.updateAlarm(mapper.toEntity(alarm))
    }
}
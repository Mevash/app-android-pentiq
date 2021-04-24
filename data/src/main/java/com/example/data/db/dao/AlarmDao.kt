package com.example.data.db.dao

import androidx.room.*
import com.example.data.db.model.AlarmEntity
import kotlinx.coroutines.flow.Flow


@Dao
interface AlarmDao {
    @Query("SELECT * FROM ${AlarmEntity.TABLE_NAME} ORDER BY ${AlarmEntity.COLUMN_HOUR},${AlarmEntity.COLUMN_MINUTE}")
    fun alarms(): Flow<List<AlarmEntity>>

    @Query("SELECT * FROM ${AlarmEntity.TABLE_NAME} WHERE ${AlarmEntity.COLUMN_ENABLED} = :enabled ORDER BY ${AlarmEntity.COLUMN_HOUR},${AlarmEntity.COLUMN_MINUTE}")
    fun alarms(enabled: Boolean): Flow<List<AlarmEntity>>

    @Insert
    suspend fun insertAlarm(alarmEntity: AlarmEntity)

    @Update
    suspend fun updateAlarm(alarmEntity: AlarmEntity)

    @Delete
    suspend fun deleteAlarm(alarmEntity: AlarmEntity)
}
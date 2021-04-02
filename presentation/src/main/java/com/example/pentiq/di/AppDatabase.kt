package com.example.pentiq.di

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.db.dao.AlarmDao
import com.example.data.db.model.AlarmEntity

@Database(
    entities = [AlarmEntity::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun alarmDao(): AlarmDao

    companion object {
        const val DB_NAME = "PentiqAppDatabase.db"
    }
}
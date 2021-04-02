package com.example.pentiq.di.module

import androidx.room.Room
import com.example.pentiq.di.AppDatabase
import com.example.data.db.dao.AlarmDao
import org.koin.android.ext.koin.androidApplication
import org.koin.core.scope.Scope
import org.koin.dsl.module

@Suppress("RemoveExplicitTypeArguments")
class RoomModule {
    companion object {
        val module = module {
            single<AppDatabase> { newAppDatabase() }
            single<AlarmDao> { get<AppDatabase>().alarmDao() }
        }

        private fun Scope.newAppDatabase(): AppDatabase {
            return Room.databaseBuilder(
                androidApplication(),
                AppDatabase::class.java,
                AppDatabase.DB_NAME
            )
                .fallbackToDestructiveMigration()
                .build()
        }
    }


}
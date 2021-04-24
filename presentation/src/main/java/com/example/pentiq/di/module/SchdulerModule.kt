package com.example.pentiq.di.module

import android.app.AlarmManager
import android.content.Context
import com.example.pentiq.scheduler.AlarmScheduler
import com.example.pentiq.scheduler.NotificationAlarmScheduler
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

class SchedulerModule {
    companion object {
        val module = module {
            single<AlarmScheduler> {
                NotificationAlarmScheduler(
                    androidContext(),
                    androidContext().getSystemService(Context.ALARM_SERVICE) as AlarmManager
                )
            }
        }
    }
}
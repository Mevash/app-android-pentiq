package com.example.pentiq.di.module

import com.example.data.datasource.AlarmDataSource
import com.example.data.datasource.RoomAlarmDataSource
import com.example.pentiq.getObject
import org.koin.dsl.module


@Suppress("RemoveExplicitTypeArguments")
class DataSourceModule {
    companion object {
        val module = module {
            factory<AlarmDataSource> { getObject(::RoomAlarmDataSource) }
        }
    }
}
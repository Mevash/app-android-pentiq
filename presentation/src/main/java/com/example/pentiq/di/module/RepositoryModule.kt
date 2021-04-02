package com.example.pentiq.di.module

import com.example.data.repository.RoomAlarmRepository
import com.example.domain.repository.AlarmRepository
import com.example.pentiq.getObject
import org.koin.dsl.module

@Suppress("RemoveExplicitTypeArguments")
class RepositoryModule {
    companion object {
        val module = module {
            single<AlarmRepository> { getObject(::RoomAlarmRepository) }
        }
    }
}
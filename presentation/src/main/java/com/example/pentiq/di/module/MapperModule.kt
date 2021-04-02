package com.example.pentiq.di.module

import com.example.data.mapper.AlarmMapper
import com.example.pentiq.getObject
import org.koin.dsl.module


@Suppress("RemoveExplicitTypeArguments")
class MapperModule {
    companion object {
        val module = module {
            factory<AlarmMapper> { getObject(::AlarmMapper) }
        }
    }
}
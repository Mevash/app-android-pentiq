package com.example.pentiq.di

import com.example.pentiq.application.PentiqApplication
import com.example.pentiq.di.module.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class KoinStarter {
    companion object {
        fun init(application: PentiqApplication) {
            startKoin {
                androidContext(application)

                val appModules = mutableListOf(
                    DataSourceModule.module,
                    MapperModule.module,
                    RepositoryModule.module,
                    RoomModule.module,
                    ViewModelModule.module,
                    UseCaseModule.module
                )

                modules(appModules)
            }
        }

    }
}
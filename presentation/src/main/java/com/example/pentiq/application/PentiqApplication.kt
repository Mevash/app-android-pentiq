package com.example.pentiq.application

import android.app.Application
import com.example.pentiq.di.KoinStarter

class PentiqApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        KoinStarter.init(this)

    }
}
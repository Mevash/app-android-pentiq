package com.example.pentiq.di.module

import com.example.pentiq.ui.alarm.ScheduledAlarmsViewModel
import com.example.pentiq.getObject
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

@Suppress("RemoveExplicitTypeArguments")
class ViewModelModule {

    companion object {
        val module = module {
            viewModel<ScheduledAlarmsViewModel> { getObject(::ScheduledAlarmsViewModel) }
        }
    }
}
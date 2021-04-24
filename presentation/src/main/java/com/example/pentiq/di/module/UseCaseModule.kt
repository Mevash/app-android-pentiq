package com.example.pentiq.di.module

import com.example.domain.interactor.alarm.*
import com.example.pentiq.*
import org.koin.dsl.module

@Suppress("RemoveExplicitTypeArguments")
class UseCaseModule {
    companion object {
        val module = module {
            //  Alarm Use Cases
            factory<AddAlarmUseCase> { getObject(::AddAlarmToRoomUseCase) }
            factory<DeleteAlarmUseCase> { getObject(::DeleteAlarmFromRoomUseCase) }
            factory<GetAllAlarmsUseCase> { getObject(::GetAllAlarmsFromRoomUseCase) }
            factory<GetEnabledAlarmsUseCase> { getObject(::GetEnabledAlarmsFromRoomUseCase) }
            factory<UpdateAlarmUseCase> { getObject(::UpdateAlarmInRoomUseCase) }
        }
    }
}
package com.example.domain.interactor.alarm

import com.example.domain.model.Alarm
import com.example.domain.repository.AlarmRepository

interface AddAlarmUseCase {
    suspend operator fun invoke(alarm: Alarm)
}

class AddAlarmToRoomUseCase(private val alarmRepository: AlarmRepository) : AddAlarmUseCase {
    override suspend fun invoke(alarm: Alarm) {
        alarmRepository.addAlarm(alarm)
    }
}
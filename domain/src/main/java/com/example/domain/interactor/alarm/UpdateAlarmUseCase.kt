package com.example.domain.interactor.alarm

import com.example.domain.model.Alarm
import com.example.domain.repository.AlarmRepository

interface UpdateAlarmUseCase {
    suspend operator fun invoke(alarm: Alarm)
}

class UpdateAlarmInRoomUseCase(private val alarmRepository: AlarmRepository) : UpdateAlarmUseCase {
    override suspend fun invoke(alarm: Alarm) {
        alarmRepository.updateAlarm(alarm)
    }
}
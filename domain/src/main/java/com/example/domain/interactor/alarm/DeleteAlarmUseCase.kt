package com.example.domain.interactor.alarm

import com.example.domain.model.Alarm
import com.example.domain.repository.AlarmRepository

interface DeleteAlarmUseCase {
    suspend operator fun invoke(alarm: Alarm)
}

class DeleteAlarmFromRoomUseCase(private val alarmRepository: AlarmRepository) : DeleteAlarmUseCase {
    override suspend fun invoke(alarm: Alarm) {
        alarmRepository.deleteAlarm(alarm)
    }
}
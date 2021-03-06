package com.example.domain.interactor.alarm

import com.example.domain.model.Alarm
import com.example.domain.repository.AlarmRepository
import com.example.domain.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart

interface GetAllAlarmsUseCase {
    suspend operator fun invoke(): Flow<Resource<List<Alarm>>>
}

class GetAllAlarmsFromRoomUseCase(private val alarmRepository: AlarmRepository) : GetAllAlarmsUseCase {

    override suspend fun invoke(): Flow<Resource<List<Alarm>>> {
        return alarmRepository.alarms()
            .map { Resource.success(it) }
            .onStart { emit(Resource.loading()) }
            .catch { emit(Resource.error(it.toString())) }
    }
}
package com.example.pentiq.ui.alarm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.domain.interactor.alarm.AddAlarmUseCase
import com.example.domain.interactor.alarm.DeleteAlarmUseCase
import com.example.domain.interactor.alarm.LoadAlarmsUseCase
import com.example.domain.interactor.alarm.UpdateAlarmUseCase
import com.example.domain.model.Alarm
import com.example.domain.util.Resource
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class ScheduledAlarmsViewModel(
    private val addAlarmUseCase: AddAlarmUseCase,
    private val deleteAlarmUseCase: DeleteAlarmUseCase,
    private val loadAlarmsUseCase: LoadAlarmsUseCase,
    private val updateAlarmUseCase: UpdateAlarmUseCase
) : ViewModel() {

    private val _scheduledAlarmListItems = MutableStateFlow<Resource<List<Alarm>>>(Resource.success(emptyList()))
    val scheduledAlarmListItems = _scheduledAlarmListItems.asLiveData()

    init {
        fetchAlarms()
    }

    fun addAlarm(alarm: Alarm) {
        viewModelScope.launch { addAlarmUseCase(alarm) }
    }

    fun updateAlarm(alarm: Alarm) {
        viewModelScope.launch { updateAlarmUseCase(alarm) }
    }

    fun deleteAlarm(alarm: Alarm) {
        viewModelScope.launch { deleteAlarmUseCase(alarm) }
    }

    private fun fetchAlarms() {
        viewModelScope.launch {
            loadAlarmsUseCase().collect {
                _scheduledAlarmListItems.emit(it)
            }
        }
    }
}

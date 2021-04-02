package com.example.data.mapper

import com.example.data.db.model.AlarmEntity
import com.example.domain.model.Alarm

class AlarmMapper : EntityMapper<Alarm, AlarmEntity> {

    override fun fromEntity(entity: AlarmEntity): Alarm {
        return entity.run {
            Alarm(
                id = id,
                hour = hour,
                minute = minute,
                enabled = enabled
            )
        }
    }

    override fun toEntity(model: Alarm): AlarmEntity {
        return model.run {
            AlarmEntity(
                id = id,
                hour = hour,
                minute = minute,
                enabled = enabled
            )
        }
    }

    override fun fromEntityList(entities: List<AlarmEntity>): List<Alarm> {
        return entities.map { fromEntity(it) }
    }

    override fun toEntityList(models: List<Alarm>): List<AlarmEntity> {
        return models.map { toEntity(it) }
    }
}
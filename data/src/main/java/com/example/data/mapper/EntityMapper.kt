package com.example.data.mapper

interface EntityMapper<Model, Entity> {

    fun fromEntity(entity: Entity): Model
    fun fromEntityList(entities: List<Entity>): List<Model>
    fun toEntity(model: Model): Entity
    fun toEntityList(models: List<Model>): List<Entity>
}
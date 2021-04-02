package com.example.domain.model

data class Alarm(
    val id: Int = 0,
    val hour: Int,
    val minute: Int,
    val enabled: Boolean
)
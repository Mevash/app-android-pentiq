package com.example.data.db.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.data.db.model.AlarmEntity.Companion.TABLE_NAME

@Entity(tableName = TABLE_NAME)
data class AlarmEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = COLUMN_ID) val id: Int,
    @ColumnInfo(name = COLUMN_HOUR) val hour: Int,
    @ColumnInfo(name = COLUMN_MINUTE) val minute: Int,
    @ColumnInfo(name = COLUMN_ENABLED) val enabled: Boolean
) {
    companion object {
        const val TABLE_NAME = "alarm"
        const val COLUMN_ID = "id"
        const val COLUMN_HOUR = "hour"
        const val COLUMN_MINUTE = "minute"
        const val COLUMN_ENABLED = "enabled"
    }
}
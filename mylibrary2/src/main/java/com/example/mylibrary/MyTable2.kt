package com.example.mylibrary

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "myModel")
data class MyTable2(
    @PrimaryKey
    @ColumnInfo(name = "key")
    val key: String,
    @ColumnInfo(name = "value", index = true)
    val value: String
)
fun _m_038ac7ef_aba7_4446_9a50_3981c15472ae_build_41b46a7c_WARM_UP_1() {}
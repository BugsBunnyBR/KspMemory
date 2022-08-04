package com.example.mylibrary

import android.content.Context
import androidx.room.Room

class MyLocalDatasource2(context: Context) {
    private val db by lazy {
        Room.databaseBuilder(
            context,
            MyDatabase2::class.java,
            "my-database"
        ).build()
    }
    private val dao by lazy { db.myDao() }
    suspend fun initDatabase() {
        dao.deleteAll()
        dao.insertAll(
            listOf(
                MyTable2(key = "key", value = "value"),
                MyTable2(key = "key1", value = "value1"),
                MyTable2(key = "key2", value = "value2")
            )
        )
    }
}

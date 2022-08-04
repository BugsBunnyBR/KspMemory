package com.example.mylibrary

import android.content.Context
import androidx.room.Room

class MyLocalDatasource(context: Context) {
    private val db by lazy {
        Room.databaseBuilder(
            context,
            MyDatabase::class.java,
            "my-database"
        ).build()
    }
    private val dao by lazy { db.myDao() }
    suspend fun initDatabase() {
        dao.deleteAll()
        dao.insertAll(
            listOf(
                MyTable(key = "key", value = "value"),
                MyTable(key = "key1", value = "value1"),
                MyTable(key = "key2", value = "value2")
            )
        )
    }
}

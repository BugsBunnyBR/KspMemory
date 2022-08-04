package com.example.mylibrary

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [MyTable::class], version = 1)
abstract class MyDatabase : RoomDatabase() {

    abstract fun myDao(): MyDao
}

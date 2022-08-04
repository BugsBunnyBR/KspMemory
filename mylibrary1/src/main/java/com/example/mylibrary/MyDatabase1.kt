package com.example.mylibrary

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [MyTable1::class], version = 1)
abstract class MyDatabase1 : RoomDatabase() {

    abstract fun myDao(): MyDao1
}

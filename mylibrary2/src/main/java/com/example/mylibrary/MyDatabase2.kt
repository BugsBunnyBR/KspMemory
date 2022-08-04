package com.example.mylibrary

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [MyTable2::class], version = 1)
abstract class MyDatabase2 : RoomDatabase() {

    abstract fun myDao(): MyDao2
}

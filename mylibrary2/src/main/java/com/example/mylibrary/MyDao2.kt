package com.example.mylibrary

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface MyDao2 {

    @Query("SELECT * FROM myModel WHERE `key` = :key  LIMIT 1")
    suspend fun findByKey(key: String): MyTable2?

    @Transaction
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(data: List<MyTable2>)

    @Query("DELETE FROM myModel")
    suspend fun deleteAll()
}

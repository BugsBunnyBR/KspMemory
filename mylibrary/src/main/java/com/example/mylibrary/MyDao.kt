package com.example.mylibrary

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface MyDao {

    @Query("SELECT * FROM myModel WHERE `key` = :key  LIMIT 1")
    suspend fun findByKey(key: String): MyTable?

    @Transaction
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(data: List<MyTable>)

    @Query("DELETE FROM myModel")
    suspend fun deleteAll()
}

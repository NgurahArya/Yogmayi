package com.yogahindu4011.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface MateriBelajarDAO {

    @Query("SELECT * FROM MateriBelajar")
    suspend fun getAllMateri(): List<MateriBelajar>

    @Query("SELECT * FROM MateriBelajar WHERE materiId = :materiId ")
    suspend fun getMateribyID(materiId: String): MateriBelajar?
}
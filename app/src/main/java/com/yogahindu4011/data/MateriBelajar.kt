package com.yogahindu4011.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "MateriBelajar")
data class MateriBelajar(
    @PrimaryKey(autoGenerate = true) val materiId: Int,
    val title: String,
    val imageUrl: String,
    val body: String
)

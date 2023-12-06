package com.yogahindu4011.data

import androidx.room.Database
import androidx.room.DatabaseConfiguration
import androidx.room.InvalidationTracker
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteOpenHelper

@Database(entities = [MateriBelajar::class], version = 1)
abstract class MateriDatabase : RoomDatabase(){
    abstract fun materiDAO(): MateriBelajarDAO

}
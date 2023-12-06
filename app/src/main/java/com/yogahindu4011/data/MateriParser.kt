package com.yogahindu4011.data

import com.google.gson.Gson
import java.io.File

class MateriParser {

    fun parseMateriData(): List<MateriBelajar>{
        val jsonFile = File("materiBelajar.json")
        val json = jsonFile.readText()
        return Gson().fromJson(json, Array<MateriBelajar>::class.java).toList()
    }

}
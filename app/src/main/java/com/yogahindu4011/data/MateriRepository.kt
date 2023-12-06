package com.yogahindu4011.data

class MateriRepository(private val materiParser: MateriParser) {

    fun getAllMateri():List<MateriBelajar>{
        return materiParser.parseMateriData()
    }
}
package com.yogahindu4011.ui.view.mainMenu

data class Stats(
    val stats: String,
    val value: Int
)

val statsList =  listOf(
    Stats(
        stats = "Latihan",
        value = 100
    ),

    Stats(
        stats = "Menit",
        value = 3000
    ),

    Stats(
        stats = "Calorie",
        value = 27000
    ),
)

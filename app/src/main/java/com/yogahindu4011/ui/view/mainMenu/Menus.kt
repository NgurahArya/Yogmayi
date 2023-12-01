package com.yogahindu4011.ui.view.mainMenu

data class Menus(
    val label: String,
    val title: String,
    val desc: String
)

val menuList = listOf(
    Menus(
        label = "BELAJAR YOGA",
        title = "MULAI BELAJAR YOGA",
        desc = "3 Materi"
    ),

    Menus(
        label = "LATIHAN YOGA",
        title = "MULAI YATIHAN YOGA",
        desc = "2 Gerakan"
    )
)
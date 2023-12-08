package com.yogahindu4011.navigation

const val ROOT_ROUTE = "root"
const val BELAJAR_ROUTE = "belajar"
const val MAIN_ROUTE = "main"

sealed class Screen(val route: String) {
    object MainMenu: Screen(route = "menu_main")

    object TargetMingguan: Screen(route = "menu_target")

    object BelajarYoga: Screen(route = "menu_belajar")

    object MateriYoga: Screen(route = "materi_yoga_general")
    object MateriYoga2: Screen(route = "materi_yoga_surya")
    object MateriYoga3: Screen(route = "materi_yoga_chandra")


}
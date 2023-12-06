package com.yogahindu4011.navigation

sealed class Screen(val route: String) {
    object MainMenu: Screen(route = "menu_main")

    object TargetMingguan: Screen(route = "menu_target")

    object BelajarYoga: Screen(route = "menu_belajar")

}
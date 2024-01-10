package com.yogahindu4011.navigation

const val ROOT_ROUTE = "root"
const val MAIN_ROUTE = "main"
const val ONBOARD_ROUTE = "onboard"
const val BELAJAR_ROUTE = "belajar"
const val LATIHAN_ROUTE = "latihan"

sealed class Screen(val route: String) {

    object Onboard: Screen(route = "onboarding")

    object MainMenu: Screen(route = "menu_main")

    object TargetMingguan: Screen(route = "menu_target")

    object BelajarYoga: Screen(route = "menu_belajar")

    object MateriYoga: Screen(route = "materi_yoga_general")
    object MateriYoga2: Screen(route = "materi_yoga_surya")
    object MateriYoga3: Screen(route = "materi_yoga_chandra")

    object LatihanYoga: Screen(route = "menu_latihan_yoga")
    object FinishLatihan: Screen(route = "finish_latihan_yoga")

    object LatihanSurya: Screen(route = "latihan_surya")

    object Detail1: Screen(route = "detail_page1")
    object Detail2: Screen(route = "detail_page2")
    object Detail3: Screen(route = "detail_page3")
    object Detail4: Screen(route = "detail_page4")
    object Detail5: Screen(route = "detail_page5")
    object Detail6: Screen(route = "detail_page6")
    object Detail7: Screen(route = "detail_page7")

}
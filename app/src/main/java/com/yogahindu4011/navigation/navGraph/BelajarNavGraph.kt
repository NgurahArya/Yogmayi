package com.yogahindu4011.navigation.navGraph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.yogahindu4011.navigation.BELAJAR_ROUTE
import com.yogahindu4011.navigation.Screen
import com.yogahindu4011.presentation.menu_belajarYoga.materiView.components.screenMateriYogaChandra
import com.yogahindu4011.presentation.menu_belajarYoga.materiView.components.screenMateriYogaGeneral
import com.yogahindu4011.presentation.menu_belajarYoga.materiView.components.screenMateriYogaSurya

fun NavGraphBuilder.belajarNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.BelajarYoga.route,
        route = BELAJAR_ROUTE
    ) {

        //Screen Materi General
        composable(
            route = Screen.MateriYoga.route
        ) {
            screenMateriYogaGeneral(navController = navController)
        }

        //Screen Materi Surya
        composable(
            route = Screen.MateriYoga2.route
        ) {
            screenMateriYogaSurya(navController = navController)
        }

        //Screen Materi Chandra
        composable(
            route = Screen.MateriYoga3.route
        ) {
            screenMateriYogaChandra(navController = navController)
        }
    }
}
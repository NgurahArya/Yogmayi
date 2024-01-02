package com.yogahindu4011.navigation.navGraph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.yogahindu4011.navigation.LATIHAN_ROUTE
import com.yogahindu4011.navigation.Screen
import com.yogahindu4011.presentation.menu_latihanYoga.latihanView.FinishScreen
import com.yogahindu4011.presentation.menu_latihanYoga.latihanView.LatihanScreen

fun NavGraphBuilder.latihanNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.LatihanYoga.route,
        route = LATIHAN_ROUTE
    ) {

        composable(
            route = Screen.LatihanSurya.route
        ) {
            LatihanScreen(navController = navController)
        }

        composable(
            route = Screen.FinishLatihan.route
        ) {
            FinishScreen(navController = navController)
        }

    }
}
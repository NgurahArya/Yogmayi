package com.yogahindu4011.navigation.navGraph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.yogahindu4011.navigation.MAIN_ROUTE
import com.yogahindu4011.navigation.Screen
import com.yogahindu4011.presentation.menu_belajarYoga.BelajarYogaMenu
import com.yogahindu4011.presentation.menu_mainMenu.MainMenuPage
import com.yogahindu4011.presentation.menu_targetMingguan.TargetMinggaunMenu

fun NavGraphBuilder.mainMenuNavGraph(
    navController: NavHostController
){
    navigation(
        startDestination = Screen.MainMenu.route,
        route = MAIN_ROUTE
    ){
        composable(
            route = Screen.MainMenu.route
        ) {
            MainMenuPage(navController = navController)
        }

        composable(
            route = Screen.TargetMingguan.route
        ) {
            TargetMinggaunMenu(navController = navController)
        }

        composable(
            route = Screen.BelajarYoga.route
        ) {
            BelajarYogaMenu(navController = navController)
        }
    }
}
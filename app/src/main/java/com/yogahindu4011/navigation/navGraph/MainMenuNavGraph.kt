package com.yogahindu4011.navigation.navGraph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.yogahindu4011.navigation.MAIN_ROUTE
import com.yogahindu4011.navigation.Screen
import com.yogahindu4011.presentation.menu_belajarYoga.BelajarYogaMenu
import com.yogahindu4011.presentation.menu_latihanYoga.LatihanYogaMenu
import com.yogahindu4011.presentation.menu_mainMenu.MainMenuPage
import com.yogahindu4011.presentation.menu_targetMingguan.TargetMinggaunMenu
import com.yogahindu4011.viewModel.YogaViewModel

fun NavGraphBuilder.mainMenuNavGraph(
    navController: NavHostController,
    viewModel: YogaViewModel
){
    navigation(
        startDestination = Screen.MainMenu.route,
        route = MAIN_ROUTE
    ){
        composable(
            route = Screen.MainMenu.route
        ) {
            MainMenuPage(navController = navController, viewModel = viewModel )
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

        composable(
            route = Screen.LatihanYoga.route
        ) {
            LatihanYogaMenu(navController = navController)
        }
    }
}
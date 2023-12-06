package com.yogahindu4011.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.yogahindu4011.presentation.menu_belajarYoga.BelajarYogaMenu
import com.yogahindu4011.presentation.menu_mainMenu.MainMenuPage
import com.yogahindu4011.presentation.menu_targetMingguan.TargetMinggaunMenu

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController ,
        startDestination = Screen.MainMenu.route
    ){
        composable(
            route = Screen.MainMenu.route
        ){
            MainMenuPage(navController = navController)
        }

        composable(
            route = Screen.TargetMingguan.route
        ){
            TargetMinggaunMenu(navController = navController)
        }

        composable(
            route = Screen.BelajarYoga.route
        ){
            BelajarYogaMenu(navController = navController)
        }
    }
}
package com.yogahindu4011.navigation.navGraph

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.navigation.NavDestination.Companion.hierarchy
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
            AnimatedVisibility(
                visible = navController.currentDestination?.hierarchy?.any { it.route == MAIN_ROUTE } == true,
                enter = slideInHorizontally(initialOffsetX = { it }, animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing)),
                exit = slideOutHorizontally(targetOffsetX = { -it }, animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing))
            ) {
                MainMenuPage(navController = navController, viewModel = viewModel)
            }
        }

        composable(
            route = Screen.TargetMingguan.route
        ) {
            AnimatedVisibility(
                visible = navController.currentDestination?.hierarchy?.any { it.route == MAIN_ROUTE } == true,
                enter = slideInHorizontally(initialOffsetX = { it }, animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing)),
                exit = slideOutHorizontally(targetOffsetX = { -it }, animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing))
            ) {
                TargetMinggaunMenu(navController = navController, viewModel = viewModel)
            }

        }

        composable(
            route = Screen.BelajarYoga.route
        ) {
            AnimatedVisibility(
                visible = navController.currentDestination?.hierarchy?.any { it.route == MAIN_ROUTE } == true,
                enter = slideInHorizontally(initialOffsetX = { it }, animationSpec = tween(durationMillis = 300)),
                exit = slideOutHorizontally(targetOffsetX = { -it }, animationSpec = tween(durationMillis = 300))
            ) {
                BelajarYogaMenu(navController = navController)
            }

        }

        composable(
            route = Screen.LatihanYoga.route
        ) {
            AnimatedVisibility(
                visible = navController.currentDestination?.hierarchy?.any { it.route == MAIN_ROUTE } == true,
                enter = slideInHorizontally(initialOffsetX = { it }, animationSpec = tween(durationMillis = 300)),
                exit = slideOutHorizontally(targetOffsetX = { -it }, animationSpec = tween(durationMillis = 300))
            ) {
                LatihanYogaMenu(navController = navController)
            }

        }
    }
}
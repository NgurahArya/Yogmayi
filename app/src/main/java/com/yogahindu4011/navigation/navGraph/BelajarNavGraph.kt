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
            AnimatedVisibility(
                visible = navController.currentDestination?.hierarchy?.any { it.route == BELAJAR_ROUTE } == true,
                enter = slideInHorizontally(initialOffsetX = { it }, animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing)),
                exit = slideOutHorizontally(targetOffsetX = { it }, animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing))
            ) {
                screenMateriYogaGeneral(navController = navController)
            }

        }

        //Screen Materi Surya
        composable(
            route = Screen.MateriYoga2.route
        ) {
            AnimatedVisibility(
                visible = navController.currentDestination?.hierarchy?.any { it.route == BELAJAR_ROUTE } == true,
                enter = slideInHorizontally(initialOffsetX = { it }, animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing)),
                exit = slideOutHorizontally(targetOffsetX = { it }, animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing))
            ) {
                screenMateriYogaSurya(navController = navController)
            }

        }

        //Screen Materi Chandra
        composable(
            route = Screen.MateriYoga3.route
        ) {
            AnimatedVisibility(
                visible = navController.currentDestination?.hierarchy?.any { it.route == BELAJAR_ROUTE } == true,
                enter = slideInHorizontally(initialOffsetX = { it }, animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing)),
                exit = slideOutHorizontally(targetOffsetX = { it }, animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing))
            ) {
                screenMateriYogaChandra(navController = navController)
            }

        }
    }
}
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
import com.yogahindu4011.navigation.LATIHAN_ROUTE
import com.yogahindu4011.navigation.Screen
import com.yogahindu4011.presentation.menu_latihanYoga.components.detailGerakanScreen1
import com.yogahindu4011.presentation.menu_latihanYoga.components.detailGerakanScreen2
import com.yogahindu4011.presentation.menu_latihanYoga.components.detailGerakanScreen3
import com.yogahindu4011.presentation.menu_latihanYoga.components.detailGerakanScreen4
import com.yogahindu4011.presentation.menu_latihanYoga.components.detailGerakanScreen5
import com.yogahindu4011.presentation.menu_latihanYoga.components.detailGerakanScreen6
import com.yogahindu4011.presentation.menu_latihanYoga.components.detailGerakanScreen7
import com.yogahindu4011.presentation.menu_latihanYoga.latihanView.FinishScreen
import com.yogahindu4011.presentation.menu_latihanYoga.latihanView.LatihanScreen
import com.yogahindu4011.viewModel.YogaViewModel

fun NavGraphBuilder.latihanNavGraph(
    navController: NavHostController,
    viewModel: YogaViewModel
) {
    navigation(
        startDestination = Screen.LatihanYoga.route,
        route = LATIHAN_ROUTE
    ) {

        composable(
            route = Screen.LatihanSurya.route
        ) {
            AnimatedVisibility(
                visible = navController.currentDestination?.hierarchy?.any { it.route == LATIHAN_ROUTE } == true,
                enter = slideInHorizontally(initialOffsetX = { it }, animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing)),
                exit = slideOutHorizontally(targetOffsetX = { it }, animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing))
            ) {
                LatihanScreen(navController = navController)
            }

        }

        composable(
            route = Screen.Detail1.route
        ) {
            detailGerakanScreen1(navController = navController)
        }
        composable(
            route = Screen.Detail2.route
        ) {
            detailGerakanScreen2(navController = navController)
        }
        composable(
            route = Screen.Detail3.route
        ) {
            detailGerakanScreen3(navController = navController)
        }
        composable(
            route = Screen.Detail4.route
        ) {
            detailGerakanScreen4(navController = navController)
        }
        composable(
            route = Screen.Detail5.route
        ) {
            detailGerakanScreen5(navController = navController)
        }
        composable(
            route = Screen.Detail6.route
        ) {
            detailGerakanScreen6(navController = navController)
        }
        composable(
            route = Screen.Detail7.route
        ) {
            detailGerakanScreen7(navController = navController)
        }

        composable(
            route = Screen.FinishLatihan.route
        ) {
            AnimatedVisibility(
                visible = navController.currentDestination?.hierarchy?.any { it.route == LATIHAN_ROUTE } == true,
                enter = slideInHorizontally(initialOffsetX = { it }, animationSpec = tween(durationMillis = 300,easing = FastOutSlowInEasing)),
                exit = slideOutHorizontally(targetOffsetX = { it }, animationSpec = tween(durationMillis = 300,easing = FastOutSlowInEasing))
            ) {
                FinishScreen(navController = navController, viewModel = viewModel)
            }

        }

    }
}
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
                exit = slideOutHorizontally(targetOffsetX = { -it }, animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing))
            ) {
                LatihanScreen(navController = navController)
            }

        }

        /*composable(
            route = Screen.DetailGerakan.route,
            arguments = listOf(
                navArgument("gerakanId") { type = NavType.IntType },
                navArgument("gerakan") { type = NavType.ParcelableType(GerakanYoga::class.java)}
            )
            
        ){ entry ->
            val gerakanId = entry.arguments?.getInt("gerakanId") ?: 0
            val gerakan = entry.arguments?.getParcelable("gerakan") ?: GerakanYoga()
            detailGerakan(
                img = gerakan.imageUrl,
                namaGerakan =  gerakan.namaGerakan,
                namaGerakanLoc = gerakan.namaGerakanLoc,
                how = gerakan.caraMelakukan,
                tips = gerakan.tips,
                navController =  navController
            )
        }*/

        composable(
            route = Screen.FinishLatihan.route
        ) {
            AnimatedVisibility(
                visible = navController.currentDestination?.hierarchy?.any { it.route == LATIHAN_ROUTE } == true,
                enter = slideInHorizontally(initialOffsetX = { it }, animationSpec = tween(durationMillis = 300,easing = FastOutSlowInEasing)),
                exit = slideOutHorizontally(targetOffsetX = { -it }, animationSpec = tween(durationMillis = 300,easing = FastOutSlowInEasing))
            ) {
                FinishScreen(navController = navController, viewModel = viewModel)
            }

        }

    }
}
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
import com.yogahindu4011.navigation.ONBOARD_ROUTE
import com.yogahindu4011.navigation.Screen
import com.yogahindu4011.presentation.menu_mainMenu.MainMenuPage
import com.yogahindu4011.presentation.onboarding.OnboardingPage
import com.yogahindu4011.viewModel.YogaViewModel

fun NavGraphBuilder.onboardNavGraph(
    navController: NavHostController,
    viewModel: YogaViewModel
){
    navigation(
        startDestination = Screen.Onboard.route,
        route = ONBOARD_ROUTE
    ){
        composable(
            route = Screen.Onboard.route
        ) {
            AnimatedVisibility(
                visible = navController.currentDestination?.hierarchy?.any { it.route == ONBOARD_ROUTE } == true,
                enter = slideInHorizontally(initialOffsetX = { it }, animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing)),
                exit = slideOutHorizontally(targetOffsetX = { -it }, animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing))
            ){
                OnboardingPage(viewModel = viewModel, navController = navController)
            }

        }

        composable(
            route = Screen.MainMenu.route
        ) {
            AnimatedVisibility(
                visible = navController.currentDestination?.hierarchy?.any { it.route == ONBOARD_ROUTE } == true,
                enter = slideInHorizontally(initialOffsetX = { it }, animationSpec = tween(durationMillis = 300)),
                exit = slideOutHorizontally(targetOffsetX = { -it }, animationSpec = tween(durationMillis = 300))
            ) {
                MainMenuPage(navController = navController, viewModel = viewModel)
            }
        }
    }
}
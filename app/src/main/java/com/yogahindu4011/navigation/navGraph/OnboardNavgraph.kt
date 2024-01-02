package com.yogahindu4011.navigation.navGraph

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
            OnboardingPage(viewModel = viewModel, navController = navController)
        }

        composable(
            route = Screen.MainMenu.route
        ) {
            MainMenuPage(navController = navController, viewModel = viewModel )
        }
    }
}
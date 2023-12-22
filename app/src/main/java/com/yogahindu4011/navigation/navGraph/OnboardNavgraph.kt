package com.yogahindu4011.navigation.navGraph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.yogahindu4011.navigation.ONBOARD_ROUTE
import com.yogahindu4011.navigation.Screen
import com.yogahindu4011.presentation.menu_belajarYoga.BelajarYogaMenu
import com.yogahindu4011.presentation.menu_latihanYoga.LatihanYogaMenu
import com.yogahindu4011.presentation.menu_mainMenu.MainMenuPage
import com.yogahindu4011.presentation.menu_targetMingguan.TargetMinggaunMenu
import com.yogahindu4011.presentation.onboarding.OnboardingPage

fun NavGraphBuilder.onboardNavGraph(
    navController: NavHostController
){
    navigation(
        startDestination = Screen.Onboard.route,
        route = ONBOARD_ROUTE
    ){
        composable(
            route = Screen.Onboard.route
        ) {
            OnboardingPage(navController = navController)
        }
    }
}
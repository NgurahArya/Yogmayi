package com.yogahindu4011.navigation.navGraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.yogahindu4011.navigation.MAIN_ROUTE
import com.yogahindu4011.navigation.ONBOARD_ROUTE
import com.yogahindu4011.navigation.ROOT_ROUTE
import com.yogahindu4011.viewModel.YogaViewModel


@Composable
fun SetupNavGraph(
    navController: NavHostController,
    viewModel: YogaViewModel
) {
    NavHost(
        navController = navController,
        startDestination = ONBOARD_ROUTE,
        route = ROOT_ROUTE
    ) {
        onboardNavGraph(navController = navController, viewModel = viewModel)
        mainMenuNavGraph(navController = navController, viewModel = viewModel)
        belajarNavGraph(navController = navController)
        latihanNavGraph(navController = navController)
    }
}
package com.yogahindu4011.navigation.navGraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.yogahindu4011.navigation.MAIN_ROUTE
import com.yogahindu4011.navigation.ROOT_ROUTE


@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = MAIN_ROUTE,
        route = ROOT_ROUTE
    ) {
        mainMenuNavGraph(navController = navController)
        belajarNavGraph(navController = navController)
    }
}
package com.yogahindu4011.navigation.navGraph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.yogahindu4011.data.GerakanYoga
import com.yogahindu4011.navigation.LATIHAN_ROUTE
import com.yogahindu4011.navigation.Screen
import com.yogahindu4011.presentation.menu_latihanYoga.components.detailGerakan
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
            LatihanScreen(navController = navController)
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
            FinishScreen(navController = navController, viewModel = viewModel)
        }

    }
}
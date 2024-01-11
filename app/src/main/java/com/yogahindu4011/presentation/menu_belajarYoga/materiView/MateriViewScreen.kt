package com.yogahindu4011.presentation.menu_belajarYoga.materiView.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.yogahindu4011.R

@Composable
fun screenMateriYogaGeneral(
    navController: NavController
){
    MateriItem(
        R.drawable.ic_general_header,
        "Yoga Secara General",
        R.string.materiYogaP1,
        R.string.materiYogaP2,
        navController = navController
        )
}

@Composable
fun screenMateriYogaSurya(
    navController: NavController
){
    MateriItem(
        R.drawable.ic_materi_surya_header,
        "Surya Namaskara",
        R.string.materiYogaP1,
        R.string.materiYogaP2,
        navController = navController
    )
}

@Composable
fun screenMateriYogaChandra(
    navController: NavController
){
    MateriItem(
        R.drawable.ic_materi_chandra_header,
        "Chandra Namaskara",
        R.string.materiYogaP1,
        R.string.materiYogaP2,
        navController = navController
    )
}
package com.yogahindu4011.presentation.menu_latihanYoga

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.yogahindu4011.R
import com.yogahindu4011.navigation.Screen
import com.yogahindu4011.presentation.common.MenuTopBar
import com.yogahindu4011.presentation.menu_latihanYoga.components.menuLatihanYoga
import com.yogahindu4011.ui.theme.YogaHinduTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LatihanYogaMenu(
    navController: NavController
){
    Scaffold(
        topBar = {
            MenuTopBar(
                text = "Latihan Yoga",
                navController = navController
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.background)
                .fillMaxSize()
                .padding(it)
                .then(
                    Modifier
                        .padding(top = 20.dp, start = 24.dp, end = 14.dp)
                ),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.Start,
        ){
            Text(
                text = "Gerakan Yoga",
                style = MaterialTheme.typography.titleLarge,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onBackground,
                modifier  = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(bottom = 20.dp)
            )

            menuLatihanYoga(
                label = "LATIHAN PERENGGANGAN",
                title = "Perenggangan",
                subTitle = "5 menit",
                img = R.drawable.pict_bow_pose,
                navController = navController,
                route = Screen.LatihanSurya.route
            )

            menuLatihanYoga(
                label = "LATIHAN SURYA NAMASKARA",
                title = "Surya Namaskara",
                subTitle = "12 menit",
                img = R.drawable.pict_stretch_pose,
                navController = navController,
                route = Screen.LatihanSurya.route
            )

            menuLatihanYoga(
                label = "LATIHAN CHANDRA NAMASKARA",
                title = "Chandra Namaskara",
                subTitle = "12 menit",
                img = R.drawable.pict_mountain_pose,
                navController = navController,
                route = Screen.LatihanSurya.route
            )
        }
    }
}

@Composable
@Preview
fun previewMenuLatihan(){
    YogaHinduTheme {
        LatihanYogaMenu(navController = rememberNavController())
    }
}
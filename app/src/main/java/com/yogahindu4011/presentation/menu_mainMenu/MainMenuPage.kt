@file:OptIn(ExperimentalMaterial3Api::class)

package com.yogahindu4011.presentation.menu_mainMenu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.yogahindu4011.presentation.common.MainAppTopBar
import com.yogahindu4011.presentation.menu_mainMenu.components.Greetings
import com.yogahindu4011.presentation.menu_mainMenu.components.MenuBelajarYoga
import com.yogahindu4011.presentation.menu_mainMenu.components.MenuLatihanYoga
import com.yogahindu4011.presentation.menu_mainMenu.components.MenuProgramPilihan
import com.yogahindu4011.presentation.menu_mainMenu.components.MenuTargetMingguan
import com.yogahindu4011.presentation.menu_mainMenu.components.MenuTotalLatihan
import com.yogahindu4011.ui.theme.YogaHinduTheme



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainMenuPage(
    navController: NavController
) {
    Scaffold(
        topBar = {
            MainAppTopBar()
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.background)
                .padding(it)
                .then(
                    Modifier
                        .padding(start = 24.dp, end = 14.dp)
                ),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.Start,
        ) {
            Greetings()
            MenuTargetMingguan(navController = navController)
            MenuBelajarYoga(navController = navController)
            MenuLatihanYoga(navController = navController)
            MenuProgramPilihan()
            MenuTotalLatihan()
        }
    }
}

@Composable
@Preview
fun Preview(){
    YogaHinduTheme {  MainMenuPage(navController = rememberNavController()) }

}
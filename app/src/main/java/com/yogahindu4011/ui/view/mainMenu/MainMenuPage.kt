@file:OptIn(ExperimentalMaterial3Api::class)

package com.yogahindu4011.ui.view.mainMenu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yogahindu4011.Greeting
import com.yogahindu4011.ui.theme.YogaHinduTheme
import com.yogahindu4011.ui.view.common.MainAppTopBar
import com.yogahindu4011.ui.view.mainMenu.components.Greetings
import com.yogahindu4011.ui.view.mainMenu.components.MenuBelajarYoga
import com.yogahindu4011.ui.view.mainMenu.components.MenuLatihanYoga
import com.yogahindu4011.ui.view.mainMenu.components.MenuTargetMingguan
import com.yogahindu4011.ui.view.mainMenu.components.MenuTotalLatihan

@Composable
@Preview
fun Preview(){
    YogaHinduTheme {  MainMenuPage() }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainMenuPage(
    bg: Color = MaterialTheme.colorScheme.background,
    )
{
    Scaffold(
        topBar = {
            MainAppTopBar()
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .then(
                    Modifier
                        .padding(start = 24.dp, end = 14.dp)
                ),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.Start,
        ) {
            Greetings()
            MenuTargetMingguan()
            MenuBelajarYoga()
            MenuLatihanYoga()
            MenuTotalLatihan()
        }
    }
}




/*
LazyColumn(
                verticalArrangement = Arrangement.spacedBy(5.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .padding(start = 24.dp, end = 14.dp)
            ) {
                item {
                    Greetings(modifier = Modifier.padding(top = 15.dp, end = 15.dp))
                }
                item {
                    MenuTargetMingguan(modifier = Modifier.padding(end = 10.dp))
                }
                item {
                    MenuBelajarYoga(modifier = Modifier.padding(end = 10.dp))
                }
                item {
                    MenuLatihanYoga(modifier = Modifier.padding(end = 10.dp))
                }
                item {
                    MenuTotalLatihan(modifier = Modifier.padding(end = 10.dp))
                }
            }

            */
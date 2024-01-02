package com.yogahindu4011.presentation.menu_latihanYoga.latihanView

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.yogahindu4011.R
import com.yogahindu4011.navigation.Screen
import com.yogahindu4011.presentation.common.longOutlineButton
import com.yogahindu4011.ui.theme.YogaHinduTheme

@Composable
fun FinishScreen(
    navController: NavController
){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.primary)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(45.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .width(315.dp)
                .align(Alignment.Center)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_award),
                contentDescription = "trophy",
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp)
            )

            Text(
                text = "SELAMAT\nLATIHAN TELAH SELESAI",
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.onPrimary,
                textAlign = TextAlign.Center
            )

            longOutlineButton(
                text = "SELESAI",
                onClick = {navController.navigate(route = Screen.MainMenu.route)}
            )
        }
    }
}

@Composable
@Preview
fun previewFinishScreen(){
    YogaHinduTheme {
        FinishScreen(navController = rememberNavController())
    }
}
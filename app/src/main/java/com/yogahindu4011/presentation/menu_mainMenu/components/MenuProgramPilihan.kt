package com.yogahindu4011.presentation.menu_mainMenu.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.yogahindu4011.R
import com.yogahindu4011.navigation.Screen
import com.yogahindu4011.ui.theme.YogaHinduTheme

@Composable
fun MenuProgramPilihan(navController: NavController,modifier: Modifier = Modifier){

    Column (
        verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .border(
                width = 1.dp,
                color = MaterialTheme.colorScheme.outline,
                shape = RoundedCornerShape(size = 5.dp)
            )
            .height(height = 288.dp)
            .fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.secondaryContainer)
            .padding(top = 10.dp ,start = 17.dp, bottom = 15.dp)
            .clickable {
                navController.navigate(route = Screen.LatihanSurya.route)
            }
    ) {
        Text(
            text = "PROGRAM LATIHAN PILIHAN",
            style = MaterialTheme.typography.labelLarge,
            color = MaterialTheme.colorScheme.onSecondaryContainer,
            modifier = Modifier
                .padding(bottom = 5.dp)
        )

        Text(
            text = "Surya Namaskara, 12 menit",
            style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Normal),
            color = MaterialTheme.colorScheme.onSecondaryContainer,
            modifier = Modifier
                .padding(bottom = 3.dp)
        )

        Text(
            text = "Level: Beginer ",
            style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Normal),
            color = MaterialTheme.colorScheme.onSecondaryContainer,
            modifier = Modifier
                .padding(bottom = 10.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.pict_stretch_pose),
            contentDescription = null,
            modifier = Modifier
                .size(200.dp)
        )
    }
}

@Preview
@Composable
fun prevTerpilih(){
    YogaHinduTheme {
        MenuProgramPilihan(navController = rememberNavController())
    }
}
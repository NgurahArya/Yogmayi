package com.yogahindu4011.presentation.menu_mainMenu.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun Greetings(modifier: Modifier = Modifier){
    Column (
        verticalArrangement = Arrangement.spacedBy(5.dp, Alignment.Top),
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(top = 15.dp, end = 15.dp)
    ){
        //ganti dynamic
        Text(
            text = "Selamat Pagi, Arya",
            style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
            color = MaterialTheme.colorScheme.onBackground,
        )
        Text(
            text = "Tetap Semangat!",
            style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold),
            color = MaterialTheme.colorScheme.primary,
        )
    }
}
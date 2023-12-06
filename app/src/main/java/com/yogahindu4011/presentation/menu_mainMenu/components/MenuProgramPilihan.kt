package com.yogahindu4011.presentation.menu_mainMenu.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.yogahindu4011.R

@Composable
fun MenuProgramPilihan(modifier: Modifier = Modifier){

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
            .padding(top = 10.dp ,start = 17.dp, bottom = 25.dp)
    ) {
        Text(
            text = "PROGRAM LATIHAN PILIHAN",
            style = MaterialTheme.typography.labelLarge,
            color = MaterialTheme.colorScheme.onSecondaryContainer,
            modifier = Modifier
                .padding(bottom = 5.dp)
        )
        //ganti dynamic
        Text(
            text = "Surya Namaskara, 12 mins",
            style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Normal),
            color = MaterialTheme.colorScheme.onSecondaryContainer,
            modifier = Modifier
                .padding(bottom = 12.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.ic_face_posture_sit),
            contentDescription = null,
            modifier = Modifier
                .width(194.dp)
                .height(194.dp)
        )
    }
}
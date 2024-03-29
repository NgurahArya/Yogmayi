package com.yogahindu4011.presentation.menu_mainMenu.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun MenuTotalLatihan(total: Int?, modifier: Modifier = Modifier){

    Row(
        horizontalArrangement = Arrangement.spacedBy(5.dp, Alignment.Start),
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .border(width = 1.dp, color = MaterialTheme.colorScheme.outline, shape = RoundedCornerShape(size = 5.dp))
            .height(height = 50.dp)
            .fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.secondaryContainer)
    ){

        /*Icon(
            painter = painterResource(id = R.drawable.ic_posture_stand),
            contentDescription = null,
            tint = MaterialTheme.colorScheme.onSecondaryContainer,
            modifier = Modifier
                .padding(start = 17.dp, end = 7.dp)
        )*/

        Text(
            text = "TOTAL LATIHAN",
            style = MaterialTheme.typography.labelLarge,
            color = MaterialTheme.colorScheme.onSecondaryContainer,
            modifier = Modifier
                .padding(start = 17.dp, end = 7.dp)
        )

        Spacer(modifier = Modifier.weight(1f))
        Column (
            verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(start = 17.dp)
        ){

            //ganti pakai data
            Text(
                text = "${total}",
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.onSecondaryContainer,
                modifier = Modifier
                    .padding(end = 9.dp)
            )
            Text(
            text = "latihan",
            style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.Normal),
            color = MaterialTheme.colorScheme.onSecondaryContainer,
            modifier = Modifier
                .padding(end = 9.dp)
            )
        }

    }
}

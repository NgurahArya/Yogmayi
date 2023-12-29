package com.yogahindu4011.presentation.menu_latihanYoga.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.yogahindu4011.R
import com.yogahindu4011.data.GerakanYoga

@Composable
fun listGerakan(
    gerakan: GerakanYoga
){
    Row (
        horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.Start),
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .clickable {
            }
            .height(height = 105.dp)
            .fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.background)
            .drawBehind {
                val strokeWidth = 1f
                val color = Color.Black
                val yOffset = size.height - strokeWidth
                drawLine(
                    color = color,
                    strokeWidth = strokeWidth,
                    start = Offset(0f, yOffset),
                    end = Offset(size.width, yOffset)
                )
            }
    ){
        Image(
            painter = painterResource(id = gerakan.imageUrl),
            contentDescription = null,
            modifier = Modifier
                .fillMaxHeight()
        )

        Spacer(modifier = Modifier.weight(1f))

        Row(
            horizontalArrangement = Arrangement.spacedBy(70.dp, Alignment.Start),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .padding(start = 16.dp, end = 16.dp)
        ) {
            Text(
                text = gerakan.namaGerakan,
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.onBackground,
            )
        }

        Spacer(modifier = Modifier .weight(1f))

        Icon(
            painter = painterResource(id = R.drawable.ic_arrow_right),
            contentDescription = "lihat detail",
            tint = MaterialTheme.colorScheme.onBackground
        )

    }
}

/*
@Preview
@Composable
fun listGerakanPrev(){
    YogaHinduTheme {
        val based = gerakan.first()
        listGerakan(gerakan = based, navController = rememberNavController())
    }
}*/

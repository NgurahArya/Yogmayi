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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.yogahindu4011.R
import com.yogahindu4011.data.GerakanYoga
import com.yogahindu4011.data.gerakan1
import com.yogahindu4011.data.gerakan2
import com.yogahindu4011.data.gerakan3
import com.yogahindu4011.data.gerakan4
import com.yogahindu4011.data.gerakan5
import com.yogahindu4011.data.gerakan6
import com.yogahindu4011.data.gerakan7
import com.yogahindu4011.navigation.Screen
import com.yogahindu4011.ui.theme.YogaHinduTheme

@Composable
fun listGerakan(
    gerakan: GerakanYoga,
    navController: NavController,
    route: String
){
    Row (
        horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.Start),
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .clickable {
                navController.navigate(route = route)
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

@Composable
fun listGerakanList1(
    navController: NavController
){
    listGerakan(gerakan1,navController,Screen.Detail1.route)
}

@Composable
fun listGerakanList2(
    navController: NavController
){
    listGerakan(gerakan2,navController,Screen.Detail2.route)
}

@Composable
fun listGerakanList3(
    navController: NavController
){
    listGerakan(gerakan3,navController,Screen.Detail3.route)
}

@Composable
fun listGerakanList4(
    navController: NavController
){
    listGerakan(gerakan4,navController,Screen.Detail4.route)
}

@Composable
fun listGerakanList5(
    navController: NavController
){
    listGerakan(gerakan5,navController,Screen.Detail5.route)
}

@Composable
fun listGerakanList6(
    navController: NavController
){
    listGerakan(gerakan6,navController,Screen.Detail6.route)
}

@Composable
fun listGerakanList7(
    navController: NavController
){
    listGerakan(gerakan7,navController,Screen.Detail7.route)
}

@Preview
@Composable
fun listListPrev(){
    YogaHinduTheme {
        listGerakanList1(navController = rememberNavController())
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

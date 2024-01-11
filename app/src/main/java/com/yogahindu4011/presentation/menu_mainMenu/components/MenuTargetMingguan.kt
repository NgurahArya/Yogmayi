package com.yogahindu4011.presentation.menu_mainMenu.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.yogahindu4011.R
import com.yogahindu4011.navigation.Screen
import com.yogahindu4011.presentation.common.shortOutlineButton
import com.yogahindu4011.ui.theme.YogaHinduTheme

@Composable
fun MenuTargetMingguan(
    target: Int,
    navController: NavController
){
    Row {
        Row(
            horizontalArrangement = Arrangement.spacedBy(5.dp, Alignment.Start),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clickable {
                    navController.navigate(route = Screen.TargetMingguan.route)
                }
                .border(
                    width = 1.dp,
                    color = MaterialTheme.colorScheme.outline,
                    shape = RoundedCornerShape(size = 5.dp)
                )
                .height(height = 60.dp)
                .background(color = MaterialTheme.colorScheme.secondaryContainer)
        ) {

            Column(
                verticalArrangement = Arrangement.spacedBy(5.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.Start,
            )
            {

                Text(
                    text = "TARGET MINGGUAN",
                    style = MaterialTheme.typography.labelLarge,
                    color = MaterialTheme.colorScheme.onSecondaryContainer,
                    modifier = Modifier
                        .padding(start = 11.dp)
                )

                Text(
                    text = "$target latihan Yoga lagi",
                    style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Medium),
                    color = MaterialTheme.colorScheme.onSecondaryContainer,
                    modifier = Modifier
                        .padding(start = 11.dp)
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            Image(
                painter = painterResource(R.drawable.ic_target),
                contentDescription = null,
                modifier = Modifier
                    .padding(end = 10.dp, top = 10.dp, bottom = 10.dp)
            )

        }

    }
}

@Composable
fun MenuTargetMingguanEmpty(
    navController: NavController
){
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .border(
                width = 1.dp,
                color = MaterialTheme.colorScheme.outline,
                shape = RoundedCornerShape(size = 5.dp)
            )
            .fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.secondaryContainer)
    ) {
        Image(
            painter = painterResource(R.drawable.ic_target),
            contentDescription = null,
            modifier = Modifier
                .size(50.dp)
                .padding(top = 10.dp, bottom = 5.dp)
        )

        Text(
            text = "Latihan Yoga secara reguler memilki banyak manfaat. Tetapkan target mingguan untuk membantu anda membangun kebiasaan baik.",
            style = MaterialTheme.typography.labelSmall,
            color = MaterialTheme.colorScheme.onSecondaryContainer,
            textAlign = TextAlign.Center
        )

        Column(
            modifier = Modifier
                .padding(bottom = 10.dp)
        ){
            shortOutlineButton(
                "TETAPKAN TARGET",
                {navController.navigate(route = Screen.TargetMingguan.route)}
            )
        }


    }
}


@Preview
@Composable
fun PrevTargetMingguan (){
    YogaHinduTheme {
        MenuTargetMingguan(3, navController = rememberNavController())
    }
}

@Preview
@Composable
fun PrevTargetMingguan2 (){
    YogaHinduTheme {
        MenuTargetMingguanEmpty(navController = rememberNavController() )
    }
}
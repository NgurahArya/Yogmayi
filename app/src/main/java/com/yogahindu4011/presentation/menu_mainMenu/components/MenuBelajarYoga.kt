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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.yogahindu4011.R
import com.yogahindu4011.navigation.Screen

@Composable
fun MenuBelajarYoga(
    navController: NavController
) {
    Row {
        Row(
            horizontalArrangement = Arrangement.spacedBy(5.dp, Alignment.Start),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clickable {
                    navController.navigate(route = Screen.BelajarYoga.route)
                }
                .border(
                    width = 1.dp,
                    color = MaterialTheme.colorScheme.outline,
                    shape = RoundedCornerShape(size = 5.dp)
                )
                .height(height = 112.dp)
                .fillMaxWidth()
                .background(color = MaterialTheme.colorScheme.secondaryContainer)
        ) {
            Column (
                verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .padding(start = 17.dp)
            ) {
                Text(
                    text = "MULAI BELAJAR YOGA",
                    style = MaterialTheme.typography.labelLarge,
                    color = MaterialTheme.colorScheme.onSecondaryContainer,
                    modifier = Modifier
                )
                Text(
                    text = "3 MATERI",
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.onSecondaryContainer,
                    modifier = Modifier
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            Image(
                painter = painterResource(id = R.drawable.ic_booksvariant),
                contentDescription = null,
                modifier = Modifier
                    .padding(end = 9.dp)
                    .width(46.dp)
                    .height(50.dp)
                )
        }
    }
}


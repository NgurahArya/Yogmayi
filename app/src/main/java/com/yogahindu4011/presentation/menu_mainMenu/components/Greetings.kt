package com.yogahindu4011.presentation.menu_mainMenu.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
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
fun Greetings(
    name: String,
    onTitleClick: (() -> Unit)? = null,
    modifier: Modifier = Modifier){
    Column (
        verticalArrangement = Arrangement.spacedBy(5.dp, Alignment.Top),
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(top = 15.dp, end = 15.dp)
            .clickable { onTitleClick?.invoke() }
    ){
        Row {
            Text(
                text = "${name}",
                style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                color = MaterialTheme.colorScheme.onBackground,
            )
            Icon(
                painter = painterResource(R.drawable.ic_edit),
                contentDescription = "edit nama"
            )
        }
        Text(
            text = "Tetap Semangat!",
            style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold),
            color = MaterialTheme.colorScheme.primary,
        )
    }
}
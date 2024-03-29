package com.yogahindu4011.presentation.common

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun shortButton(
    text: String,
    onClick: () -> Unit,
){
    Button(
        onClick = {onClick()},
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = Color.White
        )
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold)
        )

    }
}

@Composable
fun shortOutlineButton(
    text: String,
    onClick: () -> Unit,
){
    Button(
        onClick = {onClick()},
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            contentColor = MaterialTheme.colorScheme.primary
        ),
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold)
        )

    }
}

@Composable
fun longButton(
    text: String,
    onClick: () -> Unit
){
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = Color.White
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(35.dp)
            .clip(RoundedCornerShape(5.dp))

    ) {
        Text(
            text = text,
            modifier = Modifier
                .fillMaxHeight()
                .align(Alignment.CenterVertically)
        )

    }
}

@Composable
fun longOutlineButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
){
    OutlinedButton(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            contentColor = MaterialTheme.colorScheme.primary
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(34.dp)

    ) {
        Text(
            text = text
        )

    }
}
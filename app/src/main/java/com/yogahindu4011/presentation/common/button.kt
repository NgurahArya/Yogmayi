package com.yogahindu4011.presentation.common

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yogahindu4011.ui.theme.YogaHinduTheme

@Composable
fun shortButton(
    text: String,
    onClick: () -> Unit
){
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = Color.White
        )
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelSmall
        )

    }
}

@Composable
fun longButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
){
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = Color.White
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
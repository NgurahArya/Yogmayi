package com.yogahindu4011.presentation.menu_targetMingguan.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yogahindu4011.R
import com.yogahindu4011.ui.theme.YogaHinduTheme

@Composable
fun targetCounter(
    modifier: Modifier = Modifier
){
    var count by remember { mutableStateOf(3) }

    fun decrement(){
        if(count > 0){
            count--
        }
    }

    fun increment(){
        if(count < 7) {
            count++
        }
    }

    Row (
        horizontalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
    ){
        minusButton(count, { decrement() })

        Text(
            text = "$count " + "kali/minggu",
            style = MaterialTheme.typography.labelSmall,
            color = MaterialTheme.colorScheme.onBackground
        )

        plusButton (count, {increment()})
    }
}

@Composable
fun minusButton(counter: Int, onClick: () -> Unit) {

    SmallFloatingActionButton(
        onClick = {
            if (counter > 0) {
                onClick()
            }
        },
        containerColor = MaterialTheme.colorScheme.surface,
        contentColor = if (counter > 0) MaterialTheme.colorScheme.onPrimaryContainer else Color.Gray
    ) {
        Icon(
            painterResource(id = R.drawable.ic_minus_circle),
            contentDescription = null,
            modifier = Modifier
                .height(35.dp)
                .width(35.dp)
        )
    }
}

@Composable
fun plusButton(counter: Int, onClick: () -> Unit) {

    SmallFloatingActionButton(
        onClick = {
            if (counter <= 7) {
                onClick()
            }
        },
        containerColor = MaterialTheme.colorScheme.surface,
        contentColor = if (counter < 7) MaterialTheme.colorScheme.onPrimaryContainer else Color.Gray
    ) {
        Icon(
            painterResource(id = R.drawable.ic_plus_circle),
            contentDescription = null,
            modifier = Modifier
                .height(35.dp)
                .width(35.dp)
        )
    }
}


@Composable
@Preview(showBackground = true)
fun counterPrev(){
    YogaHinduTheme {
        targetCounter()
    }
}

package com.ciscomardev.to_do

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun HomeScreen(onClick: () -> Unit, onClick2: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Sei nella homeScreen", color = Color.White)
        Button(onClick = onClick) {
            Text(text = "Vai alla DetailScreen 1")
        }

        Button(onClick = onClick2) {
            Text(text = "Vai alla DetailScreen 2")
        }
    }
}

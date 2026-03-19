package com.example.composecarrot.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun FloatingButton(onClick: () -> Unit) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(RoundedCornerShape(50))
            .background(Color(0xffff6e10))
    ) {
        Row(modifier = Modifier.padding(vertical = 12.dp, horizontal = 14.dp)) {
            Icon(
                imageVector = Icons.Filled.Add,
                tint = Color.White,
                contentDescription = "Floating action button.",
            )
            Text(text = "글쓰기", color = Color.White, fontWeight = FontWeight.Bold)
        }
    }
}
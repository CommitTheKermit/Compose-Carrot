package com.example.composecarrot.ui.tagList

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.composecarrot.R

@Composable
fun RefreshButton(modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(CircleShape)
            .border(
                color = Color(0xffEAEBEF),
                width = 1.dp,
                shape = CircleShape,
            ).size(34.dp),

    ) {
        Image(
            painter = painterResource(R.drawable.ic_reset),
            contentDescription = "새로고침",
        )
    }
}

package com.example.composecarrot

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun AreaComboBox(modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            "가락2동",
            fontSize = 24.sp,
            fontFamily = FontFamily(Font(R.font.pretendard_extrabold, FontWeight.W800)),
        )
        Image(
            painter = painterResource(id = R.drawable.ic_direction_down),
            contentDescription = "동네 확장 화살표 아이콘",
        )
    }
}

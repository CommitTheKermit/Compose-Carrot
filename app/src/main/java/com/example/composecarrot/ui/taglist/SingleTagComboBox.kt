package com.example.composecarrot.ui.taglist

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.composecarrot.R

@Composable
fun SingleTagComboBox(
    modifier: Modifier = Modifier,
    content: String,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .clip(RoundedCornerShape(50.dp))
            .border(
                color = Color(0xffEAEBEF),
                width = 1.dp,
                shape = RoundedCornerShape(50.dp),
            )
            .height(34.dp)
            .padding(horizontal = 11.dp),
    ) {
        Text(
            text = content,
            fontFamily =
                FontFamily(Font(R.font.pretendard_medium, FontWeight.W500)),
        )
        Spacer(modifier = Modifier.width(5.dp))
        Image(
            painter = painterResource(R.drawable.ic_direction_down),
            contentDescription = "태그 확장",
            modifier = Modifier.size(18.dp),
        )
    }
}

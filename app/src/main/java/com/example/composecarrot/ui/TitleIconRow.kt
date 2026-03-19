package com.example.composecarrot.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.composecarrot.R

@Composable
fun TitleIconRow(modifier: Modifier = Modifier) {
    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        Image(
            painter = painterResource(id = R.drawable.ic_search),
            contentDescription = "타이틀 로우 검색 아이콘",
            modifier = Modifier.size(28.dp),
        )
        Image(
            painter = painterResource(id = R.drawable.ic_menu_hamburger),
            contentDescription = "타이틀 로우 메뉴 아이콘",
            modifier = Modifier.size(28.dp),
        )
        Image(
            painter = painterResource(id = R.drawable.ic_notification_lg),
            contentDescription = "타이틀 로우 알림 아이콘",
            modifier = Modifier.size(28.dp),
        )
    }
}

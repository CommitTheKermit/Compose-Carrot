package com.example.composecarrot.ui

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecarrot.model.BottomNavItem

@Composable
fun BottomNavigationBar(navItems: List<BottomNavItem>) {
    var currentIndex: Int by remember { mutableIntStateOf(0) }
    NavigationBar(
        containerColor = Color.White,
        modifier = Modifier
            .drawBehind {
                drawLine(
                    color = Color(0xFFE0E0E0),
                    start = Offset(0f, 0f),
                    end = Offset(size.width, 0f),
                    strokeWidth = 1.dp.toPx()
                )
            }
    ) {
        navItems.forEach {
            NavigationBarItem(
                selected = it.index == currentIndex,
                onClick = {
                    currentIndex = it.index
                },
                icon = {
                    Icon(
                        painterResource(it.iconId), contentDescription = it.label,
                        tint =
                            if (it.index == currentIndex) Color.Black else Color.Black,
                    )
                },
                label = {
                    Text(
                        text = it.label,
                        fontWeight = if (it.index == currentIndex) FontWeight.Bold else null,
                        fontSize = 11.sp
                    )
                },
                colors = NavigationBarItemColors(
                    selectedIconColor = Color.Black,
                    selectedTextColor = NavigationBarItemDefaults.colors().selectedTextColor,
                    selectedIndicatorColor = Color.Transparent,
                    unselectedIconColor = Color.Transparent,
                    unselectedTextColor = NavigationBarItemDefaults.colors().unselectedTextColor,
                    disabledIconColor = NavigationBarItemDefaults.colors().disabledIconColor,
                    disabledTextColor = NavigationBarItemDefaults.colors().disabledTextColor
                ),

                )
        }

    }
}

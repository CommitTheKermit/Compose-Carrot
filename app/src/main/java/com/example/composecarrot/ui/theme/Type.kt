package com.example.composecarrot.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.composecarrot.R

val Pretendard = FontFamily(
    Font(R.font.pretendard_thin, FontWeight.Thin),
    Font(R.font.pretendard_extralight, FontWeight.ExtraLight),
    Font(R.font.pretendard_light, FontWeight.Light),
    Font(R.font.pretendard_regular, FontWeight.Normal),
    Font(R.font.pretendard_medium, FontWeight.Medium),
    Font(R.font.pretendard_semibold, FontWeight.SemiBold),
    Font(R.font.pretendard_bold, FontWeight.Bold),
    Font(R.font.pretendard_extrabold, FontWeight.ExtraBold),
    Font(R.font.pretendard_black, FontWeight.Black),
)

private val defaultTextStyle = TextStyle(fontFamily = Pretendard)

val Typography = Typography(
    displayLarge = Typography().displayLarge.merge(defaultTextStyle),
    displayMedium = Typography().displayMedium.merge(defaultTextStyle),
    displaySmall = Typography().displaySmall.merge(defaultTextStyle),
    headlineLarge = Typography().headlineLarge.merge(defaultTextStyle),
    headlineMedium = Typography().headlineMedium.merge(defaultTextStyle),
    headlineSmall = Typography().headlineSmall.merge(defaultTextStyle),
    titleLarge = Typography().titleLarge.merge(defaultTextStyle),
    titleMedium = Typography().titleMedium.merge(defaultTextStyle),
    titleSmall = Typography().titleSmall.merge(defaultTextStyle),
    bodyLarge = Typography().bodyLarge.merge(defaultTextStyle),
    bodyMedium = Typography().bodyMedium.merge(defaultTextStyle),
    bodySmall = Typography().bodySmall.merge(defaultTextStyle),
    labelLarge = Typography().labelLarge.merge(defaultTextStyle),
    labelMedium = Typography().labelMedium.merge(defaultTextStyle),
    labelSmall = Typography().labelSmall.merge(defaultTextStyle),
)
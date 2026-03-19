package com.example.composecarrot.ui

import TagList
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composecarrot.R
import com.example.composecarrot.model.Product
import com.example.composecarrot.model.ProductStatus
import com.example.composecarrot.ui.theme.ComposeCarrotTheme

@Composable
fun ProductListScreen(modifier: Modifier = Modifier) {
    val productList =
        listOf(
            Product(
                imageId = R.drawable.img_list_home_1,
                productTitle = "산산기어 스웻집업(마지막가격)",
                distance = 3.4,
                address = "위례동",
                timePast = "15분 전",
                price = "70,000",
                likes = 8,
            ),
            Product(
                imageId = R.drawable.img_list_home_2,
                productTitle = "브라운야드 니트 브라운 2사이즈",
                address = "가락본동",
                timePast = "6시간 전",
                price = "40,000",
                likes = 4,
            ),
            Product(
                imageId = R.drawable.img_list_home_3,
                productTitle = "M) 코튼 리브드 크루 넥 니트  미디엄 그레이",
                distance = 1.9,
                address = "정자동",
                timePast = "1시간 전",
                price = "20,000",
                likes = 1,
            ),
            Product(
                imageId = R.drawable.img_list_home_4,
                productTitle = "렉토 맨투맨",
                address = "장지동",
                timePast = "5시간 전",
                price = "70,000",
                likes = 0,
            ),
            Product(
                imageId = R.drawable.img_list_home_5,
                productTitle = "띠어리 트러커자켓 (s)",
                address = "잠실3동",
                timePast = "3시간 전",
                price = "90,000",
                likes = 5,
                status = ProductStatus.RESERVED
            ),
            Product(
                imageId = R.drawable.img_list_home_6,
                productTitle = "스트라이다 자전거 18인치 블랙",
                distance = 3.5,
                address = "위례동",
                timePast = "31분 전",
                price = "35만",
                likes = 1,
            ),
        )

    Scaffold(
        modifier = modifier,
        containerColor = Color.White,
        floatingActionButton = { FloatingButton { } },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 16.dp)
                .padding(top = 43.dp),

            ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth(),
            ) {
                AreaComboBox()
                TitleIconRow()
            }
            Spacer(modifier = Modifier.height(27.dp))
            TagList()
            LazyColumn {
                items(productList.size) { index ->
                    if (index > 0) HorizontalDivider(
                        color = Color(0xfff4f5f7),
                        thickness = 1.dp
                    )
                    SingleProductCard(productInfo = productList[index])
                }
            }
        }
    }
}

@Preview(heightDp = 1000, widthDp = 412)
@Composable
private fun ProductListScreenPreview() {
    ComposeCarrotTheme {
        ProductListScreen()
    }
}

package com.example.composecarrot.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.composecarrot.ui.theme.ReservedGreen
import com.example.composecarrot.ui.theme.TextGray
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecarrot.R
import com.example.composecarrot.model.Product
import com.example.composecarrot.model.ProductStatus

@Composable
fun SingleProductCard(
    modifier: Modifier = Modifier,
    productInfo: Product,
) {
    Row(
        verticalAlignment = Alignment.Top,
        modifier = Modifier
            .height(142.dp)
            .padding(vertical = 17.dp)
            .fillMaxWidth()
    ) {
        Image(
            painterResource(productInfo.imageId),
            contentDescription = "상품 이미지",
            modifier = Modifier.size(108.dp)
        )
        Spacer(modifier = Modifier.width(17.dp))
        Column(
            verticalArrangement = Arrangement.spacedBy(2.dp),
            modifier = Modifier
                .width(223.dp)
        )
        {
            Spacer(modifier.height(2.dp))
            Text(
                productInfo.productTitle,
                fontSize = 17.sp,
                fontWeight = FontWeight.Medium,
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp)

            ) {
                if (productInfo.distance != null) {
                    Row(verticalAlignment = Alignment.CenterVertically) {

                        Spacer(modifier = Modifier.width(1.dp))
                        Image(
                            painterResource(R.drawable.ic_location),
                            contentDescription = "거리 아이콘"
                        )
                        Text(
                            text = "${productInfo.distance}km",
                            fontSize = 14.sp,
                            color = TextGray,
                            fontWeight = FontWeight.Normal,
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "·",
                            fontSize = 14.sp,
                            color = TextGray,
                            fontWeight = FontWeight.Normal,
                        )
                    }
                }


                Text(
                    text = productInfo.address,
                    fontSize = 14.sp,
                    color = TextGray,
                    fontWeight = FontWeight.Normal,
                )
                Text(
                    text = "·",
                    fontSize = 14.sp,
                    color = TextGray,
                    fontWeight = FontWeight.Normal,
                )
                Text(
                    text = productInfo.timePast,
                    fontSize = 14.sp,
                    color = TextGray,
                    fontWeight = FontWeight.Normal,
                )
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                if (productInfo.status == ProductStatus.RESERVED) Text(
                    "예약중",
                    fontSize = 11.sp,
                    lineHeight = 11.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(end = 3.dp)
                        .background(
                            color = ReservedGreen,
                            shape = RoundedCornerShape(3.dp)
                        )
                        .padding(horizontal = 4.dp, vertical = 3.dp)
                )
                Text(
                    text = "${productInfo.price}원",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 17.sp,
                )
            }

        }
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.End,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),

            ) {
            Image(
                painterResource(R.drawable.ic_menu_kebab_gray),
                contentDescription = "상품 메뉴"
            )
            if (productInfo.likes > 0) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painterResource(R.drawable.ic_like_sm),
                        contentDescription = "상품 좋아요"
                    )
                    Text(
                        text = productInfo.likes.toString(),
                        fontSize = 14.sp,
                        color = TextGray
                    )
                }
            }

        }
    }
}
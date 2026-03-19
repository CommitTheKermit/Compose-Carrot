package com.example.composecarrot.model

class Product(
    val imageId: Int,
    val productTitle: String,
    val distance: Double? = null,
    val address: String,
    val timePast: String,
    val price: String,
    val likes: Int,
    val status: ProductStatus = ProductStatus.NORMAL
) {


}
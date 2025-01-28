package com.lloppy.pizzashift.catalog.domain.entity

import kotlinx.serialization.Serializable

@Serializable
data class PizzaDough(
    val name: String,
    val price: Int
)

enum class PizzaDoughName{
    THIN, THICK
}
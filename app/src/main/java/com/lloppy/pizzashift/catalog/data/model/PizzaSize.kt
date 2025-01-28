package com.lloppy.pizzashift.catalog.data.model

import kotlinx.serialization.Serializable

@Serializable
data class PizzaSize(
    val name: PizzaSizeName,
    val price: Int
)

enum class PizzaSizeName{
    SMALL, MEDIUM, LARGE
}
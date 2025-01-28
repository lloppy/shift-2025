package com.lloppy.pizzashift.catalog.domain.entity

data class PizzaItem(
    val id: Long,
    val name: String,
    val description: String,
    val img: String,
    val calories: Int,
)
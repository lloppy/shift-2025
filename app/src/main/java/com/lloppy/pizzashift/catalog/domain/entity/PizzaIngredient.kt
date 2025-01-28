package com.lloppy.pizzashift.catalog.domain.entity

import kotlinx.serialization.Serializable

@Serializable
data class PizzaIngredient(
    val name: PizzaIngredientName,
    val cost: Int,
    val img: String
)

enum class PizzaIngredientName{
    PINEAPPLE, MOZZARELLA, PEPERONI, GREEN_PEPPER, MUSHROOMS, BASIL, CHEDDAR, PARMESAN, FETA, HAM, PICKLE, TOMATO, BACON, ONION, CHILE, SHRIMPS, CHICKEN_FILLET, MEATBALLS
}

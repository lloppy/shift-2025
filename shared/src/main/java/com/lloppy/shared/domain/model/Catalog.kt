package com.lloppy.shared.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Catalog(
    val id: String,
    val name: String,
    val ingredients: List<PizzaIngredient>,
    val toppings: List<PizzaIngredient>,
    val description: String,
    val sizes: List<PizzaSize>,
    val doughs: List<PizzaDough>,
    val calories: Long,
    val protein: String,
    val totalFat: String,
    val carbohydrates: String,
    val sodium: String,
    val allergens: List<String>,
    val isVegetarian: Boolean,
    val isGlutenFree: Boolean,
    val isNew: Boolean,
    val isHit: Boolean,
    val img: String
)

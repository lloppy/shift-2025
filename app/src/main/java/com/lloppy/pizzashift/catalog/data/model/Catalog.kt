package com.lloppy.pizzashift.catalog.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Catalog (
    val id: String,
    val name: String,
    val ingredients: List<Ingredient>,
    val toppings: List<Ingredient>,
    val description: String,
    val sizes: List<Dough>,
    val doughs: List<Dough>,
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

@Serializable
data class Dough (
    val name: String,
    val price: Long
)

@Serializable
data class Ingredient (
    val name: String,
    val cost: Long,
    val img: String
)

package com.lloppy.pizzashift.catalog.domain.entity

import com.lloppy.pizzashift.catalog.data.model.PizzaDough
import com.lloppy.pizzashift.catalog.data.model.PizzaIngredient
import com.lloppy.pizzashift.catalog.data.model.PizzaSize
import kotlinx.serialization.Serializable

data class PizzaItem(
    val id: Long,
    val name: String,
    val ingredients: List<PizzaIngredient>,
    val toppings: List<PizzaIngredient>,
    val description: String,
    val sizes: List<PizzaSize>,
    val doughs: List<PizzaDough>,
    val calories: Int,
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

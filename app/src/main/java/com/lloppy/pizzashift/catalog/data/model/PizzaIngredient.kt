package com.lloppy.pizzashift.catalog.data.model

import kotlinx.serialization.Serializable

@Serializable
data class PizzaIngredient(
    val name: PizzaIngredientName,
    val cost: Int,
    val img: String
)

enum class PizzaIngredientName{
    PINEAPPLE, MOZZARELLA, PEPERONI, GREEN_PEPPER, MUSHROOMS, BASIL, CHEDDAR, PARMESAN, FETA, HAM, PICKLE, TOMATO, BACON, ONION, CHILE, SHRIMPS, CHICKEN_FILLET, MEATBALLS;

    override fun toString(): String {
        return when (this) {
            PINEAPPLE -> "Ананас"
            MOZZARELLA -> "Моцарелла"
            PEPERONI -> "Пепперони"
            GREEN_PEPPER -> "Зеленый перец"
            MUSHROOMS -> "Грибы"
            BASIL -> "Базилик"
            CHEDDAR -> "Чеддер"
            PARMESAN -> "Пармезан"
            FETA -> "Фета"
            HAM -> "Ветчина"
            PICKLE -> "Огурец"
            TOMATO -> "Помидор"
            BACON -> "Бекон"
            ONION -> "Лук"
            CHILE -> "Перец чили"
            SHRIMPS -> "Креветки"
            CHICKEN_FILLET -> "Куриное филе"
            MEATBALLS -> "Мясные шарики"
        }
    }
}

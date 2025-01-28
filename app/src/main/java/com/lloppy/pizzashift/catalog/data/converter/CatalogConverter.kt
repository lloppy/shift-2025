package com.lloppy.pizzashift.catalog.data.converter

import com.lloppy.pizzashift.catalog.data.model.Catalog
import com.lloppy.pizzashift.catalog.domain.entity.PizzaItem

class CatalogConverter {
    fun convert(model: Catalog): PizzaItem =
        PizzaItem(
            id = model.id.toLong(),
            name = model.name,
            ingredients = model.ingredients,
            toppings = model.toppings,
            description = model.description,
            sizes = model.sizes,
            doughs = model.doughs,
            calories = model.calories.toInt(),
            protein = model.protein,
            totalFat = model.totalFat,
            carbohydrates = model.carbohydrates,
            sodium = model.sodium,
            allergens = model.allergens,
            isVegetarian = model.isVegetarian,
            isGlutenFree = model.isGlutenFree,
            isNew = model.isNew,
            isHit = model.isHit,
            img = model.img
        )
}
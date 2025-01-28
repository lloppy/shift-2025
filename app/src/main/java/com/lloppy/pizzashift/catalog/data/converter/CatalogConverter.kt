package com.lloppy.pizzashift.catalog.data.converter

import com.lloppy.pizzashift.catalog.data.model.Catalog
import com.lloppy.pizzashift.catalog.domain.entity.Pizza
import com.lloppy.pizzashift.catalog.domain.entity.PizzaItem

class CatalogConverter {
    fun convert(model: Catalog): PizzaItem =
        PizzaItem(
            id = model.id.toLong(),
            name = model.name,
            description = model.description,
            img = model.img,
            calories = model.calories.toInt()
    )
}
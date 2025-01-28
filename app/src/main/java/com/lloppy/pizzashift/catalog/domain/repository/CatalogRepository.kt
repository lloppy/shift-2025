package com.lloppy.pizzashift.catalog.domain.repository

import com.lloppy.pizzashift.catalog.domain.entity.PizzaItem

interface CatalogRepository {
    suspend fun getAll(): List<PizzaItem>
}
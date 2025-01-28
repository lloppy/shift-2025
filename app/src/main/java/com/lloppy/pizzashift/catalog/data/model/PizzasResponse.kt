package com.lloppy.pizzashift.catalog.data.model

import com.lloppy.pizzashift.catalog.domain.entity.Pizza
import kotlinx.serialization.Serializable

@Serializable
data class PizzasResponse(
    val success: Boolean,
    val reason: String? = null,
    val catalog: List<Catalog>
)

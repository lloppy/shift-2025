package com.lloppy.pizzashift.catalog.data.model

import kotlinx.serialization.Serializable

@Serializable
data class PizzasResponse(
    val success: Boolean,
    val reason: String? = null,
    val catalog: List<Catalog>
)

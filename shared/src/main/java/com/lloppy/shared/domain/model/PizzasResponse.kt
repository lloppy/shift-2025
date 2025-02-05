package com.lloppy.shared.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class PizzasResponse(
    val success: Boolean,
    val reason: String? = null,
    val catalog: List<Catalog>
)

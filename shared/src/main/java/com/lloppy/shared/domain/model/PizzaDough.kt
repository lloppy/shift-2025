package com.lloppy.shared.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class PizzaDough(
    val name: PizzaDoughName,
    val price: Int
)

enum class PizzaDoughName {
    THIN, THICK
}
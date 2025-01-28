package com.lloppy.pizzashift.catalog.ui

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.lloppy.pizzashift.catalog.domain.entity.PizzaItem


@Composable
fun ContentComponent(
    pizzas: List<PizzaItem>,
    onItemClicked: (loanId: Long) -> Unit,
) {
    LazyColumn(modifier = Modifier.fillMaxHeight()) {
        items(pizzas) { pizza ->
            CatalogItem(
                pizza,
                onItemClicked = { onItemClicked(pizza.id) }
            )
        }
    }
}


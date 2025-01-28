package com.lloppy.pizzashift.catalog.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.lloppy.pizzashift.catalog.domain.entity.PizzaItem

@Composable
fun CatalogItem(
    pizza: PizzaItem,
    onItemClicked: () -> Unit
) {
    Column (
        Modifier
            .fillMaxWidth()
            .clickable(onClick = onItemClicked)
            .padding(vertical = 8.dp, horizontal = 16.dp)
    ) {
        Text(text = pizza.name)
        Text(text = pizza.description)
        Text(text = pizza.img)

    }

}
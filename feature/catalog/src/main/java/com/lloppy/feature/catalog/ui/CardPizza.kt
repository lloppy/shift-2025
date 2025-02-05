package com.lloppy.feature.catalog.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.lloppy.shared.domain.entity.PizzaItem

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun CardPizza(
    pizza: PizzaItem,
    onItemClicked: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp)
            .clickable(onClick = onItemClicked)
            .padding(16.dp)
    ) {
        GlideImage(
            model = pizza.img,
            contentDescription = pizza.name,
            modifier = Modifier.size(150.dp)
        )

        Spacer(modifier = Modifier.width(16.dp))

        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize().padding(top = 8.dp, end = 8.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = pizza.name,
                style = MaterialTheme.typography.headlineMedium
            )

            Text(
                text = pizza.description,
                style = MaterialTheme.typography.bodySmall

            )

            Text(
                text = "от ${pizza.sizes.first().price} ₽",
                style = MaterialTheme.typography.headlineMedium
            )
        }
    }
}



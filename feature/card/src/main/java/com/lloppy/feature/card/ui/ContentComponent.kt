package com.lloppy.feature.card.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.lloppy.shared.domain.entity.PizzaItem

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun ContentComponent(innerPadding: PaddingValues) {
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .padding(innerPadding),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
//            GlideImage(
//                model = pizza.img,
//                contentDescription = pizza.name,
//                modifier = Modifier.size(170.dp)
//            )
        }

        item{
//            PizzaInfo(pizza)
        }

    }
}

@Composable
fun PizzaInfo(pizza: PizzaItem) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = pizza.name,
            style = MaterialTheme.typography.bodyMedium
        )

        Text(
            text = "${pizza.sizes.first().name.name} см, ${pizza.doughs.first().name}",
            style = MaterialTheme.typography.bodyMedium
        )

        Text(
            text = pizza.ingredients.map { it.name.toRussian()  }.toString(),
            style = MaterialTheme.typography.titleSmall
        )


    }
}
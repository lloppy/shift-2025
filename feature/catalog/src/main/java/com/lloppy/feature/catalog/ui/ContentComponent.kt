package com.lloppy.feature.catalog.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.lloppy.feature.catalog.R
import com.lloppy.shared.domain.entity.PizzaItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContentComponent(
    pizzas: List<PizzaItem>,
    onItemClicked: (pizzaItem: PizzaItem) -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.White,
                    titleContentColor = Color.Black,
                ),
                title = {
                    Text(text = stringResource(id = R.string.pizza))
                }
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            items(pizzas) { pizza ->
                CardPizza(
                    pizza,
                    onItemClicked = { onItemClicked(pizza) }
                )
            }
        }
    }
}


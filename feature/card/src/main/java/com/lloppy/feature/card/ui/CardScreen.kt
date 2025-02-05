package com.lloppy.feature.card.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import com.lloppy.feature.card.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardScreen(pizzaId: Long, navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.White,
                    titleContentColor = Color.Black,
                ),
                title = {
                    Text(text = stringResource(id = R.string.pizza))
                },
                navigationIcon = { Icons.Default.KeyboardArrowLeft },
                actions = { navController.popBackStack() }
            )
        }
    ) { innerPadding ->
        ContentComponent(innerPadding)
    }
}
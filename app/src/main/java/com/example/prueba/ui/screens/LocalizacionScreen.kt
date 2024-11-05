package com.example.prueba.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.prueba.navigation.NavManager
import com.example.prueba.ui.theme.PruebaTheme

import com.example.prueba.viewModel.SearchViewModel

@Composable
fun LocalizacionScreen(viewModel: SearchViewModel) {
    PruebaTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            NavManager(viewModel)
        }
    }
}
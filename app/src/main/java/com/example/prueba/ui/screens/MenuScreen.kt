package com.example.prueba.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.composable

@Composable
fun MenuScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "This is the Menu Screen")
        Button(onClick = { navController.navigate("component") }) {
            Text("Go to Home")

        }
        //expo 1
        Button(onClick = { navController.navigate("SegundoPlano") }) {
            Text("Go to alarm")
        }
        //expo 2
        Button(onClick = { navController.navigate("Localizacion") }) {
            Text("Go to localizacion")
        }
        //expo 3
        Button(onClick = { navController.navigate("ContactCalendar") }) {
            Text("Go to ContactCalendar")
        }

    }
}
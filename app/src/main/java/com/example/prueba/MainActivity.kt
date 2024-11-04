package com.example.prueba

import android.graphics.Picture
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.prueba.navigation.NavManager
import com.example.prueba.ui.screens.HomeScreen
import com.example.prueba.ui.screens.MenuScreen
import com.example.prueba.ui.screens.ComponentsScreen
import com.example.prueba.ui.screens.LoginScreen
import com.example.prueba.viewModel.SearchViewModel
import com.example.prueba.ui.theme.MapasTheme


//exposicion 2
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Instancia del ViewModel
        val viewModel: SearchViewModel by viewModels()
        enableEdgeToEdge()
        setContent {
            MapasTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavManager(viewModel)
                }
            }
        }
    }


//codigo por defecto
    @Preview(showBackground = true)
    @Composable
    fun ComposeMultiScreenApp() {
        val navController = rememberNavController()
        Surface(color = Color.White) {
            SetupNavGraph(navController = navController)
        }
    }

    @Composable
    fun SetupNavGraph(navController: NavHostController) {
        NavHost(navController = navController, startDestination = "Login") {
            composable("menu") { MenuScreen(navController) }
            composable("home") { HomeScreen(navController) }
            composable("component") { ComponentsScreen(navController) }
            composable("Login") { LoginScreen(navController) }
            composable("Login") { LoginScreen(navController) }
            composable("Google") { NavManager(viewModel()) }
        }

    }
}
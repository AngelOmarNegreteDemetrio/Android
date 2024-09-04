package com.example.prueba

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.prueba.ui.theme.PruebaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
     //Layouts
            Column {
                Text(text = "First Row")
                Text(text = "Second Row")
                Text(text = "Third Row")

                Row{
                    Text(text = "Text1")
                    Text(text = "Text2")
                    Text(text = "Text3")
                    Text(text = "Text2")
                }
                Box{
                    Text(text = "Larabel 1")
                    Text(text = "Larabel 2")

                }
                Greeting(name ="World")
            }
            }
            }
        }

    private fun column(function: () -> Unit) {

    }



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PruebaTheme {
        Greeting("Android")
    }
}
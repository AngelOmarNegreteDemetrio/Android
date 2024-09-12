package com.example.prueba

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.prueba.ui.screens.HomeScreen
import com.example.prueba.ui.screens.MenuScreen

//import androidx.navigation.compose.NavHostController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
ComposeMultiScreenApp()
           /* Column(
                modifier= Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally

            ){
                CustomText()
                Picture()
                Content1()
                Content2()
               // Text(text ="Simple text")
            // ModifierExample()
            //ModifierExample2()
              //  ModifierExample3()
            } */
     //Layouts
           /*Column {
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
            }*/
            }
            }
        }
/*
    private fun column(function: () -> Unit) { 

    }



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

//@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PruebaTheme {
        Greeting("Android")
    }
}
//@Preview(showBackground = true)
@Composable
fun ModifierExample(){
    Column(
        modifier= Modifier
            .padding(24.dp)
    ){
        Text(text="Hello world")

    }
}
//@Preview(showBackground = true)
@Composable
fun ModifierExample2(){
    Column(
        modifier= Modifier
            .padding(24.dp)
            .fillMaxWidth()
            .clickable(onClick = { clickAction() })
    ){
        Text(text="Hello world")

  }
}
//@Preview(showBackground = true)
@Composable
fun ModifierExample3() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .padding(16.dp)
            .background(Color.Red)
            .border(width = 2.dp, color = Color.Green)
            .width(200.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Hello Item 1")
        Text(text = "Hello Item 2")
        Text(text = "Hello Item 3")
        Text(text = "Hello Item 4")
        Text(text = "Hello Item 5")
    }}
    @Preview(showBackground = true)
    @Composable
    fun CustomText() {
        Column {
            Text(
                stringResource(R.string.hello_world_text),
                color = colorResource(R.color.purple_500),
                fontSize = 28.sp,
                fontWeight = FontWeight.ExtraBold
            )
            val gradientColors = listOf(Color.Cyan, Color.Blue, Color.Red)
            Text(
                stringResource(R.string.hello_world_text),
                style = TextStyle(brush = Brush.linearGradient(colors =gradientColors))
            )
        }
    }

@Preview(showBackground = true)
@Composable
fun Picture(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
    ){
        Image(
            modifier= Modifier
                .fillMaxWidth()
                .height(20.dp),
            painter = painterResource(R.drawable.android),
            contentDescription ="Logo Android",
            contentScale = ContentScale.Crop
        )
    }

}

@Preview(showBackground = true)
@Composable
fun Content1() {
    Card(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxWidth()
            .padding(5.dp)
    ) {
        Text(
            text = "this is title",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(10.dp)
        )
        Image(
            modifier = Modifier
                .fillMaxWidth(),
            painter = painterResource(id = R.drawable.android),
            contentDescription = "Android Logo",
            contentScale = ContentScale.Crop
        )
        Text(
            text = stringResource(R.string.Text_Card),
            textAlign = TextAlign.Justify,
            lineHeight = 18.sp,
            modifier = Modifier
                .padding(10.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Content2(){
    Card(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxWidth()
            .padding(5.dp)
    ){
        Row{
            Image(
                modifier = Modifier
                    .width(width = 150.dp)
                    .height(height = 150.dp),
                painter = painterResource(id = R.drawable.android),
                contentDescription = "Android Logo",
                contentScale = ContentScale.Crop
            )

            Column {
                Text(text="This is a title",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(10.dp)
                )
                Text(stringResource(R.string.Text_Card),
                    textAlign = TextAlign.Justify,
                    maxLines = 7,
                    lineHeight = 16.sp,
                    modifier = Modifier
                        .padding(10.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BoxExample1(){
    Box(
        modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxWidth()
            .padding(5.dp)
    ){
        Image(painterResource(R.drawable.android),
            contentDescription = "Android Head Logo",
            contentScale = ContentScale.FillBounds
        )
        Row(
            modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .padding(0.dp,0.dp),
            horizontalArrangement = Arrangement.Center
            ){
            Icon(
                Icons.Filled.AccountCircle,
                contentDescription = "Icon Account"
            )
            Text(text = "Text"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BoxExample2(){
    Box(modifier = Modifier
        .background(Color.Magenta)
        .padding(5.dp)
        .size(250.dp)
    ){
        Text(text = "TopStart",Modifier.align(Alignment.TopStart))
        Text(text = "TopEnd",Modifier.align(Alignment.TopEnd))
        Text(text = "CenterStart",Modifier.align(Alignment.CenterStart))
        Text(text = "Center",Modifier.align(Alignment.Center))
        Text(text = "CenterEnd",Modifier.align(Alignment.CenterEnd))
        Text(text = "BottomStart",Modifier.align(Alignment.BottomStart))
        Text(text = "BottomEnd",Modifier.align(Alignment.BottomEnd))
    }
}

fun clickAction(){
    println("Column Clicked")

}*/
@Preview
@Composable
fun ComposeMultiScreenApp(){
    val navController = rememberNavController()
    Surface(color = Color.White) {
        SetupNavGraph(navController = navController)
    }
}
@Composable
fun SetupNavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = "menu") {
        composable("menu") { MenuScreen(navController) }
        composable("home") { HomeScreen(navController) }
    }
}

package com.example.prueba

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import com.example.prueba.ui.theme.CyberpuertaTheme
import androidx.compose.ui.unit.Dp
//import androidx.navigation.compose.NavHostController

data class Product(
    val imageResId: Int,
    val name: String,
    val rating: Float,
    val price: String
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            CyberpuertaTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopBar() // Barra superior fija
                    },
                    bottomBar = {
                        FooterWithImages() // Barra inferior fija
                    }
                ) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    ) {
                        // Columna con contenido que puede desplazarse
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .verticalScroll(rememberScrollState()) // desplazamiento vertical
                        ) {
                            Spacer(modifier = Modifier.height(16.dp))
                            // Carrousel de ofertas
                            OfferCarousel()
                            Spacer(modifier = Modifier.height(16.dp))
                            // Barra de destacados del día con temporizador
                            FeaturedBanner()
                            Spacer(modifier = Modifier.height(16.dp))
                            // Contenido principal con productos
                            ProductColumns()
                        }
                    }
                }
            }

        }
    }
    }

//ComposeMultiScreenApp()
           /*Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally

            ){
                //CustomText()
                //Picture()
                //Content1()
                //Content2()
              // Text(text ="Simple text")
            //ModifierExample()
            //ModifierExample2()
               //ModifierExample3()
               //BoxExample1()
              // BoxExample2()
            }
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
            */
            //}
          //  }
        //}
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

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PruebaTheme {
        Greeting("Android")
    }
}
@Preview(showBackground = true)
@Composable
fun ModifierExample(){
    Column(
        modifier= Modifier
            .padding(24.dp)
    ){
        Text(text="Hello world")

    }
}
@Preview(showBackground = true)
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
@Preview(showBackground = true)
@Composable
fun ModifierExample3() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
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
                .padding(0.dp, 0.dp),
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

}
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
}*/
@Composable
fun TopBar() {
    var searchText = "" // campo de búsqueda,

    // Contenedor principal de la barra superior
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 0.dp)
            .statusBarsPadding() // espacio de la barra de estado
            .background(Color.Blue) //
    ) {
        // Fila que contiene búsqueda y el icono del carrito
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .padding(vertical = 8.dp)
                .padding(horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically, // Alineación vertical centrada
            horizontalArrangement = Arrangement.SpaceBetween // Espaciado entre elementos
        ) {
            // Campo de búsqueda
            OutlinedTextField(
                value = searchText,
                onValueChange = { searchText = it },
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .padding(end = 5.dp),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = "Buscar",
                        tint = Color.Blue
                    )
                },
                singleLine = true, // Solo una línea
                shape = RoundedCornerShape(12.dp),
                colors = TextFieldDefaults.colors(
                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.Black,
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = Color.Blue,
                    unfocusedIndicatorColor = Color.Gray
                )
            )
            // Ícono del carrito
            Box(modifier = Modifier.wrapContentSize()) {
                IconButton(
                    onClick = { /* Acción del carrito */ },
                    modifier = Modifier.background(Color.Blue) // Fondo azul para el botón
                ) {
                    Icon(
                        imageVector = Icons.Filled.ShoppingCart,
                        contentDescription = "Carrito de Compras",
                        tint = Color.White
                    )
                }
                // Círculo con el número de notificaciones
                Box(
                    modifier = Modifier
                        .size(20.dp) // Tamaño del círculo
                        .background(Color(0xFFFFA500), shape = CircleShape) // Color naranja
                        .align(Alignment.TopEnd) // Alineación en la esquina superior derecha
                ) {
                    Text(
                        text = "7", // Número de notificaciones
                        color = Color.White,
                        fontSize = 12.sp, // Tamaño de fuente
                        modifier = Modifier.align(Alignment.Center) // Centrado en el círculo
                    )
                }
            }
        }
    }
}
@Composable
fun OfferCarousel() {
    // Lista de recursos de imágenes para las ofertas
    val offerImages = listOf(
        R.drawable.offer1,
        R.drawable.offer2,
        R.drawable.offer3,
        R.drawable.offer4,
        R.drawable.offer5
    )

    // Contenedor principal para el carrusel de ofertas
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(170.dp)
            .padding(0.dp),
        contentAlignment = Alignment.Center // Centra el contenido del Box
    ) {
        // para desplazar horizontalmente las imágenes de ofertas
        LazyRow(
            modifier = Modifier
                .height(155.dp)
        ) {
            items(offerImages) { imageResId ->
                Box(
                    modifier = Modifier
                        .padding(0.dp)
                        .fillMaxHeight()
                        .width(420.dp)
                        .height(170.dp)
                        .background(Color.White)
                ) {
                    Image(
                        painter = painterResource(id = imageResId), // Carga la imagen
                        contentDescription = "Oferta",
                        modifier = Modifier
                            .fillMaxSize()
                            .height(200.dp)
                            .clip(RoundedCornerShape(16.dp)) // Bordes redondeados para la imagen
                    )
                }
            }
        }
    }
}

@Composable
fun FeaturedBanner() {
    val timeLeft = "01h 59m 2s" // Texto que muestra el tiempo restante

    // Contenedor principal para el banner destacado
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .border(1.dp, Color.LightGray)
            .background(Color.White)
            .padding(horizontal = 16.dp, vertical = 12.dp)
    ) {
        // Fila que contiene el título y el temporizador
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween, // Espaciado entre elementos
            verticalAlignment = Alignment.CenterVertically // Alineación vertical centrada
        ) {
            // Título del banner
            Text(
                text = "✦ ¡Destacados del día!",
                style = MaterialTheme.typography.bodyLarge.copy(fontSize = 18.sp),
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
            // Texto del temporizador
            Text(
                text = timeLeft, // Muestra el tiempo restante
                style = MaterialTheme.typography.bodyLarge.copy(fontSize = 18.sp, fontWeight = FontWeight.Bold), // Estilo de texto
                color = Color(0xFFFF5722), // Color naranja
                textAlign = TextAlign.End // Alineación a la derecha
            )
        }
    }
}

@Composable
fun ProductColumns() {
    // Lista de productos con sus detalles
    val products = listOf(
        Product(R.drawable.monitor, "Monitor XZEAL XSPMG04B LED 23.8\", Full HD, 75Hz, HDMI, Negro", 4.5f, "$1399.00"),
        Product(R.drawable.monitorl, "Monitor LG 24MR400-B LCD 24\", Full HD, FreeSync, 100Hz, HDMI, Negro", 0.0f, "$1479.00"),
        Product(R.drawable.moderboard, "Tarjeta Madre MSI Micro-ATX B450M-A PRO MAX ll, S-AM4, AMD B450, HDMI, 64GB DDR4 para AMD", 4.5f, "$1129.00"),
        Product(R.drawable.nv2, "SSD Kingston NV2 NVMe, 1TB, PCI Express 4.0, M.2", 5.0f, "$1069.00")
    )

    // Contenedor principal para los productos
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        // Primeros dos productos
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp), // Espaciado reducido entre filas
            horizontalArrangement = Arrangement.spacedBy(8.dp) // Espaciado entre productos
        ) {
            // Cuadro para el primer producto
            Box(modifier = Modifier.weight(1f)) {
                ProductCard(product = products[0], Modifier.fillMaxSize()) // Muestra el primer producto
                // Cuadro de texto naranja para el primer producto
                Box(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .background(Color(0xFFFFA500), shape = RoundedCornerShape(4.dp)) // Color naranja
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    Text(
                        text = "Destacado",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        style = TextStyle(fontSize = 12.sp)
                    )
                }
            }
            // Cuadro para el segundo producto
            Box(modifier = Modifier.weight(1f)) {
                ProductCard(product = products[1], Modifier.fillMaxSize()) // Muestra el segundo producto
                // Cuadro de texto naranja para el segundo producto
                Box(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .background(Color(0xFFFFA500), shape = RoundedCornerShape(4.dp)) // Color naranja
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    Text(
                        text = "Destacado",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        style = TextStyle(fontSize = 12.sp)
                    )
                }
            }
        }
        // Productos 3 y 4
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp), // Espaciado entre filas
            horizontalArrangement = Arrangement.spacedBy(8.dp) // Espaciado horizontal
        ) {
            // Cuadro para el tercer producto
            Box(modifier = Modifier.weight(1f)) {
                ProductCard(product = products[2], Modifier.fillMaxSize()) // Muestra el tercer producto
                // Cuadro de texto naranja para el tercer producto
                Box(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .background(Color(0xFFFFA500), shape = RoundedCornerShape(4.dp)) // Color naranja
                        .padding(horizontal = 8.dp, vertical = 4.dp) // Padding del cuadro de texto
                ) {
                    Text(
                        text = "Destacado",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        style = TextStyle(fontSize = 12.sp)
                    )
                }
            }
            // Cuadro para el cuarto producto
            Box(modifier = Modifier.weight(1f)) {
                ProductCard(product = products[3], Modifier.fillMaxSize()) // Muestra el cuarto producto
                // Cuadro de texto naranja para el cuarto producto
                Box(
                    modifier = Modifier
                        .align(Alignment.TopStart) // Alineación en la parte superior izquierda
                        .background(Color(0xFFFFA500), shape = RoundedCornerShape(4.dp)) // Color naranja
                        .padding(horizontal = 8.dp, vertical = 4.dp) // Padding del cuadro de texto
                ) {
                    Text(
                        text = "-18% ✨",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        style = TextStyle(fontSize = 12.sp)
                    )
                }
            }
        }
    }
}

@Composable
fun FooterWithImages(iconSpacing: Dp = 60.dp) {
    // Fila principal para el pie de página
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(0.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(
            modifier = Modifier.size(40.dp),
            contentAlignment = Alignment.Center
        ) {
            IconButton(onClick = { /* Manejar clic en inicio */ }) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.door),
                        contentDescription = "Home Icon",
                        modifier = Modifier
                            .size(30.dp)
                    )
                    Text(
                        text = "Inicio",
                        fontSize = 30.sp,
                        color = Color.Black
                    )
                }
            }
        }

        // Espacio entre las imágenes
        Spacer(modifier = Modifier.width(iconSpacing))

        // Imagen de calendario a la derecha
        IconButton(onClick = { /* Manejar clic en calendario */ }) {
            Image(
                painter = painterResource(id = R.drawable.categoria),
                contentDescription = "Calendar Icon",
                modifier = Modifier.size(30.dp)
            )
        }
        // Espacio entre las imágenes
        Spacer(modifier = Modifier.width(iconSpacing))

        // Imagen de usuario a la derecha
        IconButton(onClick = { /* Manejar clic en usuario */ }) {
            Image(
                painter = painterResource(id = R.drawable.user),
                contentDescription = "User Icon",
                modifier = Modifier.size(30.dp)
            )
        }
        // Espacio entre las imágenes
        Spacer(modifier = Modifier.width(iconSpacing))

        // Imagen de menú a la derecha
        IconButton(onClick = { /* Manejar clic en menú */ }) {
            Image(
                painter = painterResource(id = R.drawable.menu),
                contentDescription = "Menu Icon",
                modifier = Modifier.size(30.dp)
            )
        }
    }
}


@Composable
fun ProductCard(product: Product, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White) // Fondo blanco para la tarjeta
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(Color.White) // Fondo blanco para la imagen
            ) {
                Image(
                    painter = painterResource(id = product.imageResId),
                    contentDescription = product.name,
                    contentScale = ContentScale.Fit, // Ajusta la imagen para que se ajuste al tamaño sin hacer zoom
                    modifier = Modifier.fillMaxSize()
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            RatingBar(rating = product.rating)
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = product.name,
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                color = Color.Black,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(16.dp)) // Espacio de dos renglones (16 dp)
            Text(
                text = product.price,
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                color = Color.Black,
                textAlign = TextAlign.End, // Alineación a la derecha del precio
                modifier = Modifier.fillMaxWidth() // Ocupa el ancho completo
            )
        }
    }
}

@Composable
fun RatingBar(rating: Float, modifier: Modifier = Modifier) {
    Row(modifier = modifier) {
        for (i in 1..5) {
            Icon(
                imageVector = Icons.Filled.Star,
                contentDescription = "Estrella",
                tint = if (i <= rating) Color.Yellow else Color.LightGray,
                modifier = Modifier.size(16.dp)
            )
        }
    }
}

@Composable
fun IconWithLabel(iconResId: Int, label: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(8.dp)
    ) {
        Box(
            modifier = Modifier.size(40.dp),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = iconResId),
                contentDescription = label,
                tint = Color.Black,
                modifier = Modifier
                    .size(30.dp)
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = label, fontSize = 12.sp, color = Color.Black)
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewProductCard() {
    CyberpuertaTheme {
        Column {
            ProductCard(
                product = Product(
                    imageResId = R.drawable.monitor,
                    name = "Monitor XZEAL XSPMG04B LED 23.8\", Full HD, 75Hz, HDMI, Negro",
                    rating = 4.5f,
                    price = "$1399.00"
                )
            )

        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview(){

}


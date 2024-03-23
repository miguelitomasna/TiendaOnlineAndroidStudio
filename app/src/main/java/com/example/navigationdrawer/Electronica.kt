package com.example.navigationdrawer

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Electronica() {
    var cantidadMonitor by remember { mutableStateOf(0) }
    var cantidadLaptop by remember { mutableStateOf(0) }
    var cantidadIphone by remember { mutableStateOf(0) }
    var cantidadWatch by remember { mutableStateOf(0) }
    var cantidadCascos by remember { mutableStateOf(0) }
    var precioTotal by remember { mutableStateOf(0.0) }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        item {
            // Producto: Monitor MSI
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.electronicaaa),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(y=10.dp)
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.Underline,
                    fontSize = 30.sp,
                    color = Color.Black,
                    text = "Electrónica"
                )
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el título y la imagen
                Image(
                    painter = painterResource(id = R.drawable.monitormsi),
                    contentDescription = null,
                    modifier = Modifier
                        .size(200.dp)
                        .padding(20.dp)
                )
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre la imagen y el texto
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    color = Color.Black,
                    text = "Monitor MSI G27C5 E2"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el texto y los botones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = { cantidadMonitor++ }) {
                        Text("+")
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Text(
                        text = "$cantidadMonitor", // Muestra la cantidad actual
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones según
                    Button(onClick = { if (cantidadMonitor > 0) cantidadMonitor-- }) {
                        Text("-")
                    }
                }
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre la cantidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Precio por unidad: 229.00 SOLES"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el peso por unidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Subtotal: ${cantidadMonitor * 229.00} SOLES" // Calcula el subtotal en función de la cantidad
                )
            }
        }
        item {
            // Producto: Laptop Asus
            Divider(Modifier.offset(y=10.dp))
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el título y la imagen
                Image(
                    painter = painterResource(id = R.drawable.asustufgaming),
                    contentDescription = null,
                    modifier = Modifier
                        .size(200.dp)
                        .padding(20.dp)
                )
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre la imagen y el texto
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    color = Color.Black,
                    text = "Laptop Asus Tuf Gaming F15"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el texto y los botones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = { cantidadLaptop++ }) {
                        Text("+")
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Text(
                        text = "$cantidadLaptop", // Muestra la cantidad actual
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Button(onClick = { if (cantidadLaptop > 0) cantidadLaptop-- }) {
                        Text("-")
                    }
                }
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre la cantidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Precio por unidad: 749.00 SOLES"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el peso por unidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Subtotal: ${cantidadLaptop * 749.00} SOLES" // Calcula el subtotal en función de la cantidad
                )
            }
        }

        item {
            // Producto: Iphone 15
            Divider()
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el título y la imagen
                Image(
                    painter = painterResource(id = R.drawable.iphone15),
                    contentDescription = null,
                    modifier = Modifier
                        .size(200.dp)
                        .padding(20.dp)
                )
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre la imagen y el texto
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    color = Color.Black,
                    text = "Iphone 15 256GB"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el texto y los botones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = { cantidadIphone++ }) {
                        Text("+")
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Text(
                        text = "$cantidadIphone", // Muestra la cantidad actual
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Button(onClick = { if (cantidadIphone > 0) cantidadIphone-- }) {
                        Text("-")
                    }
                }
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre la cantidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Precio por unidad: 1029.00 SOLES"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el peso por unidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Subtotal: ${cantidadIphone * 1029.00} SOLES" // Calcula el subtotal en función de la cantidad
                )
            }
        }
        item {
            // Producto: Apple Watch 9
            Divider()
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el título y la imagen
                Image(
                    painter = painterResource(id = R.drawable.applewatch9),
                    contentDescription = null,
                    modifier = Modifier
                        .size(200.dp)
                        .padding(20.dp)
                )
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre la imagen y el texto
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    color = Color.Black,
                    text = "Apple Watch Series 9"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el texto y los botones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = { cantidadWatch++ }) {
                        Text("+")
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Text(
                        text = "$cantidadWatch", // Muestra la cantidad actual
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Button(onClick = { if (cantidadWatch > 0) cantidadWatch-- }) {
                        Text("-")
                    }
                }
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre la cantidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Precio por unidad: 599.00 SOLES"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el peso por unidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Subtotal: ${cantidadWatch * 599.00} SOLES" // Calcula el subtotal en función de la cantidad
                )
            }
        }
        item {
            // Producto: JBL Quantum 400
            Divider()
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el título y la imagen
                Image(
                    painter = painterResource(id = R.drawable.cascosgamer),
                    contentDescription = null,
                    modifier = Modifier
                        .size(200.dp)
                        .padding(20.dp)
                )
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre la imagen y el texto
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    color = Color.Black,
                    text = "JBL Quantum 400"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el texto y los botones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = { cantidadCascos++ }) {
                        Text("+")
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Text(
                        text = "$cantidadCascos", // Muestra la cantidad actual
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Button(onClick = { if (cantidadCascos > 0) cantidadCascos-- }) {
                        Text("-")
                    }
                }
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre la cantidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Precio por unidad: 86.18 SOLES"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el peso por unidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Subtotal: ${cantidadCascos * 86.18} SOLES" // Calcula el subtotal en función de la cantidad
                )
            }
        }

        item {
            // Botón para calcular el total
            Button(
                onClick = {
                    precioTotal = (cantidadMonitor * 229.00) + (cantidadLaptop * 749.00) + (cantidadIphone * 1029.00) + (cantidadWatch * 599.00) + (cantidadCascos * 86.18)
                },
                modifier = Modifier.padding(top = 16.dp, bottom = 32.dp)
            ) {
                Text("Calcular Total")
            }
        }

        item {
            // Mostrar el total
            if (precioTotal > 0) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Total: ${precioTotal} SOLES",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                }
            }
        }
    }
}
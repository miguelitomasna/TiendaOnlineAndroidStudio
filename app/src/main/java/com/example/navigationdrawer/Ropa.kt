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
fun Ropa() {
    var cantidadChaqueta by remember { mutableStateOf(0) }
    var cantidadSueter by remember { mutableStateOf(0) }
    var cantidadPantalon by remember { mutableStateOf(0) }
    var cantidadAdidas by remember { mutableStateOf(0) }
    var cantidadCamisa by remember { mutableStateOf(0) }
    var totalProductos by remember { mutableStateOf(0) }
    var precioTotal by remember { mutableStateOf(0.0) }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        item {
            // Producto: Chaqueta Disney
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ropa),
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
                    text = "Ropa"
                )
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el título y la imagen
                Image(
                    painter = painterResource(id = R.drawable.chaquetadisney),
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
                    text = "Chaqueta Disney"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el texto y los botones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = { cantidadChaqueta++ }) {
                        Text("+")
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Text(
                        text = "$cantidadChaqueta", // Muestra la cantidad actual
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones según
                    Button(onClick = { if (cantidadChaqueta > 0) cantidadChaqueta-- }) {
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
                    text = "Precio por unidad: 89.99 SOLES"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el peso por unidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Subtotal: ${cantidadChaqueta * 89.99} SOLES" // Calcula el subtotal en función de la cantidad
                )
            }
        }
        item {
            // Producto: Sudadera
            Divider(Modifier.offset(y=10.dp))
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el título y la imagen
                Image(
                    painter = painterResource(id = R.drawable.sueterx),
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
                    text = "Sueter ACQUA classic hoodie"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el texto y los botones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = { cantidadSueter++ }) {
                        Text("+")
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Text(
                        text = "$cantidadSueter", // Muestra la cantidad actual
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Button(onClick = { if (cantidadSueter > 0) cantidadSueter-- }) {
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
                    text = "Precio por unidad: 64.90 SOLES"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el peso por unidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Subtotal: ${cantidadSueter * 64.90} SOLES" // Calcula el subtotal en función de la cantidad
                )
            }
        }

        item {
            // Producto: Pantalones
            Divider()
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el título y la imagen
                Image(
                    painter = painterResource(id = R.drawable.pantalon),
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
                    text = "Skinny high jeans"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el texto y los botones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = { cantidadPantalon++ }) {
                        Text("+")
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Text(
                        text = "$cantidadPantalon", // Muestra la cantidad actual
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Button(onClick = { if (cantidadPantalon > 0) cantidadPantalon-- }) {
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
                    text = "Precio por unidad: 19.99 SOLES"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el peso por unidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Subtotal: ${cantidadPantalon * 19.99} SOLES" // Calcula el subtotal en función de la cantidad
                )
            }
        }
        item {
            // Producto: Zapatos
            Divider()
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el título y la imagen
                Image(
                    painter = painterResource(id = R.drawable.adidasls),
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
                    text = "Adidas x The Simpson"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el texto y los botones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = { cantidadAdidas++ }) {
                        Text("+")
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Text(
                        text = "$cantidadAdidas", // Muestra la cantidad actual
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Button(onClick = { if (cantidadAdidas > 0) cantidadAdidas-- }) {
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
                    text = "Precio por unidad: 300.00 SOLES"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el peso por unidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Subtotal: ${cantidadAdidas * 300.00} SOLES" // Calcula el subtotal en función de la cantidad
                )
            }
        }
        item {
            // Producto: Camisa Akatsuki
            Divider()
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el título y la imagen
                Image(
                    painter = painterResource(id = R.drawable.camisaakatsuki),
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
                    text = "Camisa naruto Akatsuki"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el texto y los botones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = { cantidadCamisa++ }) {
                        Text("+")
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Text(
                        text = "$cantidadCamisa", // Muestra la cantidad actual
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Button(onClick = { if (cantidadCamisa > 0) cantidadCamisa-- }) {
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
                    text = "Precio por unidad: 16.99 SOLES"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el peso por unidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Subtotal: ${cantidadCamisa * 16.99} SOLES" // Calcula el subtotal en función de la cantidad
                )
            }
        }
        item {
            // Botón para calcular el total
            Button(
                onClick = {
                    precioTotal = (cantidadChaqueta * 89.99) + (cantidadSueter * 64.90) + (cantidadPantalon * 19.99) + (cantidadAdidas * 300.00) + (cantidadCamisa * 16.99)
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
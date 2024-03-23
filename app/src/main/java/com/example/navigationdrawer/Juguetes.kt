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
fun Juguetes() {
    var cantidadHarley by remember { mutableStateOf(0) }
    var cantidadJoker by remember { mutableStateOf(0) }
    var cantidadNerf by remember { mutableStateOf(0) }
    var cantidadBarbie by remember { mutableStateOf(0) }
    var cantidadHotWheels by remember { mutableStateOf(0) }
    var totalProductos by remember { mutableStateOf(0) }
    var precioTotal by remember { mutableStateOf(0.0) }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        item {
            // Producto: Harley Quinn
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.jugueteria),
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
                    text = "Juguetes"
                )
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el título y la imagen
                Image(
                    painter = painterResource(id = R.drawable.harleyquinn),
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
                    text = "Funko POP! Harley Quinn"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el texto y los botones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = { cantidadHarley++ }) {
                        Text("+")
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Text(
                        text = "$cantidadHarley", // Muestra la cantidad actual
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones según
                    Button(onClick = { if (cantidadHarley > 0) cantidadHarley-- }) {
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
                    text = "Precio por unidad: 17.99 SOLES"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el peso por unidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Subtotal: ${cantidadHarley * 17.99} SOLES" // Calcula el subtotal en función de la cantidad
                )
            }
        }
        item {
            // Producto: Funko pop Joker
            Divider(Modifier.offset(y=10.dp))
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el título y la imagen
                Image(
                    painter = painterResource(id = R.drawable.joker),
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
                    text = "Funko POP! Joker"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el texto y los botones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = { cantidadJoker++ }) {
                        Text("+")
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Text(
                        text = "$cantidadJoker", // Muestra la cantidad actual
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Button(onClick = { if (cantidadJoker > 0) cantidadJoker-- }) {
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
                    text = "Precio por unidad: 17.99 SOLES"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el peso por unidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Subtotal: ${cantidadJoker * 17.99} SOLES" // Calcula el subtotal en función de la cantidad
                )
            }
        }

        item {
            // Producto: Arma Fortnite
            Divider()
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el título y la imagen
                Image(
                    painter = painterResource(id = R.drawable.armafortnite),
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
                    text = "Fúsil Fortnite Nerf"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el texto y los botones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = { cantidadNerf++ }) {
                        Text("+")
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Text(
                        text = "$cantidadNerf", // Muestra la cantidad actual
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Button(onClick = { if (cantidadNerf > 0) cantidadNerf-- }) {
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
                    text = "Precio por unidad: 121.00 SOLES"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el peso por unidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Subtotal: ${cantidadNerf * 121.00} SOLES" // Calcula el subtotal en función de la cantidad
                )
            }
        }
        item {
            // Producto: Barbie
            Divider()
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el título y la imagen
                Image(
                    painter = painterResource(id = R.drawable.barbie),
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
                    text = "Barbie fashionista"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el texto y los botones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = { cantidadBarbie++ }) {
                        Text("+")
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Text(
                        text = "$cantidadBarbie", // Muestra la cantidad actual
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Button(onClick = { if (cantidadBarbie > 0) cantidadBarbie-- }) {
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
                    text = "Precio por unidad: 13.99 SOLES"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el peso por unidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Subtotal: ${cantidadBarbie * 13.99} SOLES" // Calcula el subtotal en función de la cantidad
                )
            }
        }
        item {
            // Producto: Hot Wheels
            Divider()
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el título y la imagen
                Image(
                    painter = painterResource(id = R.drawable.hotwheels),
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
                    text = "Hot wheels Fast & Furious"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el texto y los botones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = { cantidadHotWheels++ }) {
                        Text("+")
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Text(
                        text = "$cantidadHotWheels", // Muestra la cantidad actual
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Button(onClick = { if (cantidadHotWheels > 0) cantidadHotWheels-- }) {
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
                    text = "Precio por unidad: 6.11 SOLES"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el peso por unidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Subtotal: ${cantidadHotWheels * 6.11} SOLES" // Calcula el subtotal en función de la cantidad
                )
            }
        }

        item {
            // Botón para calcular el total
            Button(
                onClick = {
                    precioTotal = (cantidadHarley * 17.99) + (cantidadJoker * 17.99) + (cantidadNerf * 121.00) + (cantidadBarbie * 13.99) + (cantidadHotWheels * 6.11)
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
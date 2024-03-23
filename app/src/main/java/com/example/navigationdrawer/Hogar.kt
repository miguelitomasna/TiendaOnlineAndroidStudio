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
import androidx.compose.material3.BottomAppBar
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Hogar() {
    var cantidadSillaGamer by remember { mutableStateOf(0) }
    var cantidadMesaGamer by remember { mutableStateOf(0) }
    var cantidadSofa by remember { mutableStateOf(0) }
    var cantidadMesaNoche by remember { mutableStateOf(0) }
    var cantidadCloset by remember { mutableStateOf(0) }
    var totalProductos by remember { mutableStateOf(0) }
    var precioTotal by remember { mutableStateOf(0.0) }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        item {
            // Producto: Silla Gamer
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.hogar),
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
                    text = "Hogar"
                )
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el título y la imagen
                Image(
                    painter = painterResource(id = R.drawable.sillagamer),
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
                    text = "Silla gamer"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el texto y los botones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = { cantidadSillaGamer++ }) {
                        Text("+")
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Text(
                        text = "$cantidadSillaGamer", // Muestra la cantidad actual
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones según
                    Button(onClick = { if (cantidadSillaGamer > 0) cantidadSillaGamer-- }) {
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
                    text = "Precio por unidad: 644.00 SOLES"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el peso por unidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Subtotal: ${cantidadSillaGamer * 644.00} SOLES" // Calcula el subtotal en función de la cantidad
                )
            }
        }
        item {
            // Producto: Mesa Gamer
            Divider(Modifier.offset(y=10.dp))
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el título y la imagen
                Image(
                    painter = painterResource(id = R.drawable.mesitagamer),
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
                    text = "Mesa gamer"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el texto y los botones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = { cantidadMesaGamer++ }) {
                        Text("+")
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Text(
                        text = "$cantidadMesaGamer", // Muestra la cantidad actual
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Button(onClick = { if (cantidadMesaGamer > 0) cantidadMesaGamer-- }) {
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
                    text = "Precio por unidad: 260.60 SOLES"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el peso por unidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Subtotal: ${cantidadMesaGamer * 260.60} SOLES" // Calcula el subtotal en función de la cantidad
                )
            }
        }

        item {
            // Producto: Sofa
            Divider()
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el título y la imagen
                Image(
                    painter = painterResource(id = R.drawable.sofa),
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
                    text = "Sofa"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el texto y los botones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = { cantidadSofa++ }) {
                        Text("+")
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Text(
                        text = "$cantidadSofa", // Muestra la cantidad actual
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Button(onClick = { if (cantidadSofa > 0) cantidadSofa-- }) {
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
                    text = "Precio por unidad: 533.19 SOLES"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el peso por unidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Subtotal: ${cantidadSofa * 533.19} SOLES" // Calcula el subtotal en función de la cantidad
                )
            }
        }
        item {
            // Producto: Mesita De Noche
            Divider()
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el título y la imagen
                Image(
                    painter = painterResource(id = R.drawable.mesitanoche),
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
                    text = "Mesa de noche"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el texto y los botones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = { cantidadMesaNoche++ }) {
                        Text("+")
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Text(
                        text = "$cantidadMesaNoche", // Muestra la cantidad actual
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Button(onClick = { if (cantidadMesaNoche > 0) cantidadMesaNoche-- }) {
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
                    text = "Precio por unidad: 49.99 SOLES"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el peso por unidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Subtotal: ${cantidadMesaNoche * 49.99} SOLES" // Calcula el subtotal en función de la cantidad
                )
            }
        }
        item {
            // Producto: Closet
            Divider()
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el título y la imagen
                Image(
                    painter = painterResource(id = R.drawable.armario),
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
                    text = "Closet con espejo"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el texto y los botones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = { cantidadCloset++ }) {
                        Text("+")
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Text(
                        text = "$cantidadCloset", // Muestra la cantidad actual
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Button(onClick = { if (cantidadCloset > 0) cantidadCloset-- }) {
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
                    text = "Precio por unidad: 374 SOLES"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el peso por unidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Subtotal: ${cantidadCloset * 374} SOLES" // Calcula el subtotal en función de la cantidad
                )
            }
        }

        item {
            // Botón para calcular el total
            Button(
                onClick = {
                    precioTotal = (cantidadSillaGamer * 644.0) + (cantidadMesaGamer * 260.60) + (cantidadSofa * 533.19) + (cantidadMesaNoche * 49.99) + (cantidadCloset * 374)
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
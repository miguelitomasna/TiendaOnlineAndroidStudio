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
fun Decoracion() {
    var cantidadFlorero by remember { mutableStateOf(0) }
    var cantidadCuadro by remember { mutableStateOf(0) }
    var cantidadEscultura by remember { mutableStateOf(0) }
    var cantidadPlanta by remember { mutableStateOf(0) }
    var cantidadVela by remember { mutableStateOf(0) }
    var precioTotal by remember { mutableStateOf(0.0) }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        item {
            // Producto: Florero
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.decoracion),
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
                    text = "Decoración"
                )
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el título y la imagen
                Image(
                    painter = painterResource(id = R.drawable.florero),
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
                    text = "Florero verde"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el texto y los botones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = { cantidadFlorero++ }) {
                        Text("+")
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Text(
                        text = "$cantidadFlorero", // Muestra la cantidad actual
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones según
                    Button(onClick = { if (cantidadFlorero > 0) cantidadFlorero-- }) {
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
                    text = "Precio por unidad: 5.36 SOLES"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el peso por unidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Subtotal: ${cantidadFlorero * 5.36} SOLES" // Calcula el subtotal en función de la cantidad
                )
            }
        }
        item {
            // Producto: Cuadro
            Divider(Modifier.offset(y=10.dp))
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el título y la imagen
                Image(
                    painter = painterResource(id = R.drawable.cuadro),
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
                    text = "Cuadro noche estrellada"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el texto y los botones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = { cantidadCuadro++ }) {
                        Text("+")
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Text(
                        text = "$cantidadCuadro", // Muestra la cantidad actual
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Button(onClick = { if (cantidadCuadro > 0) cantidadCuadro-- }) {
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
                    text = "Precio por unidad: 42.90 SOLES"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el peso por unidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Subtotal: ${cantidadCuadro * 42.90} SOLES" // Calcula el subtotal en función de la cantidad
                )
            }
        }

        item {
            // Producto: Escultura perro
            Divider()
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el título y la imagen
                Image(
                    painter = painterResource(id = R.drawable.esculturaperro),
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
                    text = "Escultura de perro"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el texto y los botones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = { cantidadEscultura++ }) {
                        Text("+")
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Text(
                        text = "$cantidadEscultura", // Muestra la cantidad actual
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Button(onClick = { if (cantidadEscultura > 0) cantidadEscultura-- }) {
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
                    text = "Precio por unidad: 26.99 SOLES"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el peso por unidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Subtotal: ${cantidadEscultura * 26.99} SOLES" // Calcula el subtotal en función de la cantidad
                )
            }
        }
        item {
            // Producto: Planta artificial
            Divider()
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el título y la imagen
                Image(
                    painter = painterResource(id = R.drawable.planta),
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
                    text = "Planta pequeña artificial"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el texto y los botones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = { cantidadPlanta++ }) {
                        Text("+")
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Text(
                        text = "$cantidadPlanta", // Muestra la cantidad actual
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Button(onClick = { if (cantidadPlanta > 0) cantidadPlanta-- }) {
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
                    text = "Precio por unidad: 3.29 SOLES"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el peso por unidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Subtotal: ${cantidadPlanta * 3.29} SOLES" // Calcula el subtotal en función de la cantidad
                )
            }
        }
        item {
            // Producto: Vela
            Divider()
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(16.dp)) // Espacio entre el título y la imagen
                Image(
                    painter = painterResource(id = R.drawable.vela),
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
                    text = "Vela morada de lavanda"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el texto y los botones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = { cantidadVela++ }) {
                        Text("+")
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Text(
                        text = "$cantidadVela", // Muestra la cantidad actual
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones
                    Button(onClick = { if (cantidadVela > 0) cantidadVela-- }) {
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
                    text = "Precio por unidad: 3.19 SOLES"
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre el peso por unidad y el subtotal
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    text = "Subtotal: ${cantidadVela * 3.19} SOLES" // Calcula el subtotal en función de la cantidad
                )
            }
        }
        item {
            // Botón para calcular el total
            Button(
                onClick = {
                    precioTotal = (cantidadFlorero * 5.36) + (cantidadCuadro * 42.90) + (cantidadEscultura * 26.99) + (cantidadPlanta * 3.29) + (cantidadVela * 3.19)
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
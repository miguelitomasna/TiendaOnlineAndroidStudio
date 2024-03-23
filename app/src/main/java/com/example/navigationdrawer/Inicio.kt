package com.example.navigationdrawer

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Inicio() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        item {
            // Categoría de: Hogar
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.Underline,
                    fontSize = 30.sp,
                    color = Color.Black,
                    text = "Hogar"
                )

                Image(
                    painter = painterResource(id = R.drawable.hogar),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Divider(Modifier.offset(y=10.dp))
            }
        }
        item {
            // Categoría de: Electrónica
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.Underline,
                    fontSize = 30.sp,
                    color = Color.Black,
                    text = "Electrónica"
                )

                Image(
                    painter = painterResource(id = R.drawable.electronicaaa),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Divider(Modifier.offset(y=10.dp))
            }
        }
        item {
            // Categoría de: Ropa
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.Underline,
                    fontSize = 30.sp,
                    color = Color.Black,
                    text = "Ropa"
                )

                Image(
                    painter = painterResource(id = R.drawable.ropa),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Divider(Modifier.offset(y=10.dp))
            }
        }
        item {
            // Categoría de: Cocina
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.Underline,
                    fontSize = 30.sp,
                    color = Color.Black,
                    text = "Cocina"
                )

                Image(
                    painter = painterResource(id = R.drawable.cocina),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Divider(Modifier.offset(y=10.dp))
            }
        }
        item {
            // Categoría de: Juguetes
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.Underline,
                    fontSize = 30.sp,
                    color = Color.Black,
                    text = "Juguetes"
                )

                Image(
                    painter = painterResource(id = R.drawable.jugueteria),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Divider(Modifier.offset(y=10.dp))
            }
        }
        item {
            // Categoría de: Decoración
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                        .wrapContentWidth(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.Underline,
                    fontSize = 30.sp,
                    color = Color.Black,
                    text = "Decoración"
                )

                Image(
                    painter = painterResource(id = R.drawable.decoracion),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Divider(Modifier.offset(y=10.dp))
            }
        }
    }
}
package com.example.composeapp1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp1.ui.theme.ComposeApp1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeApp1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    Greet("Android")

                }
            }
        }
    }
}

@Composable
fun Greet(name: String) {
Box(){


    Image(painter = painterResource(id =R.drawable.annie_spratt_x4l3cjcdvic_unsplash), contentDescription ="",modifier=Modifier.fillMaxSize(), contentScale = ContentScale.Crop )
    Column() {
        Text(text="Enter Your Name:")
        var value by remember { mutableStateOf("your name") }
        TextField(value = value, onValueChange ={newvalue->value=newvalue},modifier=Modifier.padding(top=16.dp) )
        Text(text = "Happy Birthday", fontSize = 45.sp, modifier = Modifier.padding(start=45.dp), color= Color.Magenta)
        Text(text=value, fontSize = 45.sp,modifier= Modifier.padding(start=135.dp))
        Image(painter = painterResource(id = R.drawable.cake), contentDescription ="cake" ,modifier=Modifier.padding(top=35.dp,start=95.dp))

    }




    }}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeApp1Theme {
        Greet("World")


    }
}
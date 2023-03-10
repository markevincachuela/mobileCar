/**
 * Copyright (c) 2023 . All rights reserved.
 */
package com.example.mobilecar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mobilecar.ui.theme.MobileCarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobileCarTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android","Description")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, description: String) {
    Row {
        Text(text = "ROOOW")
        Spacer(modifier = Modifier.width(10.dp))
        Column {
            Text(text = "Hello $name!")
            Text(text = "Description $description")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MobileCarTheme {
        Surface(modifier = Modifier.fillMaxSize()) {

        }
        Greeting("Android","Description")
    }
}
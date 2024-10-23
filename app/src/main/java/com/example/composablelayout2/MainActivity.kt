package com.example.composablelayout2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composablelayout2.ui.theme.ComposableLayout2Theme as ComposableLayout2Theme1

class MainActivity : ComponentActivity() {
    @Composable
    fun OnCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposableLayout2Theme1 {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PlayActivity(modifier = Modifier.padding(innerPadding))}
            }
        }
    }

    private fun setContent(function: @Composable () -> Unit) {
        
        
    }
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
    ComposableLayout2Theme1 {
        Greeting("Android")
    }
}
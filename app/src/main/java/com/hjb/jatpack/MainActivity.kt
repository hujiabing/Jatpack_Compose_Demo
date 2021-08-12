package com.hjb.jatpack

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.hjb.jatpack.ui.headView
import com.hjb.jatpack.ui.theme.Jatpack_Compose_DemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jatpack_Compose_DemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    headView("首页")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Button(onClick = { Log.e("========", "wwwww") },) {
        Text(text = "Hello $name!")
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Jatpack_Compose_DemoTheme {
        headView("首页")
    }
}
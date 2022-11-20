package dev.emir

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.emir.ui.theme.HelloComposeTheme
import dev.emir.ui.theme.Shapes
import dev.emir.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloCompose()
        }
    }
}

@Composable
fun HelloCompose() {
    HelloComposeTheme() {
        Card(
            modifier = Modifier
                .padding(16.dp)
                .size(200.dp)
                .background(Color.White),
            elevation = 8.dp,
            shape = Shapes.small
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.platzi),
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )
                Text(text = "Flutter?", style = Typography.h6)
                Text(text = "Nop, es Jetpack Compose!")
                Button(
                    onClick = {

                    },

                    modifier = Modifier.padding(top = 16.dp),
                ) {
                    Text(text = "Click me!")
                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun HelloComposePreview() {
    HelloCompose()
}
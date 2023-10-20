package co.edu.sena.myapplicationaladan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) //Por medio de esta función, arranca la app
        setContent {
            MessageCard(
                Message(
                    "Daniel",
                    "This is yout first app"
                )
            ) //Esta función es creada por el usuario
        } //setContent
    }//onCreate
}//MainActivity

data class Message(val author: String, val body: String)

@Composable
fun MessageCard(msg: Message) { //name is the argument
    Column {
        Text(text = msg.author) //$ con este símbolo interpolo el nombre de la variable
        Text(text = msg.body) //$ con este símbolo interpolo el nombre de la variable
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMessageCard() {
    MessageCard(
        msg = Message("Android", "Hey, take a look at Jetpack Compose, it's great!")
    )
}
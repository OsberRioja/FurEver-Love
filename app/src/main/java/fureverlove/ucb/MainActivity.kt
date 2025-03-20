package fureverlove.ucb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fureverlove.ucb.ui.theme.FurEverLoveTheme
import androidx.compose.material3.Button as Button
import androidx.compose.material3.Text as Text
import androidx.compose.material3.TextField as TextField

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FurEverLoveTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SigninPage(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text1(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

@Composable
fun SigninPage(modifier: Modifier = Modifier){
    var userSignIn by remember { mutableStateOf("") }
    var passwordSignIn by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Sign In")
        TextField(value = userSignIn, onValueChange = { userSignIn = it })
        TextField(value = passwordSignIn, onValueChange = { passwordSignIn = it })
        Button(modifier = Modifier.fillMaxWidth(), onClick = {/*TODO*/}) {
            Text(text = "Sign In")
        }
    }
}


//fun GreetingPreview() {
//    FurEverLoveTheme {
//        Greeting("Android")
//    }
//}
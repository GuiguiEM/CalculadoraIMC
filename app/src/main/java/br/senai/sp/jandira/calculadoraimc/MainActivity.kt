package br.senai.sp.jandira.calculadoraimc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.calculadoraimc.ui.theme.CalculadoraIMCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraIMCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Column ( modifier = Modifier
            .height(210.dp)
            .fillMaxWidth()
            .background(color = Color.Red),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                modifier = Modifier
                    .height(100.dp)
                    .padding(top = 10.dp),
                painter = painterResource(id = R.drawable.imc),
                contentDescription = ""
            )
            Text(
                text = "Calculadora IMC",
                fontSize = 32.sp,
                modifier = Modifier.padding(top = 8.dp),
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .height(420.dp)
                .width(350.dp)
                .padding(start = 40.dp)
                .offset(y = -40.dp)
                .shadow(24.dp, RectangleShape)
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(10.dp)
                )
        ){
            Text(
                modifier = Modifier.padding(top = 32.dp),
                text = "Seus dados",
                color = Color.Red,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 30.sp,
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Seu peso:",
                    color = Color.Red,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.offset(x = -95.dp, y = 30.dp)
                )
                OutlinedTextField(
                    modifier = Modifier
                        .padding(top = 32.dp),
                    value = "",
                    onValueChange = {},
                    label = {
                        Text(
                            text = "Seu peso em Kg"
                        )
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color.Red
                    )
                )
                Text(
                    text = "Sua altura:",
                    color = Color.Red,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.offset(x = -95.dp, y = 30.dp)
                )
                OutlinedTextField(
                    modifier = Modifier
                        .padding(top = 32.dp),
                    value = "",
                    onValueChange = {},
                    label = {
                        Text(
                            text = "Sua altura em cm"
                        )
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color.Red
                    )
                )
                Button(onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(6.dp),
                    modifier = Modifier
                        .height(85.dp)
                        .fillMaxWidth()
                        .padding(top = 32.dp, start = 14.dp, end = 14.dp),
                    colors = ButtonDefaults
                        .buttonColors(containerColor = Color.Red)
                ) {
                    Text(
                        text = "CALCULAR",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
            }
        }
        Box(
            modifier = Modifier
                .width(350.dp)
                .height(100.dp)
                .padding(top = 6.dp, start = 40.dp)
                .shadow(32.dp, RectangleShape)
                .background(
                    color = Color(0xFF249112),
                    shape = RoundedCornerShape(10.dp)
                )
        ){
            Column {
                Text(
                    text = "Resultado",
                    color = Color.White,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(top = 20.dp, start = 46.dp)
                )
                Text(
                    text = "Peso Ideal",
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 26.sp,
                    modifier = Modifier
                        .padding(top = 6.dp, start = 20.dp)
                )
            }
            Column {
                Text(
                    text = "21.3",
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 36.sp,
                    modifier = Modifier
                        .padding(top = 30.dp, start = 194.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    CalculadoraIMCTheme {
        Greeting()
    }
}
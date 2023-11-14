package com.example.aplikacjawieloekranowajetpackcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    private var showSecondScreen by mutableStateOf(false)
    private var showThirdScreen by mutableStateOf(false)
    private var showFourthScreen by mutableStateOf(false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val context = LocalContext.current

            Buttons(onGreenClick = {
                Toast.makeText(context, "Przycisk wciśnięty mniam :3", Toast.LENGTH_SHORT).show()
                showSecondScreen = true
            }, onWhiteClick = {
                Toast.makeText(context, "Przycisk wciśnięty mniam :3", Toast.LENGTH_SHORT).show()
                showThirdScreen = true
            }, onPinkClick = {
                Toast.makeText(context, "Przycisk wciśnięty mniam :3", Toast.LENGTH_SHORT).show()
                showFourthScreen = true
            })

            if (showSecondScreen) {
                SecondScreen()
            } else if (showThirdScreen) {
                ThirdScreen()
            } else if (showFourthScreen) {
                FourthScreen()
            }
        }
    }

    @Composable
    fun Buttons(onGreenClick: () -> Unit, onWhiteClick: () -> Unit, onPinkClick: () -> Unit) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = onGreenClick,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color(0xFF006400),
                    contentColor = Color.White
                )
            ) {
                Text(text = "Idziemy do Zieloneeeeeegoooooooooo O.O")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = onWhiteClick,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White,
                    contentColor = Color.Black
                )
            ) {
                Text(text = "Do Białego :3")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = onPinkClick,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color(0xFFFFC0CB),
                    contentColor = Color.Black
                )
            ) {
                Text(text = "Różowy :3 o.o")
            }
        }
    }

    @Composable
    fun SecondScreen() {
        val context = LocalContext.current

        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFF00FF00)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Teraz jestem Zielony x_x", color = Color.White)
                Spacer(modifier = Modifier.height(16.dp))
                Buttons(onGreenClick = {
                    Toast.makeText(context, "Przycisk wciśnięty mniam :3", Toast.LENGTH_SHORT).show()
                    showThirdScreen = true
                    showSecondScreen = false
                }, onWhiteClick = {
                    Toast.makeText(context, "Przycisk wciśnięty mniam :3", Toast.LENGTH_SHORT).show()
                    showThirdScreen = true
                    showSecondScreen = false
                }, onPinkClick = {
                    Toast.makeText(context, "Przycisk wciśnięty mniam :3", Toast.LENGTH_SHORT).show()
                    showFourthScreen = true
                    showSecondScreen = false
                })
            }
        }
    }

    @Composable
    fun ThirdScreen() {
        val context = LocalContext.current

        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.White
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Białość nastała niczym śnieżyca w dniu grudniowym", color = Color.Black)
                Spacer(modifier = Modifier.height(16.dp))
                Buttons(onGreenClick = {
                    Toast.makeText(context, "Przycisk wciśnięty mniam :3", Toast.LENGTH_SHORT).show()
                    showSecondScreen = true
                    showThirdScreen = false
                }, onWhiteClick = {
                    Toast.makeText(context, "Przycisk wciśnięty mniam :3", Toast.LENGTH_SHORT).show()
                    showSecondScreen = true
                    showThirdScreen = false
                }, onPinkClick = {
                    Toast.makeText(context, "Przycisk wciśnięty mniam :3", Toast.LENGTH_SHORT).show()
                    showFourthScreen = true
                    showThirdScreen = false
                })
            }
        }
    }

    @Composable
    fun FourthScreen() {
        val context = LocalContext.current

        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFFFFC0CB)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                //verticalArrangement = Alignment.CenterVertically,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Teraz jest: Róóóżooowiuuutkiiiiiiiiii", color = Color.Black)
                Spacer(modifier = Modifier.height(16.dp))
                Buttons(onGreenClick = {
                    Toast.makeText(context, "Przycisk wciśnięty mniam :3", Toast.LENGTH_SHORT).show()
                    showSecondScreen = true
                    showFourthScreen = false
                }, onWhiteClick = {
                    Toast.makeText(context, "Przycisk wciśnięty mniam :3", Toast.LENGTH_SHORT).show()
                    showThirdScreen = true
                    showFourthScreen = false
                }, onPinkClick = {
                    Toast.makeText(context, "Przycisk wciśnięty mniam :3", Toast.LENGTH_SHORT).show()
                })
            }
        }
    }
}
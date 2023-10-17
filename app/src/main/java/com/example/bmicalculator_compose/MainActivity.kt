package com.example.bmicalculator_compose

import BMICalculatorTheme
import DARK_BLUE
import LIGHT_BLUE
import WHITE
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp





class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            BMICalculatorTheme {

                BMIFirstScreen()

            }

        }
    }


    @Composable
    fun BMIFirstScreen() {

        var peso by remember {
            mutableStateOf("")
        }
        var altura by remember {
            mutableStateOf("")
        }
        var textResult by remember {
           mutableStateOf("Peso Normal \n BMI: 17,09")
        }


        Scaffold(
            topBar = {
                TopAppBar(

                    backgroundColor = LIGHT_BLUE,
                    title = { Text("BMI CALCULATOR",
                        color = WHITE, fontWeight = FontWeight.Bold)

                     }
                )
            }
        ) { ContentPadding ->
            Column(
                modifier = Modifier
                    .padding(ContentPadding)
                    .fillMaxWidth()
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                
                
                Text(
                    modifier = Modifier.padding(50.dp),
                    text = "BMI Calculator",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = LIGHT_BLUE,
                )

                OutlinedTextField(

                    value =peso ,

                    onValueChange = {
                        peso = it
                    },
                    label = {

                       Text(text = "Peso (Kg)")

                    },
                    colors = TextFieldDefaults.outlinedTextFieldColors(

                        cursorColor = LIGHT_BLUE,
                        focusedBorderColor = LIGHT_BLUE,
                        textColor = DARK_BLUE,
                        focusedLabelColor = DARK_BLUE

                    ),
                    textStyle = TextStyle(DARK_BLUE,18.sp),
                    maxLines = 1,
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 0.dp, 20.dp, 0.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number

                    )



                )
                OutlinedTextField(

                    value =altura ,

                    onValueChange = {
                        altura = it
                    },
                    label = {

                        Text(text = "Altura")

                    },
                    colors = TextFieldDefaults.outlinedTextFieldColors(

                        cursorColor = LIGHT_BLUE,
                        focusedBorderColor = LIGHT_BLUE,
                        textColor = DARK_BLUE,
                        focusedLabelColor = DARK_BLUE

                    ),
                    textStyle = TextStyle(DARK_BLUE,18.sp),
                    maxLines = 1,
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 10.dp, 20.dp, 0.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number

                    )



                )

                Button(onClick = { 
                    
                    
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
                    .height(50.dp),
                    colors = ButtonDefaults.buttonColors(

                        backgroundColor = LIGHT_BLUE,
                        contentColor = WHITE

                    )

                    ) {

                    Text(text = "Calculate BMI",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                    
                }


                Text(

                    text = textResult,
                    fontSize = 18.sp,
                    color = DARK_BLUE,
                    fontWeight = FontWeight.Bold


                )
                

            }
        }
    }


    @Preview
    @Composable
    private fun IMCFirstScreenPreview() {


        BMIFirstScreen()


    }


}



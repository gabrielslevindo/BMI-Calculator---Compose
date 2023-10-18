package com.example.bmicalculator_compose.Logic

import java.text.DecimalFormat


class CalculateBMI {

    private var BMIResult = ""

    fun calculateBMI(Peso: String, Altura: String) {

        val pesoConvertido = Peso.toDouble()
        val altueaConvertida = Altura.toDouble()
        val result: String

        val BMICalculate = pesoConvertido / (altueaConvertida * altueaConvertida)
        val decimalFormat = DecimalFormat("0.00")

        when (BMICalculate){

          in Double.MIN_VALUE..18.5 -> result = "Under weight. \n BMI: ${decimalFormat.format(BMICalculate)}"
            in 18.5..24.9 -> result = "Normal weight. \n BMI: ${decimalFormat.format(BMICalculate)}"
            in 25.0..29.9 -> result = "Overweight. \n BMI: ${decimalFormat.format(BMICalculate)}"
            in 30.0..34.9 -> result = "Obesity 1. \n BMI: ${decimalFormat.format(BMICalculate)}"
            in 35.0..39.9 -> result = "Obesity 2. \n BMI: ${decimalFormat.format(BMICalculate)}"
            else -> result = "Severe Obesity. \n BMI: ${decimalFormat.format(BMICalculate)}"



        }
        BMIResult = result

    }



    fun resultBMI():String {

        return BMIResult


    }

}
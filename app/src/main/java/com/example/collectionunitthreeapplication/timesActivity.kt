package com.example.collectionunitthreeapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
fun main(){
    var result = mul(3,5)
    println("The multiplication of two numbers is: $result")
}
fun mul(num1: Int, num2: Int): Int {
    var number = num1.times(num2)
    return number
}
//fun(s: String): Int { return s.toIntOrNull() ?: 0 }
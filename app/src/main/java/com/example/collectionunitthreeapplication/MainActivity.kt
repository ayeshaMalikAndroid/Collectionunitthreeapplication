package com.example.collectionunitthreeapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

fun main(){
//Types of Collection
    // 1--list
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
   // Log.d("MainActivity", "list:   ${numbers}")
  println("list:   ${numbers}")
    println("sorted: ${numbers.sorted()}")
    //2--set
    val setOfNumbers = numbers.toSet()
    println("set:    ${setOfNumbers}")

    println("Mutable and Immutable\n")
    val set1 = setOf(1,2,3)
    val set2 = mutableSetOf(3,2,1)

    println("$set1 == $set2: ${set1 == set2}")
    println("contains 7: ${setOfNumbers.contains(7)}")




    val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")

println(peopleNames.getOrNull(6))
    println(peopleNames.getOrElse(6) { -1 })
    println(peopleNames.take(3))
    println(peopleNames.takeLast(3))
    println(peopleNames.drop(3))

    println(peopleNames.get(10).isNullOrBlank())


    println(peopleNames.sorted())
    //3--Map
println("Map")
    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 30,
        "Ann" to 23
    )

    val name = mutableListOf<String>("Ayesha","am")
    name.add("ma")

    //update
    peopleAges["Fred"] = 31
    peopleAges.put("Barbara", 42)
    peopleAges["Joe"] = 51
    println(peopleAges)
    val filteredNames = peopleAges.filter { it.key.length < 4 }
    println(filteredNames)

println("Lambda")
    val triple: (Int) -> Int = { a: Int -> a * 3 }
    println(triple(5))

    println("Higher-order functions")
    val peopleName = listOf("Fred", "Ann", "Barbara", "Joe")
    println(peopleName.sorted())
    println(peopleName.sortedWith { str1: String, str2: String -> str1.length - str2.length })


    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
    val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
        .take(3)
        .sorted()
    val filteredWord = words.filter { it.startsWith("c", ignoreCase = true) }
        .shuffled()
        .take(1)

    println(filteredWords)
    println(filteredWord)
fun Int.times(a:Int):Int{

    return 0
}


}



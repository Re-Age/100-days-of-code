package main.kotlin.practice.function

import java.util.ArrayList

fun main(){
    // 1)
    operator fun Int.times(str: String) = str.repeat(this)

    // 2)
    println(2 * "Bye ")
    // Bye Bye

    // 2')
    println(2 * 3)
    // 6

    // 2'')
    println(2 * "3")
    // 33

    // 2''')
    println(2 * "3".toInt())
    // 6

    // 3)
    operator fun String.get(range: IntRange) = substring(range)

    // 4)
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])

}


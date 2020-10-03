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
}


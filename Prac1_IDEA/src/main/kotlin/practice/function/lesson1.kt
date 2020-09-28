package main.kotlin.practice.function

// 1)
fun printMessage(messeage: String): Unit{
    println(messeage)
}

// 2)
fun printMessageWithPrefix(messeage: String, prefix: String = "Info"){
    println("[$prefix] $messeage")
}

// 3)
fun sum(x: Int, y: Int): Int{
    return x + y
}

// 4)
fun multiply(x: Int, y: Int) = x * y

fun main(){
    // 5)    call 1)
    printMessage("Hello")
    // Hello

    // 6)    call 2) with 2 parameters
    printMessageWithPrefix("Hello", "Log")
    // [Log]Hello

    // 7)    call 2) with 1 parameter
    printMessageWithPrefix("Hello")
    // [Info]Hello

    // 8)    call 2)
    printMessageWithPrefix(prefix = "Log", messeage = "Hello")
    // [Log]Hello

    // 9)    call 3)
    println(sum(1, 2))
    // 3
}
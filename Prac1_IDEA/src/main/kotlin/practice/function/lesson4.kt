package main.kotlin.practice.function

fun main(){
    // 1)
    fun printAll(vararg messages: String){
    // void printAll(String... messages){
        for (m in messages) println(m)
    }

    // 2)
    printAll("Hello", "こんにちは", "Salut", "Hola", "你好")
    // Hello こんにちは Salut Hola 你好 が1行ずつで表示

    // 3)
    fun printAllWithPrefix(vararg messages: String, prefix: String){
        for (m in messages) println(prefix + m)
    }

    // 4)
    printAllWithPrefix(
            "Hello", "こんにちは", "Salut", "Hola", "你好",
            prefix = "Greeting: "
    )
    // Greeting: Hello ...順番に出力

    // 5)
    fun log(vararg entries: String){
        printAll(*entries)
    }
    log("Hello", "こんにちは", "Salut", "Hola", "你好")
}
package main.kotlin.practice.function

fun main(){
    // 1)
    infix fun Int.times(str: String) = str.repeat(this)
    // 1')
    infix fun String.repeats(n: Int) = this.repeat(n)

    // These print "ByeBye"
    // 2)
    println(2 times "Bye")
    // 2')
    println("Bye" repeats 2)
    // 2'')
    println(2.times("Bye"))

}
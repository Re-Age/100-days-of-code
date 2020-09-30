package main.kotlin.practice.function

import javax.print.attribute.standard.MediaSize

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

    // 3)
    var pair = "Ferrari" to "Katarina"
    println(pair)
    //  (Ferrari, Katarina)

    // 4)
    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)
    // (McLaren, Lucas)

    // 5)
    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia
}

// 6)
class Person(val name: String){
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {likedPeople.add(other)}
}
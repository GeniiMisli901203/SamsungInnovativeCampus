package module1.PR1

fun main() {
    val str = readln()
    var A = 0
    var T = 0
    var G = 0
    var C = 0
    for (char in str){
        if (char == 'A') A++
        if (char == 'T') T++
        if (char == 'G') G++
        if (char == 'C') C++
    }
    println("$A $T $G $C")
}
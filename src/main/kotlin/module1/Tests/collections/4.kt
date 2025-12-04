package module1.Tests.collections

fun main(){
    val s = readln().split(" ")
    val world = readln()
    var n = 0
    for (i in 0 .. s.size - 1){
        if (s[i] == world) n++
    }
    println(n)
}
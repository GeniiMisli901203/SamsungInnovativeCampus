package module1.Tests.collections

fun main(){
    val string = readln().split(" ")
    val specWord = readln()

    val mass = mutableListOf<Int>()
    for (i in 0 until string.size){
        if (string[i] == specWord){
            mass.add(i)
        }
    }
    println(mass.joinToString(" "))
}
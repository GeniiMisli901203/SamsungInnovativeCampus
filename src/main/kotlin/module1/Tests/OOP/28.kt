package module1.Tests.OOP

//Do not fix this line
fun next(prev: Int): Int = prev * 1000 - 10

fun Int.nextValue(): Int = next(this)


//Do not fix this lines
fun main() {
    val x = readln().toInt()
    println(x.nextValue())
}
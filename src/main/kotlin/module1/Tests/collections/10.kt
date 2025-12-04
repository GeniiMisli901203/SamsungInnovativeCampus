package module1.Tests.collections

fun main(){
    val numbers = mutableListOf(1, 2, 3, 4, 1, 5, 1)
    numbers.add(1)
    numbers.remove(1)
    println(numbers)
}
package module1.Tests.collections

fun main(){
    val firstList = readln().split (" ")
    val secondList = readln().split (" ")

    println((firstList + secondList).joinToString())
}
package module1.Tests.collections

fun checkHeight(iterator: Iterator<Int>) {
    while (iterator.hasNext()){
        val num = iterator.next()
        if (num > 210 || num < 145){
            println("Sorry, not today")
        } else{
            println("You can go!")
        }
    }
}

fun main() {
    val list = readln().split(" ").map(Integer::parseInt).toList()
    checkHeight(list.iterator())
}
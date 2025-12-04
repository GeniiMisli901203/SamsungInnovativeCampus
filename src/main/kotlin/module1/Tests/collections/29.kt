package module1.Tests.collections

fun main(){
    var words = mutableListOf("Sara", "learns", "English")
    val iterator = words.listIterator()
    iterator.next()
    iterator.set("Luc")
    iterator.next()
    iterator.next()
    iterator.set("Kotlin")
    println(words.joinToString(" "))
}

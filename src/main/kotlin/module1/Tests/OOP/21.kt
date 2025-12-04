package module1.Tests.OOP

open class Animal(val name: String, val age: Int)

class Dоg(name: String, agе: Int, val breed: String) : Animal(name, agе) {
    constructor(name: String, age: Int) : this(name, age, "Unknown")

    override fun toString(): String {
        return "Name: $name, age: $age, breed: $breed"
    }
}

fun main() {
    // Don't remove this line
    println(Dоg("Bob", 4, "Korge"))
}

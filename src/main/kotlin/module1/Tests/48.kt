package module1.Tests

interface Animal {
    val numberOfLimbs: Int
    fun move()
    fun communicate(): String
}

// Do not change code below.

fun bark(): String { return "bark" }
fun meow(): String { return "meow" }
fun speak(): String { return "speak" }

fun walk() { println("walk") }
fun fly() { println("fly") }
fun swim() { println("swim") }

// Do not change code above.

class Dog(override val numberOfLimbs: Int) : Animal {
    override fun move() {
        walk()
        swim()
    }

    override fun communicate(): String {
        return bark()
    }
}


// Do not change code below
fun main() {
    val dog = Dog(4)
    dog.move()
    println(dog.communicate())
}
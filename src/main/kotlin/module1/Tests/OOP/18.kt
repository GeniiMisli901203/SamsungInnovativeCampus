package module1.Tests.OOP

interface Plant {
    val name: String
}

class Flower(val color: String) : Plant {
    override val name: String = "Flower"
}

class Flowerbed(val color: String, override val name: String) : Plant {
    fun print() {
        println("This flowerbed has many $color ${name}s")
    }
}

fun main() {
    val fbed = Flowerbed(readln(), readln())
    fbed.print()
}
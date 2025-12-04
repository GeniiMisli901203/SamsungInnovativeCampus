package module1.Tests.OOP

object PlayingField {
    object Size {
        var width: Int = 0
        var height: Int = 0
    }
    fun changeSize (width: Int, length: Int) {
        Size.width = width
        Size.height = length
    }
}

// Don't remove this lines
fun main() {
    val (w,h) = readln().split(" ").map { it.toInt() }
    PlayingField.changeSize(w, h)
    println("${PlayingField.Size.width}, ${PlayingField.Size.height}")
}
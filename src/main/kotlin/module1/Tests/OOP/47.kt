package module1.Tests.OOP

// Do not change the code below.

data class Vector2(var x: Int, var y: Int)

interface Moving {
    var currentCoordinates: Vector2

    var speed: Int

    var direction: Vector2

    // Эта функция изменяет координаты X и Y
    // объекта на величину его скорости
    // (объект имеет одинаковую скорость по осям X и Y)
    // в соответствии с направлением движения объекта.
    fun move() {
    }

    // This function reduces the speed of an object
    // along X and Y axes, subtracting given amount.
    fun slowDown(subtractedSpeed: Int){
    }

    // Эта функция уменьшает скорость объекта
    // по осям X и Y, вычитая заданную величину.
    fun speedUp(addedSpeed: Int) {
    }

    // Эта функция задаёт новое направление для объекта,
    // перезаписывая предыдущие значения.
    fun rotate(newDirection: Vector2){
    }
}

// Do not change the code above.

class YourMovingObject(
    override var currentCoordinates: Vector2,
    override var speed: Int,
    override var direction: Vector2
) : Moving {

    override fun move() {
        currentCoordinates.x += speed * direction.x
        currentCoordinates.y += speed * direction.y
    }

    override fun slowDown(subtractedSpeed: Int) {
        speed = maxOf(0, speed - subtractedSpeed)
    }

    override fun speedUp(addedSpeed: Int) {
        speed += addedSpeed
    }

    override fun rotate(newDirection: Vector2) {
        direction = newDirection
    }
}

// Do not change the code below
fun main() {
    val movingObject = YourMovingObject(Vector2(1,2),10, Vector2(4,4))
    println(movingObject.currentCoordinates)
    movingObject.move()
    println(movingObject.currentCoordinates)
}
package module1.PR4


enum class Direction {
    UP, DOWN, LEFT, RIGHT
}

class Robot(var x: Int, var y: Int, var direction: Direction) {

    fun turnLeft() {
        direction = when (direction) {
            Direction.UP -> Direction.LEFT
            Direction.LEFT -> Direction.DOWN
            Direction.DOWN -> Direction.RIGHT
            Direction.RIGHT -> Direction.UP
        }
    }

    fun turnRight() {
        direction = when (direction) {
            Direction.UP -> Direction.RIGHT
            Direction.RIGHT -> Direction.DOWN
            Direction.DOWN -> Direction.LEFT
            Direction.LEFT -> Direction.UP
        }
    }

    fun stepForward() {
        when (direction) {
            Direction.UP -> y++
            Direction.DOWN -> y--
            Direction.RIGHT -> x++
            Direction.LEFT -> x--
        }
    }

    override fun toString(): String = "x: $x, y: $y, dir: $direction"
}

fun main() {
    val robot = Robot(0, 0, Direction.UP)
    println(robot) // x: 0, y: 0, dir: UP

    robot.turnRight()
    robot.stepForward()
    println(robot) // x: 1, y: 0, dir: RIGHT
}
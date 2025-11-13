package module1.PR4

fun moveRobot(r: Robot, toX: Int, toY: Int) {
    while (r.x < toX){
        when (r.direction) {
            Direction.UP -> r.turnRight()
            Direction.DOWN -> r.turnLeft()
            Direction.RIGHT -> {}
            Direction.LEFT -> {
                r.turnRight()
                r.turnRight()}
            }
        r.stepForward()
    }
    while (r.x > toX){
        when (r.direction){
            Direction.UP -> r.turnLeft()
            Direction.DOWN -> r.turnRight()
            Direction.RIGHT -> {
                r.turnRight()
                r.turnRight()
            }
            Direction.LEFT -> {}
        }
        r.stepForward()
    }
    while (r.y < toY){
        when (r.direction){
            Direction.DOWN -> {
                r.turnRight()
                r.turnRight()
            }
            Direction.UP -> {}
            Direction.RIGHT -> r.turnLeft()
            Direction.LEFT -> r.turnRight()
        }
        r.stepForward()
    }
    while (r.y > toY){
        when (r.direction){
            Direction.DOWN -> {}
            Direction.UP -> {
                r.turnRight()
                r.turnRight()
            }
            Direction.RIGHT -> r.turnRight()
            Direction.LEFT -> r.turnLeft()
        }
        r.stepForward()
    }
}



fun main() {
    val r = Robot(0, 1, Direction.UP)
    println("Начало: $r")
    moveRobot(r, 3, 7)
    println("Конец: $r") // Ожидается: x: 3, y: 7, dir: UP
}
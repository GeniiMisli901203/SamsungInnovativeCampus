package module1.PR4

enum class Directions{
    Up, Down, Left, Right
}

class Robot (var x: Int, var y: Int, var direction: Directions){
    public fun turnLeft(){
        direction = when (direction){
            Directions.Up -> Directions.Left
            Directions.Left -> Directions.Down
            Directions.Down -> Directions.Right
            Directions.Right -> Directions.Up
        }
    }

    public fun turnRight (){
        direction = when (direction){
            Directions.Up -> Directions.Right
            Directions.Right -> Directions.Down
            Directions.Down -> Directions.Left
            Directions.Left -> Directions.Up
        }
    }

    public fun stepForward (){
        when (direction){
            Directions.Up -> y++
            Directions.Down -> y--
            Directions.Right -> x++
            Directions.Left -> x--
        }
    }

    override fun toString () : String = "x: $x, y: $y, dir: $direction"
}

fun main(){
    val robot: Robot = Robot (0, 0, Directions.Up)
    println(robot)

    robot.turnRight()
    robot.stepForward()
    println(robot)
}
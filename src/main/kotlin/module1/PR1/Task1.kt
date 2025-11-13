package module1.PR1

fun main(){
    val (a, b, m, n) = readln().split(" ").map {it.toDouble()}
    if (m < a && n < b || n < a && m < b){
        println("YES")
    } else{
        println("NO")
    }
}

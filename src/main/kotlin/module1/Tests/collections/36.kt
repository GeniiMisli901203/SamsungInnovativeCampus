package module1.Tests.collections

data class User(val name: String, val age: Int, val email: String)

class UserComparator : Comparator<User> {
    override fun compare(user1: User, user2: User): Int {
        return compareBy<User>{ it.age }.thenBy { it.name }.compare(user1, user2)
    }
}

fun main() {
// Не изменяйте код ниже
    val list = listOf(
        User("Sam",20,"sam@dot.com"),
        User("Max",21,"max@name.com"),
        User("Alex",21,"alex@name.com"),
        User("Alex",19,"alex20@name.com"))
    println(list.sortedWith(UserComparator()))
}
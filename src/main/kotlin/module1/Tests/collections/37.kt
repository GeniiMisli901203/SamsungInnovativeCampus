package module1.Tests.collections

class Book(val title: String, val author: String, val price: Double)

fun main() {
    val books = listOf(
        Book("The Great Gatsby", "F. Scott Fitzgerald", 12.99),
        Book("To Kill a Mockingbird", "Harper Lee", 10.99),
        Book("1984", "George Orwell", 8.99),
        Book("The Catcher in the Rye", "J.D. Salinger", 9.99)
    )
    val comparator: Comparator<Book> = object: Comparator<Book> {
        override fun compare(b1: Book, b2: Book): Int {
            return b1.price.compareTo(b2.price)
        }
    }


    val sortedBooks = books.sortedWith(comparator)

    sortedBooks.forEach { println("${it.title} - ${it.author} - ${it.price}") }
}
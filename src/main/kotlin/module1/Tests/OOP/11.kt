package module1.Tests.OOP

class LewisCarrollBook() {
    var name: String = ""
        set(value) {
            println("Now, a book called $value")
            field = value
        }
        get() {
            println("The name of the book is $field")
            return field
        }

    val author: String = "Lewis Carroll"
        get() {
            println("The author of the book is $field")
            return field
        }

    var price: Int = 0
        set(value) {
            println("Putting a new price...")
            println("The new price is $value")
            field = value
        }
        get() {
            return field
        }
}

fun main() {
    val lewisCarrollBook = LewisCarrollBook()
    var bookName = lewisCarrollBook.name
    lewisCarrollBook.name = "Alice's Adventures in Wonderland"
    bookName = lewisCarrollBook.name
    var authorName = lewisCarrollBook.author
    var bookPrice = lewisCarrollBook.price
    lewisCarrollBook.price = 1500
}
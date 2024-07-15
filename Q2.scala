import scala.collection.mutable.Set

case class Book(title: String, author: String, isbn: String)

object Q2{

  var library: Set[Book] = Set(
    Book("The Great Gatsby", "F. Scott Fitzgerald", "9780142437226"),
    Book("To Kill a Mockingbird", "Harper Lee", "9780061120084"),
    Book("1984", "George Orwell", "9780451524935")
  )

  def addBook(book: Book): Unit = {
    library += book
    println(s"Added: ${book.title} by ${book.author}")
  }

  def removeBook(isbn: String): Unit = {
    val removedBook = library.find(_.isbn == isbn)
    removedBook match {
      case Some(book) =>
        library -= book
        println(s"Removed: ${book.title} by ${book.author}")
      case None =>
        println(s"No book found with ISBN: $isbn")
    }
  }

  def containsBook(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }

  def displayLibrary(): Unit = {
    println("Current Library Collection:")
    library.foreach { book =>
      println(s"${book.title} by ${book.author} (ISBN: ${book.isbn})")
    }
  }

  def searchByTitle(title: String): Unit = {
    val foundBook = library.find(_.title.toLowerCase == title.toLowerCase)
    foundBook match {
      case Some(book) =>
        println(s"Book Found:\n${book.title} by ${book.author} (ISBN: ${book.isbn})")
      case None =>
        println(s"No book found with title: $title")
    }
  }

  def displayBooksByAuthor(author: String): Unit = {
    val booksByAuthor = library.filter(_.author.toLowerCase == author.toLowerCase)
    if (booksByAuthor.nonEmpty) {
      println(s"Books by $author:")
      booksByAuthor.foreach { book =>
        println(s"${book.title} (ISBN: ${book.isbn})")
      }
    } else {
      println(s"No books found by author: $author")
    }
  }

  def main(args: Array[String]): Unit = {

    val newBook = Book("Pride and Prejudice", "Jane Austen", "9780141439518")
    addBook(newBook)


    val isbnToRemove = "9780451524935"
    removeBook(isbnToRemove)


    val isbnToCheck = "9780061120084"
    println(s"Book with ISBN $isbnToCheck exists: ${containsBook(isbnToCheck)}")


    displayLibrary()


    val searchTitle = "to kill a mockingbird"
    searchByTitle(searchTitle)

    
    val searchAuthor = "Harper Lee"
    displayBooksByAuthor(searchAuthor)
  }
}



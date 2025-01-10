/**
 * Book Class
 * Represents a book in the library with a title, author, and BookNo.
 * Implements the Comparable interface to allow sorting by BookNo.
 *
 * @author Clinton Maina
 */
public class Book implements Comparable<Book> {
    private String BookNo;
    private String title;
    private String author;

    /**
     * Constructor to create a new book.
     *
     * @param BookNo   - Book Number.
     * @param title  - The title of the book.
     * @param author - The author of the book.
     */
    public Book(String BookNo, String title, String author) {
        this.BookNo = BookNo;
        this.title = title;
        this.author = author;
    }

    // Getters and Setters
    public String getBookNo() {
        return BookNo;
    }

    public void setBookNo(String BookNo) {
        this.BookNo = BookNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Compares this book with another book based on ISBN.
     *
     * @param other - The other book to compare to.
     * @return A negative integer, zero, or a positive integer as this book's number
     *         is less than, equal to, or greater than the other book's number.
     */
    @Override
    public int compareTo(Book other) {
        return this.BookNo.compareTo(other.BookNo);
    }

    // Optionally override toString, equals, and hashCode if needed
    @Override
    public String toString() {
        return "Book [BookNo=" + BookNo + ", Title=" + title + ", Author=" + author + "]";
    }
}

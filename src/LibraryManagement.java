/**
 * LibraryManagement Interface
 * Description: Defines the contract for a library management system, specifying methods
 * for adding, removing, and searching for books.

 * Key Features:
 * - Provides abstraction for different implementations of library management.
 *
 * @author Mercy Gitonga
 */
public interface LibraryManagement {
    void addBook(String isbn, String title, String author);
    boolean removeBook(String BookNo);
    String searchBook(String BookNo);

    void deleteBook(String deleteIsbn);

    void updateBook(String updateIsbn, String updateTitle, String updateAuthor);

}

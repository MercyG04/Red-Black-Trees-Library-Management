/**
 * LibraryRedBlackTree Class
 * Description: Implements the LibraryManagement interface using a Red-Black Tree to manage book records.

 * Key Features:
 * - Efficiently adds, removes, and searches for books.
 * - Utilizes a Red-Black Tree for balanced operations.
 *
 * @errorHandling:
 * - Ensures book operations maintain the properties of the Red-Black Tree.
 *
 * @dependencies:
 * - Relies on RedBlackTree and Book classes for functionality.
 *
 * @invariant The tree remains balanced after any operation.
 *
 * @preconditions All book details must be valid and non-null.
 * @postconditions The tree is updated according to the operation performed.
 *
 * @see RedBlackTree
 * @see Book
 *
 * @author
 */
public class LibraryRedBlackTree implements LibraryManagement {
    private RedBlackTree<Book> bookTree = new RedBlackTree<>();

    @Override
    public void addBook(String BookNo, String title, String author) {
        Book book = new Book(BookNo, title, author);
        bookTree.insert(book);
    }

    @Override
    public boolean removeBook(String BookNo) {
        return bookTree.delete(new Book(BookNo, null, null)); // Simplified for illustration
    }

    @Override
    public String searchBook(String BookNo) {
        Book book = bookTree.search(new Book(BookNo, null, null)); // Simplified for illustration
        return (book != null) ? book.getTitle() : null;
    }
}


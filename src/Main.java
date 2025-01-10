/**
 * Main Class
 * Description: Entry point for testing the Library Management System with Red-Black Tree.
 *
 * Key Features:
 * - Demonstrates the usage of the system.
 * - Tests adding, removing, and searching for books.
 *
 * @author
 */
public class Main {
    public static void main(String[] args) {
        LibraryManagement library = new LibraryRedBlackTree();
        library.addBook("123456789", "Effective Java", "Joshua Bloch");
        library.addBook("987654321", "Clean Code", "Robert C. Martin");

        System.out.println("Search for 123456789: " + library.searchBook("123456789"));
        System.out.println("Search for 987654321: " + library.searchBook("987654321"));
    }
}

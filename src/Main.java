import java.util.Scanner;

/**
 * Main Class
 * Description: Entry point for testing the Library Management System with Red-Black Tree.
 *
 * Key Features:
 * - Demonstrates the usage of the system.
 * - Tests adding, removing, and searching for books.
 *
 * @author Giovanni Opiyo 
 */
public class Main {
    public static void main(String[] args) {
        LibraryManagement library = new LibraryRedBlackTree();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Delete Book");
            System.out.println("3. Update Book");
            System.out.println("4. Search Book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add Book
                    System.out.print("Enter Book Number: ");
                    String addBookNo = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String addTitle = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String addAuthor = scanner.nextLine();
                    library.addBook(addBookNo, addTitle, addAuthor);
                    System.out.println("Book added successfully.");
                    break;
                case 2: // Delete Book
                    System.out.print("Enter Book Number to delete: ");
                    String deleteBookNo = scanner.nextLine();
                    if (library.deleteBook(deleteBookNo)) {
                        System.out.println("Book deleted successfully.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 3: // Update Book
                    System.out.print("Enter Book Number to update: ");
                    String updateBookNo = scanner.nextLine();
                    System.out.print("Enter New Title: ");
                    String updateTitle = scanner.nextLine();
                    System.out.print("Enter New Author: ");
                    String updateAuthor = scanner.nextLine();
                    if (library.updateBook(updateBookNo, updateTitle, updateAuthor)) {
                        System.out.println("Book updated successfully.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4: // Search Book
                    System.out.print("Enter Book Number to search: ");
                    String searchBookNo = scanner.nextLine();
                    String result = library.searchBook(searchBookNo);
                    if (result != null) {
                        System.out.println("Book found: " + result);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 5: // Exit
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

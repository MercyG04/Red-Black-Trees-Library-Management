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
                    System.out.print("Enter ISBN: ");
                    String addIsbn = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String addTitle = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String addAuthor = scanner.nextLine();
                    library.addBook(addIsbn, addTitle, addAuthor);
                    break;
                case 2: // Delete Book
                    System.out.print("Enter ISBN to delete: ");
                    String deleteIsbn = scanner.nextLine();
                    library.deleteBook(deleteIsbn);
                    break;
                case 3: // Update Book
                    System.out.print("Enter ISBN to update: ");
                    String updateIsbn = scanner.nextLine();
                    System.out.print("Enter New Title: ");
                    String updateTitle = scanner.nextLine();
                    System.out.print("Enter New Author: ");
                    String updateAuthor = scanner.nextLine();
                    library.updateBook(updateIsbn, updateTitle, updateAuthor);
                    break;
                case 4: // Search Book
                    System.out.print("Enter ISBN to search: ");
                    String searchIsbn = scanner.nextLine();
                    System.out.println("Result: " + library.searchBook(searchIsbn));
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


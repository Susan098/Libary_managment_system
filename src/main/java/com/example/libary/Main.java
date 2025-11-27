import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Library Management System ");
        System.out.println("1. Add Book");
        System.out.println("2. Register Member");
        System.out.println("3. Issue Book");
        System.out.println("4. Return Book");
        System.out.println("5. View Books");
        System.out.println("6. View Members");
        System.out.println("7. Exit");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); 

        if (choice == 1) {
            System.out.println("1. Add Book");
            System.out.print("Please enter the book title: ");
            String bookTitle = sc.nextLine();
            System.out.println("Book '" + bookTitle + "' added successfully!");
        } 
        else if (choice == 2) {
            System.out.println("2. Register Member");
            System.out.print("Please enter the member's name: ");
            String memberName = sc.nextLine();
            System.out.println("Member '" + memberName + "' registered successfully!");
        } 
        else if (choice == 3) {
            System.out.println("3. Issue Book");
            System.out.print("Enter book title to issue: ");
            String issueBook = sc.nextLine();
            System.out.print("Enter member name: ");
            String member = sc.nextLine();
            System.out.println("Book '" + issueBook + "' issued to '" + member + "' successfully!");
        } 
        else if (choice == 4) {
            System.out.println("4. Return Book");
            System.out.print("Enter book title to return: ");
            String returnBook = sc.nextLine();
            System.out.println("Book '" + returnBook + "' returned successfully!");
        } 
        else if (choice == 5) {
            System.out.println("5. View Books");
            System.out.println("Displaying all books (this is a placeholder).");
        } 
        else if (choice == 6) {
            System.out.println("6. View Members");
            System.out.println("Displaying all members (this is a placeholder).");
        } 
        else if (choice == 7) {
            System.out.println("Exiting system. Goodbye!");
        } 
        else {
            System.out.println("Invalid choice. Please try again.");
        }

        sc.close();
    }
}

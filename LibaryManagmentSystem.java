import java.util.ArrayList;
import java.util.Scanner;
{
class Book {
    int id;
    String title;
    String author;
    int year;

    Book(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString() {
        return id + " | " + title + " | " + author + " | " + year;
    }
}
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(1, "Foundation of mathematics engineering", "Durga jang K.C", 2078));
        books.add(new Book(2, "Principles of Engineering Physics", "Dr.Rajendra Parsad Khanal", 2078));
        books.add(new Book(3, "Modern Chemistry", "Dr.Daman Raj Gautam", 2078));
        books.add(new Book(4, "English", "Susan dai", 2082));
        books.add(new Book(5, "Nepali", "Mina Sapkota", 2082));
        books.add(new Book(6, "Java", "Apar Bhandari", 2079));
        books.add(new Book(7, "Coa", "Saugat don", 2081));
        books.add(new Book(8, "Mobile Application", "Don Dai ly", 2080));
        books.add(new Book(9, "Operating System", "Devi lal Adhakari", 2083));

        while (true) {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. View Books");
            System.out.println("2. Add Book");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            String input = sc.nextLine();
            int choice;
            try {
                choice = Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("* Invalid input! Please enter a number (1-5).");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("\n--- List of Books ---");
                    for (Book b : books) {
                        System.out.println(b);
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Enter ID: ");
                        int id = Integer.parseInt(sc.nextLine().trim());

                        System.out.print("Enter Title: ");
                        String title = sc.nextLine();

                        System.out.print("Enter Author: ");
                        String author = sc.nextLine();

                        System.out.print("Enter Year: ");
                        int year = Integer.parseInt(sc.nextLine().trim());

                        books.add(new Book(id, title, author, year));
                        System.out.println(" Book added!");
                    } catch (NumberFormatException e) {
                        System.out.println("* Invalid input! Book not added.");
                    }
                    break;

                case 3:
                    try {
                        System.out.print("Enter Book ID to update: ");
                        int uid = Integer.parseInt(sc.nextLine().trim());
                        boolean found = false;
                        for (Book b : books) {
                            if (b.id == uid) {
                                System.out.print("Enter new Title: ");
                                b.title = sc.nextLine();
                                System.out.print("Enter new Author: ");
                                b.author = sc.nextLine();
                                System.out.print("Enter new Year: ");
                                b.year = Integer.parseInt(sc.nextLine().trim());
                                System.out.println(" Book updated!");
                                found = true;
                                break;
                            }
                        }
                        if (!found) System.out.println("* Book not found!");
                    } catch (NumberFormatException e) {
                        System.out.println("* Invalid input! Update failed.");
                    }
                    break;

                case 4:
                    try {
                        System.out.print("Enter Book ID to delete: ");
                        int did = Integer.parseInt(sc.nextLine().trim());
                        Book toRemove = null;
                        for (Book b : books) {
                            if (b.id == did) {
                                toRemove = b;
                                break;
                            }
                        }
                        if (toRemove != null) {
                            books.remove(toRemove);
                            System.out.println(" Book deleted!");
                        } else {
                            System.out.println("* Book not found!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("* Invalid input! Delete failed.");
                    }
                    break;

                case 5:
                    System.out.println(" Exiting... Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("* Invalid choice. Try again!");
            }
        }
    }
}
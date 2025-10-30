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
{
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

            }
        }
    }
}

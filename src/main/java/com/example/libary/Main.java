ppackage com.example.libary;

import java.util.Scanner;

import com.example.libary.controller.LibraryController;
import com.example.libary.dao.LibraryDao;
import com.example.libary.service.BookService;
import com.example.libary.service.MemberService;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LibraryDao dao = new LibraryDao();
        BookService bookService = new BookService(dao);
        MemberService memberService = new MemberService(dao);

        LibraryController controller = new LibraryController(bookService, memberService);

        while (true) {
            System.out.println("\nLibrary Management System ");
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

            controller.handleChoice(choice);

            if (choice == 7) {
                System.out.println("Goodbye!");
                break;
            }
        }

        sc.close();
    }
}

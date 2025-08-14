package QTechSolutionsProjects.Project1;

import java.util.*;

public class OnlineBookStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookDAO dao = new BookDAO();

        System.out.println("=== Online Bookstore ===");
        System.out.println("1. Search by Category");
        System.out.println("2. Search by Title");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter category: ");
                String category = sc.nextLine();
                List<Book> catBooks = dao.getBooksByCategory(category);
                for(Book b : catBooks){
                    System.out.println(b);
                }
                break;

            case 2:
                System.out.print("Enter title keyword: ");
                String title = sc.nextLine();
                List<Book> titleBooks = dao.searchBooksByTitle(title);
                for(Book b : titleBooks){
                    System.out.println(b);
                }
                break;

            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    } 
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HPPRODUCT {
    public static void main(String[] args) {
        laptop hp1 = new laptop(456, 840, 00351, 1, 2307, 12, 1.5000);

    }
}

interface hpproduct1 {
    public void produt();

}

class laptop implements hpproduct1 {
    int model;
    int productid;


    int description;
    double price;
    double manufacturer;

    int quantityinStock;

    double imgeurl;

    public laptop(double imgeurl, int productid, int model, int quantityinStock, int description, double price, double manufacturer) {

        this.imgeurl = imgeurl;
        this.description = description;
        this.price = price;
        this.manufacturer = manufacturer;
        this.model = model;
        this.quantityinStock = quantityinStock;


        this.productid = productid;

    }

    @Override
    public void produt() {
        System.out.println("hp product");

    }

    @Override
    public String toString() {
        return "laptop{" +

                " , imgeurl= ' " + imgeurl + '\'' +
                ", descripyion= ' " + description + '\'' +
                ", price = ' " + price + '\'' +
                " , manufacturer = ' " + manufacturer + '\'' +
                " , model=' " + model + '\'' +
                ", quantityinstock=' " + quantityinStock + '\'' +


                "' productid='" + productid + '\'' +
                '}';


    }
}
class Book {
    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }

        System.out.println("Library Books:");
        for (Book book : books) {
            System.out.println("ID: " + book.getId());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("---------------");
        }
    }

    public void searchBook(String keyword) {
        List<Book> matchingBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                    book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                matchingBooks.add(book);
            }
        }

        if (matchingBooks.isEmpty()) {
            System.out.println("No matching books found.");
            return;
        }

        System.out.println("Matching Books:");
        for (Book book : matchingBooks) {
            System.out.println("ID: " + book.getId());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("---------------");
        }
    }
}

class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Adding sample books
        library.addBook(new Book(1, "Java Programming", "John Smith"));
        library.addBook(new Book(2, "Python Basics", "Jane Doe"));
        library.addBook(new Book(3, "Data Structures", "Robert Johnson"));

        while (true) {
            System.out.println("1. Display all books");
            System.out.println("2. Search a book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    scanner.nextLine(); // Clear the newline character
                    System.out.print("Enter a keyword to search: ");
                    String keyword = scanner.nextLine();
                    library.searchBook(keyword);
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            System.out.println();
        }
    }
}

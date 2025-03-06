public class LibraryManagement {
    public static void main(String[] args) {
        Book fictionBook = new Fiction("Harry Potter", "J.K. Rowling", 500);
        Book nonFictionBook = new NonFiction("Sapiens", "Yuval Noah Harari", 700);
        fictionBook.displayDetails();
        System.out.println();
        nonFictionBook.displayDetails();
    }
}
class Book {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Fiction extends Book {
    public Fiction(String title, String author, int price) {
        super(title, author, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("Fiction Book Details:");
        super.displayDetails();
    }
}

class NonFiction extends Book {
    public NonFiction(String title, String author, int price) {
        super(title, author, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("Non-Fiction Book Details:");
        super.displayDetails();
    }
}

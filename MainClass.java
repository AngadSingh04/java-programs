// Define the Book class
class Book {
    String title;   // Attribute to store the book's title
    String author;  // Attribute to store the book's author

    // Method to display the book's details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Main class to test the Book class
public class MainClass {
    public static void main(String[] args) {
        // Create instances of the Book class
        Book book1 = new Book();
        Book book2 = new Book();
        
        // Set attributes for book1
        book1.title = "To Kill a Mockingbird";
        book1.author = "Harper Lee";
        
        // Set attributes for book2
        book2.title = "1984";
        book2.author = "George Orwell";
        
        // Display details of both books
        book1.displayDetails();
        book2.displayDetails();
    }
}
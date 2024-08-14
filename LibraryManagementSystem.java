import java.util.*;

class Book {
    String title, author, ISBN;
    boolean isBorrowed = false;
    Date dueDate;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void borrow() {
        isBorrowed = true;
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 7);
        dueDate = calendar.getTime();
    }

    public void returnBook() {
        isBorrowed = false;
        dueDate = null;
    }

    public boolean isOverdue() {
        if (isBorrowed && dueDate != null) {
            return new Date().after(dueDate);
        }
        return false;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Borrowed: " + isBorrowed);
    }
}

class Member {
    String name, memberID;
    List<Book> borrowedBooks = new ArrayList<>();

    public Member(String name, String memberID) {
        this.name = name;
        this.memberID = memberID;
    }

    public void borrowBook(Book book) {
        if (borrowedBooks.contains(book)) {
            System.out.println("You have already borrowed the book: " + book.title);
        } else {
            borrowedBooks.add(book);
            book.borrow();
            System.out.println("You have successfully borrowed the book: " + book.title);
        }
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.returnBook();
    }

    public void displayDetails() {
        System.out.println("Member: " + name + ", ID: " + memberID + ", Books Borrowed: " + borrowedBooks.size());
    }
}

class Library {
    List<Book> books = new ArrayList<>();
    List<Member> members = new ArrayList<>();
    List<String> transactions = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void borrowBook(Member member, Book book) {
        if (book.isBorrowed) {
            System.out.println("Book already borrowed by someone else.");
        } else {
            member.borrowBook(book);
            transactions.add("Book borrowed: " + book.title + " by " + member.name);
        }
    }

    public void returnBook(Member member, Book book) {
        member.returnBook(book);
        transactions.add("Book returned: " + book.title + " by " + member.name);
    }

    public void searchBook(String keyword) {
        boolean found = false;
        for (Book book : books) {
            if (book.title.contains(keyword) || book.author.contains(keyword) || book.ISBN.contains(keyword)) {
                book.displayDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book not found!");
        }
    }

    public void displayOverdueBooks() {
        System.out.println("Displaying overdue books...");
        boolean foundOverdue = false;
        for (Member member : members) {
            for (Book book : member.borrowedBooks) {
                if (book.isOverdue()) {
                    System.out.println("Member: " + member.name + " has an overdue book: " + book.title);
                    foundOverdue = true;
                }
            }
        }
        if (!foundOverdue) {
            System.out.println("No overdue books found.");
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Java Programming", "John Doe", "123456"));
        library.addBook(new Book("Python Essentials", "Jane Smith", "7891011"));
        library.addMember(new Member("Alice", "M001"));
        library.addMember(new Member("Bob", "M002"));

       
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Borrow Book");
            System.out.println("2. Return Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display Overdue Books");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.println("Enter Member ID:");
                    String memberId = scanner.nextLine();
                    Member member = null;
                    for (Member m : library.members) {
                        if (m.memberID.equals(memberId)) {
                            member = m;
                            break;
                        }
                    }

                    if (member == null) {
                        System.out.println("Member not found!");
                        break;
                    }

                    System.out.println("Enter Book ISBN:");
                    String isbn = scanner.nextLine();
                    Book book = null;
                    for (Book b : library.books) {
                        if (b.ISBN.equals(isbn)) {
                            book = b;
                            break;
                        }
                    }

                    if (book == null) {
                        System.out.println("Book not found!");
                        break;
                    }

                    library.borrowBook(member, book);
                    break;

                case 2:
                    System.out.println("Enter Member ID:");
                    memberId = scanner.nextLine();
                    member = null;
                    for (Member m : library.members) {
                        if (m.memberID.equals(memberId)) {
                            member = m;
                            break;
                        }
                    }

                    if (member == null) {
                        System.out.println("Member not found!");
                        break;
                    }

                    System.out.println("Enter Book ISBN:");
                    isbn = scanner.nextLine();
                    book = null;
                    for (Book b : library.books) {
                        if (b.ISBN.equals(isbn)) {
                            book = b;
                            break;
                        }
                    }

                    if (book == null) {
                        System.out.println("Book not found!");
                        break;
                    }

                    library.returnBook(member, book);
                    System.out.println("Book returned successfully!");
                    break;

                case 3:
                    System.out.println("Enter keyword to search:");
                    String keyword = scanner.nextLine();
                    library.searchBook(keyword);
                    break;

                case 4:
                    library.displayOverdueBooks();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

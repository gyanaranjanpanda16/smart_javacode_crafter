package com.gyanaranjan.NewJava8ProgramCollection;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    private LocalDate dueDate;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}

class User {
    private String username;
    private String password;
    private List<Book> borrowedBooks;
    private Map<Book, LocalDate> borrowedBooksWithDueDate;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.borrowedBooks = new ArrayList<>();
        this.borrowedBooksWithDueDate = new ConcurrentHashMap<>();
    }

    public String getUsername() {
        return username;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public Map<Book, LocalDate> getBorrowedBooksWithDueDate() {
        return borrowedBooksWithDueDate;
    }

    public void borrowBook(Book book, LocalDate dueDate) {
        borrowedBooks.add(book);
        borrowedBooksWithDueDate.put(book, dueDate);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        borrowedBooksWithDueDate.remove(book);
    }
}

class Library {
    private List<Book> books;
    private List<User> users;
    private Map<User, Integer> fines;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
        this.fines = new ConcurrentHashMap<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addUser(User user) {
        users.add(user);
        fines.put(user, 0);
    }

    public void borrowBook(User user, Book book, LocalDate dueDate) {
        if (!book.isAvailable()) {
            System.out.println("Book " + book.getTitle() + " is currently unavailable.");
            return;
        }
        user.borrowBook(book, dueDate);
        book.setAvailable(false);
        book.setDueDate(dueDate);
        System.out.println(user.getUsername() + " borrowed " + book.getTitle() + " due on " + dueDate);
    }

    public void returnBook(User user, Book book) {
        user.returnBook(book);
        book.setAvailable(true);
        LocalDate dueDate = book.getDueDate();
        LocalDate currentDate = LocalDate.now();
        if (currentDate.isAfter(dueDate)) {
            long daysLate = currentDate.toEpochDay() - dueDate.toEpochDay();
            int fine = (int) daysLate * 5; // Assuming a fine of $5 per day
            fines.put(user, fines.get(user) + fine);
            System.out.println(user.getUsername() + " returned " + book.getTitle() + " late. Fine: $" + fine);
        } else {
            System.out.println(user.getUsername() + " returned " + book.getTitle());
        }
    }

    public void searchBooks(String keyword) {
        List<Book> results = books.stream()
                .filter(b -> b.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                        b.getAuthor().toLowerCase().contains(keyword.toLowerCase()))
                .toList();
        if (!results.isEmpty()) {
            System.out.println("Search results for '" + keyword + "':");
            results.forEach(System.out::println);
        } else {
            System.out.println("No books found for '" + keyword + "'.");
        }
    }

    public void displayAvailableBooks() {
        List<Book> availableBooks = books.stream()
                .filter(Book::isAvailable)
                .toList();
        if (!availableBooks.isEmpty()) {
            System.out.println("Available Books:");
            availableBooks.forEach(System.out::println);
        } else {
            System.out.println("No available books in the library.");
        }
    }

    public void sortBooksByTitle() {
        List<Book> sortedBooks = books.stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .toList();
        System.out.println("Books sorted by title:");
        sortedBooks.forEach(System.out::println);
    }

    public void sortBooksByAuthor() {
        List<Book> sortedBooks = books.stream()
                .sorted(Comparator.comparing(Book::getAuthor))
                .toList();
        System.out.println("Books sorted by author:");
        sortedBooks.forEach(System.out::println);
    }

    public void displayFines() {
        fines.forEach((user, fine) -> {
            if (fine > 0) {
                System.out.println("User: " + user.getUsername() + ", Fine: $" + fine);
            }
        });
    }
}

 class LibrarySystem {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");

        User user1 = new User("alice", "password1");
        User user2 = new User("bob", "password2");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.addUser(user1);
        library.addUser(user2);

        library.borrowBook(user1, book1, LocalDate.now().plusDays(14));
        library.borrowBook(user2, book2, LocalDate.now().plusDays(7));
        library.borrowBook(user1, book3, LocalDate.now().plusDays(21));

        library.returnBook(user1, book1);
        library.returnBook(user2, book2);
        library.returnBook(user1, book3);

        library.addBook(new Book("Java 8 in Action", "Raoul-Gabriel Urma"));
        library.addBook(new Book("Clean Code", "Robert C. Martin"));

        library.searchBooks("Java");
        library.displayAvailableBooks();
        library.sortBooksByTitle();
        library.sortBooksByAuthor();

        // Simulate late returns and fines
        library.borrowBook(user1, book1, LocalDate.now().minusDays(20));
        library.returnBook(user1, book1);
        library.displayFines();
    }
}
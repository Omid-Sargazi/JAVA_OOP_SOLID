package ProjectsPractical.LibraryManagementSystem;

public class Library {
    public static void main(String[] args) {
        User member = new Member("Alice", "M001");
        User librarian = new Librarian("Bob", "L001");

        Book book = new Book("Effective Java", "Joshua Bloch", "978-0134685991");

        member.borrowBook(book);
        librarian.borrowBook(book);
    }
}

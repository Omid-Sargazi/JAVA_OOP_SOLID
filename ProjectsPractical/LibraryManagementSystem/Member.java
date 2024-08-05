package ProjectsPractical.LibraryManagementSystem;

public class Member extends User {
    public Member(String name, String id) {
        super(name, id);
    }

    @Override
    public void borrowBook(Book book) {
        System.out.println(getName() + " borrowed " + book.getTitle());
    }
}

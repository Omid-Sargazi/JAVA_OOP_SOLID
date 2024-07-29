package Projects.LibrarySystemDevelopmentUsingDAD;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public List<Member> listMembers() {
        return members;
    }

    public List<Book> listBooks() {
        return books;
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(
                    "Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
        }
    }

    public void displayMembers() {
        for (Member member : members) {
            System.out.println("Name: " + member.getName() + ", Member ID: " + member.getMemberId());
        }
}
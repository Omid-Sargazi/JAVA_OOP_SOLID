package JavaProblems.LibrarySystem;

import java.time.LocalDate;

public class Loan {
    private Book book;
    private Patron patron;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public Loan(Book book, Patron patron, LocalDate borrowDate, LocalDate returnDate) {
        this.book = book;
        this.patron = patron;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public void returnBook() {
        this.returnDate = LocalDate.now();
    }
}

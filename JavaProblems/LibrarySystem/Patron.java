package JavaProblems.LibrarySystem;

import java.util.List;

public class Patron extends User {
    private List<Loan> loans;

    public Patron(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public void login() {
    }

    @Override
    public void logout() {
    }
}

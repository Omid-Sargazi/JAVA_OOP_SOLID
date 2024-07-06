package Library.factory;

import Library.entity.Member;
import Library.entity.Librarian;
import Library.entity.User;

public class UserFactory {
    public static User createUser(String type, String username, String password) {
        switch (type.toLowerCase()) {
            case "member":
                return new Member(username, password);
            case "librarian":
                return new Librarian(username, password);
            default:
                throw new IllegalArgumentException("Unknown user type");

        }
    }
}

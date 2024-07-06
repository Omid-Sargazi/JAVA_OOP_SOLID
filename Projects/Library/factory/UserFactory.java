package Projects.Library.factory;

import Projects.Library.entity.User;
import Projects.Library.entity.Member;
import Projects.Library.entity.Librarian;

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

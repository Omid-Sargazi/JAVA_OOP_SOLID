package Projects.Library.entity;

public class Member extends User {

    public Member(String username, String password) {
        super(username, password);
    }

    @Override
    public void showDetails() {
        System.out.println("Member [Username=" + getUsername() + "]");
    }
}

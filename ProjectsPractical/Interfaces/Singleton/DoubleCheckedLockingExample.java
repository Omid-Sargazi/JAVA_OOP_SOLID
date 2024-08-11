package ProjectsPractical.Interfaces.Singleton;

public class DoubleCheckedLockingExample {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}

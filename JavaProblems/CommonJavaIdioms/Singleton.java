package JavaProblems.CommonJavaIdioms;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {

        Singleton a1 = Singleton.getInstance();
        Singleton a2 = Singleton.getInstance();
        Singleton a3 = Singleton.getInstance();
        System.out.println("");
        System.out.println("a1:  " + a1 + ", a2: " + a2 + "a3:  " + a3);

    }
}

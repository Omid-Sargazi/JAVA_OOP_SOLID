package JavaProblems.CommonJavaIdioms.StaticFactoryMethods;

public class StaticFactoryMethodExample {
    public static void main(String[] args) {
        // Using the static factory method to get Boolean instances
        Boolean boolTrue = Boolean.valueOf(true); // This will return Boolean.TRUE
        Boolean boolFalse = Boolean.valueOf(false); // This will return Boolean.FALSE

        // Comparing two Boolean objects
        if (boolTrue == Boolean.TRUE) {
            System.out.println("boolTrue is TRUE");
        }

        if (boolFalse == Boolean.FALSE) {
            System.out.println("boolFalse is FALSE");
        }

        // Demonstrating that the same instances are reused
        Boolean anotherTrue = Boolean.valueOf(true);
        System.out.println(boolTrue == anotherTrue); // This will print true, indicating both are the same instance
    }
}

package Projects.AbstractFactory.ComputerFactoryPattern;

public class TestDesignPatterns {
    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2GB", "500GB", "2.4GHz"));
        System.err.println(pc);
    }
}

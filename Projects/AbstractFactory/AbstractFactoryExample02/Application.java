package Projects.AbstractFactory.AbstractFactoryExample02;

public class Application {
    private Animal animal;
    private Sound sound;

    public Application(AnimalFactory factory) {
        animal = factory.createAnimal();
        sound = factory.createSound();
    }

    public void perform() {
        animal.move();
        sound.makeSound();
    }

    public static void main(String[] args) {
        AnimalFactory factory = new DomesticFactory();
        Application app = new Application(factory);
        app.perform();
    }
}

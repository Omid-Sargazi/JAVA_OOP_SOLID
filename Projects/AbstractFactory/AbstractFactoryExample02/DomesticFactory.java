package Projects.AbstractFactory.AbstractFactoryExample02;

public class DomesticFactory implements AnimalFactory {
    public Animal createAnimal() {
        return new DomesticDog();
    }

    public Sound createSound() {
        return new DomesticDogSound();
    }
}

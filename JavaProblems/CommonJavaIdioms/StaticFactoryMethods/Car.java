package JavaProblems.CommonJavaIdioms.StaticFactoryMethods;

public class Car {
    private String model;
    private String color;

    private Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public static Car createCar(String model, String color) {
        return new Car(model, color);
    }

    public void showDetails() {
        System.out.println("Car Model: " + model + ", Color: " + color);
    }

    public static void main(String[] args) {
        Car myCar = Car.createCar("Tesla model 3", "Black");
        myCar.showDetails();
    }

}

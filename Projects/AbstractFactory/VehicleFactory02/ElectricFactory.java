package Projects.AbstractFactory.VehicleFactory02;

public class ElectricFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new ElectricCar();
    }

    public Engine createEngine() {
        return new ElectricEngine();
    }

    public Wheel createWheel() {
        return new ElectricWheel();
    }
}

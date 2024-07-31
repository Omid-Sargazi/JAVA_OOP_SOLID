package Projects.AbstractFactory.VehicleFactory02;

public interface VehicleFactory {
    Vehicle createVehicle();

    Engine createEngine();

    Wheel createWheel();
}

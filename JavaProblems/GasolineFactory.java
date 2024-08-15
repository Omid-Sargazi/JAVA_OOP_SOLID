package JavaProblems;

class GasolineFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new GasolineCar();
    }

    public Engine createEngine() {
        return new GasolineEngine();
    }

    public Wheel createWheel() {
        return new GasolineWheel();
    }
}
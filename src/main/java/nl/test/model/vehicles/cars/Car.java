package nl.test.model.vehicles.cars;

import nl.test.model.vehicles.Vehicle;

public class Car extends Vehicle {

    public Car(Car car) {
        super(car);
    }

    @Override
    public String getModeOfTransport() {
        return "Land";
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }
}

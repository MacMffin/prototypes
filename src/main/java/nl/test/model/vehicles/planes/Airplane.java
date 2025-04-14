package nl.test.model.vehicles.planes;

import nl.test.model.vehicles.Vehicle;

public class Airplane extends Vehicle {

    public Airplane(Airplane airplane) {
        super(airplane);
    }

    @Override
    public String getModeOfTransport() {
        return "Air";
    }

    @Override
    public Vehicle clone() {
        return new Airplane(this);
    }
}

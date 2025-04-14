package nl.test.model.vehicles.boats;

import nl.test.model.vehicles.Vehicle;

public class Boat extends Vehicle {

    public Boat() {}

    public Boat(Boat boat) {
        super(boat);
    }

    @Override
    public String getModeOfTransport() {
        return "Sea";
    }

    @Override
    public Vehicle clone() {
        return new Boat(this);
    }


}

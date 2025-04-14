package nl.test.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import nl.test.model.vehicles.Vehicle;
import nl.test.model.vehicles.boats.Boat;

@Path("/prototype")
public class PrototypeResource {

    @Path("/boat")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Vehicle getBoat() {
        Boat boat = new Boat();
        boat.setBrand("Boaty");
        boat.setLength(100);
        boat.setMaxSpeedInKM(30);

        Vehicle clonedBoat = boat.clone();
        System.out.println(clonedBoat);
        System.out.println(boat);
        return clonedBoat;
    }
}

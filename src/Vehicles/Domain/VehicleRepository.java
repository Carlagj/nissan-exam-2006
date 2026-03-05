package Vehicles.Domain;

import java.util.ArrayList;

public interface VehicleRepository {
    public ArrayList<Vehicle> getVehicle();
    public void saveVehicle(Vehicle vehicle);


    void deleteVehicle();
}

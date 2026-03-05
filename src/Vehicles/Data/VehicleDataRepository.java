package Vehicles.Data;

import Vehicles.Domain.Vehicle;
import Vehicles.Domain.VehicleRepository;

import java.util.ArrayList;

public class VehicleDataRepository implements VehicleRepository {

    private VehicleMemLocalDataSource vehicleMemLocalDataSource;

    public VehicleDataRepository(VehicleMemLocalDataSource vehicleMemLocalDataSource){

    }




    @Override
    public ArrayList<Vehicle> getVehicle() {
        return null;
    }

    @Override
    public void saveVehicle(Vehicle vehicle) {

    }

    @Override
    public void deleteVehicle() {

    }


}

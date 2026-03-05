package Vehicles.Presentation;

import Vehicles.Data.VehicleDataRepository;
import Vehicles.Data.VehicleMemLocalDataSource;
import Vehicles.Domain.DeleteVehicleUseCase;
import Vehicles.Domain.GetVehicleUseCase;
import Vehicles.Domain.Vehicle;

import java.util.ArrayList;

public class VehicleView {


    public static SaveVehicles {

        GetVehicleUseCase getVehicleUseCase = new GetVehicleUseCase(new VehicleDataRepository(new VehicleMemLocalDataSource()));

        ArrayList<Vehicle> vehicles1 = getVehicleUseCase.execute(new Vehicle(1, "bmw", "1234HBG", "Blue", "5"));
        System.out.println(vehicles1);

        ArrayList<Vehicle> vehicles2 = getVehicleUseCase.execute(new Vehicle(2, "audi", "2334HtG", "red", "5"));
        System.out.println(vehicles2);


    }

}

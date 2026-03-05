package Vehicles.Domain;

public class GetVehicleUseCase {

    private VehicleRepository VehicleRepository;

    public GetVehicleUseCase(VehicleRepository vehicleRepository){
        this.VehicleRepository = vehicleRepository;
    }

    public void execute(Vehicle vehicle){
        VehicleRepository.getVehicle();
    }


}

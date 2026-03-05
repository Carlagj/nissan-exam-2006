package Vehicles.Domain;

public class DeleteVehicleUseCase {


    private VehicleRepository VehicleRepository;

    public DeleteVehicleUseCase(VehicleRepository vehicleRepository){
        this.VehicleRepository = vehicleRepository;
    }

    public void execute(Vehicle vehicle){
        VehicleRepository.deleteVehicle();
    }

}

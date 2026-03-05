package Vehicles.Domain;

public class SaveVehicleUseCase {
    private VehicleRepository VehicleRepository;

    public SaveVehicleUseCase(VehicleRepository vehicleRepository){
        this.VehicleRepository = vehicleRepository;
    }

    public void execute(Vehicle vehicle){
        VehicleRepository.saveVehicle(vehicle);
    }

}

package ec.edu.espe.vehicle.controller;

import ec.edu.espe.vehicle.model.Vehicle;
import ec.edu.espe.vehicle.model.VehicleFactory;



/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class VehicleController {
    private VehicleFactory vehicleFactory;
    
    
    public VehicleController(VehicleFactory vehicleFactory){
        this.vehicleFactory = vehicleFactory;
    }
    
    public void assembleVehicle(){
        Vehicle vehicle = vehicleFactory.createVehicle();
    }
}

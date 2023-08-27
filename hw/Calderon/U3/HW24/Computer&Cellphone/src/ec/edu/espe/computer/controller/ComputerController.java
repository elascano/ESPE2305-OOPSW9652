package ec.edu.espe.computer.controller;

import ec.edu.espe.computer.model.Vehicle;
import ec.edu.espe.computer.model.VehicleFactory;



/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class ComputerController {
    private VehicleFactory vehicleFactory;
    
    
    public ComputerController(VehicleFactory vehicleFactory){
        this.vehicleFactory = vehicleFactory;
    }
    
    public void assembleVehicle(){
        Vehicle vehicle = vehicleFactory.createVehicle();
    }
}

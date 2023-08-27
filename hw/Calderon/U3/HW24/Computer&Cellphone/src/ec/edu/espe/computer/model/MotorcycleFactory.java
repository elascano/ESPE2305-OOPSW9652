package ec.edu.espe.computer.model;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class MotorcycleFactory implements VehicleFactory{

    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
    
}

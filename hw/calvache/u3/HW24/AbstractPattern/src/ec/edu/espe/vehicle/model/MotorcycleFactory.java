package ec.edu.espe.vehicle.model;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class MotorcycleFactory implements VehicleFactory{

    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
    
}

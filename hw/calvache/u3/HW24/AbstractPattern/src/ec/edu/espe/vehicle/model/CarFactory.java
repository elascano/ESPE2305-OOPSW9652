package ec.edu.espe.vehicle.model;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class CarFactory implements VehicleFactory{

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
    
}

package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Cesar Galarza, BugBusters, DCCO-ESPE
 */
public class Cow extends FarmAnimal{
    private boolean isProducingMilk;
    
    public Cow(int id, String breed, Date bornOn, boolean isProducingMilk) {
        super(id, breed, bornOn); 
        this.isProducingMilk = isProducingMilk;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nis producing milk? = " + isProducingMilk;
    }

    @Override
    public boolean feed(Food food) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int produce() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int poop() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String vaccine(Vaccine vaccine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

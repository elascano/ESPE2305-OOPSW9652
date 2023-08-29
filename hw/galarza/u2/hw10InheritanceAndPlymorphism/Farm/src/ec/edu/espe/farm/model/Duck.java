package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Cesar Galarza, BugBusters, DCCO-ESPE
 */
public class Duck extends FarmAnimal implements IBird{
    private int laidEggs;
    
    public Duck(int id, int laidEggs, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.laidEggs = laidEggs;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nlaid eggs = " + laidEggs;
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

    @Override
    public void layAnEgg() {
        laidEggs= laidEggs + 1;
    }
    
}

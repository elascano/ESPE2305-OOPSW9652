
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class Sheep extends FarmAnimal implements IHaveWool {
    
    
    private int layWool;
    private boolean lastSheering;

    public Sheep(int layWool, boolean lastSheering, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.layWool = layWool;
        this.lastSheering = lastSheering;
    }

    public int getLayWool() {
        return layWool;
    }

    public void setLayWool(int layWool) {
        this.layWool = layWool;
    }

    public boolean isLastSheering() {
        return lastSheering;
    }

    public void setLastSheering(boolean lastSheering) {
        this.lastSheering = lastSheering;
    }

    @Override
    public String toString() {
        return "Sheep{" + super.toString()+"layWool=" + layWool + ", lastSheering=" + lastSheering + '}';
    }
  
    public void shear(){
        System.out.println("The Sheep was Shear");
    }
    

    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public int produce() {
        return 1;
    }

    @Override
    public void layWool() {
        layWool=layWool+1;
    }
    
}

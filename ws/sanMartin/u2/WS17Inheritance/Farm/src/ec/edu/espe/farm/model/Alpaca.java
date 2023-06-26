
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class Alpaca extends FarmAnimal implements IHaveWool{
    
    private int layWool;

    public Alpaca(int layWool, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.layWool = layWool;
    }

    public int getLayWool() {
        return layWool;
    }

    public void setLayWool(int layWool) {
        this.layWool = layWool;
    }

    @Override
    public String toString() {
        return "Alpaca{" + super.toString()+ "layWool=" + layWool + '}';
    }
    
    
    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public int produce() {
        return 4;
    }

    @Override
    public void layWool() {
        layWool=layWool+1;
    }
    
}

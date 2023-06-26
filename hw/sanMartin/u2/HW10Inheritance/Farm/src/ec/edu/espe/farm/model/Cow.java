
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class Cow extends FarmAnimal {
    
    private boolean isProducingMilk;
    private int layMilk;

    public Cow(boolean isProducingMilk, int layMilk, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
        this.layMilk = layMilk;
    }

    public int getLayMilk() {
        return layMilk;
    }

    public void setLayMilk(int layMilk) {
        this.layMilk = layMilk;
    }    

    public boolean isIsProducingMilk() {
        return isProducingMilk;
    }

    public void setIsProducingMilk(boolean isProducingMilk) {
        this.isProducingMilk = isProducingMilk;    }

    @Override
    public String toString() {
        return "Cow{" +super.toString()+ "isProducingMilk=" + isProducingMilk + ", layMilk=" + layMilk + '}';
    }

   
   
    public int produce(Meat meat){
        return meat.getPounds();
    }
    
    
    @Override
    public boolean feed(Food food) {
        return true;
    }
    public void produceMilk(){
        layMilk=layMilk+1;
    }

    @Override
    public int produce() {
        return 2;
    }
    
}

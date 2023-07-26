package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class Bee extends FarmAnimal{
    boolean producesHoney;

    public Bee(boolean producesHoney, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.producesHoney = producesHoney;
    }

    @Override
    public String toString() {
        return "Bee" + "\nproducesHoney: " + producesHoney + "\n";
    }
    
    @Override
    public boolean feed(Food food){
        return true;
    }
    
    @Override
    public int produce(){
        return 1;
    }
}

package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Bee;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.Meat;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
import java.util.Date;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class FarmSystem {
    public static void main(String[] args){
        FarmAnimal farmAnimal;
        farmAnimal = new Chicken(false, 0, 1, "broiled", new Date());
        Meat meat = new Meat();
        printType(farmAnimal);
        System.out.println("Chicken: " + farmAnimal);
        farmAnimal.produce();
        
        Chicken chicken = new Chicken(false, 0, 2, "polish", new Date());
        chicken.produce(meat);
        System.out.println("New chicken: " + chicken);
        chicken.layAnEgg();
        chicken.layAnEgg();
        System.out.println("New chicken: " + chicken);
        meat.setPounds(1);
        System.out.println("Chicken ate: " + chicken.produce(meat));
        
        farmAnimal = new Pig(3, "Landrace", new Date());
        printType(farmAnimal);
        System.out.println(farmAnimal);
        
        farmAnimal = new Cow(true, 4, "Angus", new Date());
        printType(farmAnimal);
        System.out.println(farmAnimal);
        
        farmAnimal = new Bee(true, 5, "Cerana", new Date());
        printType(farmAnimal);
        System.out.println(farmAnimal);
        
        farmAnimal = new Sheep(new Date(), 6, "Lacaune", new Date());
        printType(farmAnimal);
        System.out.println(farmAnimal);
    }

    private static void printType(FarmAnimal farmAnimal) {
        System.out.println("Type of farmAnimal: " + farmAnimal.getClass());
    }
}

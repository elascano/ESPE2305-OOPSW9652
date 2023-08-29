package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.Duck;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Meat;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
import ec.edu.espe.farm.model.Turkey;
import java.util.Date;

/**
 *
 * @author Cesar Galarza, BugBusters, DCCO-ESPE
 */
public class FarmSystem {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Meat meat;
        meat = new Meat();
        
        farmAnimal = new Chicken(false, 0, 1, "Broiled", new Date());
        printTypeAndAnimal(farmAnimal);
        
        Chicken chicken = new Chicken(false, 0, 2, "Polish", new Date());
        chicken.produce(meat);
        chicken.layAnEgg();
        chicken.layAnEgg();
        meat.setPounds(1);
        printTypeAndAnimal(chicken);
        
        System.out.println("New chicken --> " + chicken);
        System.out.println("Chicken ate --> " + chicken.produce(meat));
    
        farmAnimal = new Pig(3, "Landrace", new Date());
        printTypeAndAnimal(farmAnimal);
        
        farmAnimal = new Sheep(4, "Dorset", new Date(), new Date());
        printTypeAndAnimal(farmAnimal);
        
        farmAnimal = new Cow(5, "Holstein", new Date(), true);
        printTypeAndAnimal(farmAnimal);
        
        Turkey turkey = new Turkey(6, 3, "Beltsville", new Date());
        turkey.layAnEgg();
        printTypeAndAnimal(turkey);
        
        farmAnimal = new Duck(7, 1, "Mandarin", new Date());
        printTypeAndAnimal(farmAnimal);
    }

    private static void printTypeAndAnimal(FarmAnimal farmAnimal) {
        System.out.println("--------------------------------");
        System.out.println("Type of farmAnimal --> " + farmAnimal.getClass().getSimpleName());
        System.out.println("New " + farmAnimal.getClass().getSimpleName() + ": " + farmAnimal);
        System.out.println("--------------------------------");
    }
}

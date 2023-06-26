package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Meat;
import ec.edu.espe.farm.model.Pig;
import java.util.Date;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class FarmSystem {

    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Meat meat;
        meat = new Meat();

        farmAnimal = new Chicken(false, 0, 1, "broiled", new Date());

        typeOfAnimal(farmAnimal);
        farmAnimal.produce();

        Chicken chicken = new Chicken(false, 0, 2, "polish", new Date());
        chicken.produce(meat);
        System.out.println("new Chicken--> " + chicken);
        chicken.layAnEgg();
        chicken.layAnEgg();
        
        typeOfAnimal(chicken);

        System.out.println("new Chicken --> " + chicken);
        meat.getPounds(1);
        System.out.println("chicken ate ---> " + chicken.produce(meat));

        farmAnimal = new Pig(3, "Landrace", new Date());
        
        typeOfAnimal(farmAnimal);
        System.out.println("Pig --> " + farmAnimal);

    }

    private static void typeOfAnimal(FarmAnimal farmAnimal) {
        System.out.println("----------------------");
        System.out.println("Type of Animal --> " + farmAnimal.getClass().getSimpleName());
        System.out.println("Chicken-->" + farmAnimal);
        System.out.println("----------------------");
    }
}

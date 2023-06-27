package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Meat;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Rabbit;
import ec.edu.espe.farm.model.Sheep;
import ec.edu.espe.farm.model.Turkey;
import java.util.Date;

/**
 *
 * @author Juan Rueda, The Encoders, DCCO-ESPE
 */
public class FarmSystem {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Meat meat;
        
        meat = new Meat();
        farmAnimal = new Chicken(false, 0, 1, "broiled", new Date());
        printType(farmAnimal);
        
        System.out.println("Chicken --->" + farmAnimal);
        farmAnimal.produce();
        
        
        Chicken chicken = new Chicken(false, 0, 2, "polish", new Date());
        chicken.produce(meat);
        System.out.println("New chicken --->" + chicken);
        chicken.layAnEgg();
        chicken.layAnEgg();
        System.out.println("New chicken --->" + chicken);
        meat.setPounds(1);
        System.out.println("chicken ate --> "+ chicken.produce(meat));
        
        farmAnimal = new Pig(3, "Landrace", new Date());
        printType(farmAnimal);
        System.out.println("pig ---->" + farmAnimal);
        
        farmAnimal = new Turkey(true, 0, 4, "Ardesia", new Date());
        printType(farmAnimal);
        farmAnimal.produce();
        System.out.println("Turkey -----> " + farmAnimal);
        
        Turkey turkey = new Turkey(false, 0, 5, "Bronze", new Date());
        turkey.layAnEgg();
        printType(farmAnimal);
        
        farmAnimal = new Cow(false, 0, 6, "Braford", new Date());
        printType(farmAnimal);
        farmAnimal.produce();
        System.out.println("Cow ----> " + farmAnimal);
        
        Cow cow = new Cow(true, 0, 7, "Jersey", new Date());
        cow.produceMilk();
        printType(farmAnimal);
        
        farmAnimal = new Sheep(true, 1, 8, "Lincoln", new Date());
        printType(farmAnimal);
        farmAnimal.produce();
        System.out.println("Sheep ----->"+ farmAnimal);
        
        Sheep sheep = new Sheep(false, 0, 9, "Merino", new Date());
        sheep.isLastSheering();
        sheep.layWool();
        printType(farmAnimal);
        
        farmAnimal = new Rabbit(0, 10, "Angora", new Date());
        printType(farmAnimal);
        farmAnimal.produce();
        System.out.println("Rabbit ------> " + farmAnimal);
        
        Rabbit rabbit = new Rabbit(0, 11, "Arlequín", new Date());
        rabbit.layWool();
        rabbit.layWool();
        printType(farmAnimal);
        
    }

    private static void printType(FarmAnimal farmAnimal) {
        System.out.println("------------------------------------");
        System.out.println("Type of Farm Animal --->" + farmAnimal.getClass().getSimpleName());
    }
    
}

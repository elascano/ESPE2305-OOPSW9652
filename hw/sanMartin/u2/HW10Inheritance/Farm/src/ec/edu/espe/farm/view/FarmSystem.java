
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Alpaca;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Meat;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Turkey;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.Sheep;
import java.util.Date;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class FarmSystem {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Meat meat;
        meat = new Meat();
        farmAnimal = new Chicken(false, 0, 1, "broiled", new Date());
        printTypeOfAnimal(farmAnimal);
        
        System.out.println("Chicken ->: " + farmAnimal);
        farmAnimal.produce();
        
        Chicken chicken = new Chicken(true, 0, 2, "polish", new Date());
        chicken.produce(meat);
        System.out.println("New Chicken --->"+ chicken);
        chicken.layAnEgg();
        chicken.layAnEgg();
        
        System.out.println("new Chicken1 ---->" + chicken);
        meat.setPounds(1);
        System.out.println("chicken ate --->"+ chicken.produce(meat));
        
        farmAnimal = new Pig(3, "Landrace", new Date());
        printTypeOfAnimal(farmAnimal);
        System.out.println("pig --->"+ farmAnimal);
        
        farmAnimal = new Turkey(true, 0, 4, "Bronze", new Date());
        farmAnimal.produce();              
        printTypeOfAnimal(farmAnimal);
        System.out.println("Tourkey --->"+ farmAnimal);
        
        Turkey turkey = new Turkey(true, 0, 5, "Slate", new Date());   
        turkey.layAnEgg();
        System.out.println("New Turkey --->"+ turkey);       
        
        farmAnimal= new Cow(true, 0, 6, "Dexter", new Date());
        printTypeOfAnimal(farmAnimal);
        System.out.println("Cow --->"+ farmAnimal);
        farmAnimal.produce();
        
        Cow cow = new Cow(true, 0, 7, "Holstein", new Date());
        cow.produceMilk();
        System.out.println("New Cow ----> "+ cow);
        
        farmAnimal = new Sheep(0, true, 8, "Merino", new Date(99, 2, 21));
        printTypeOfAnimal(farmAnimal);
        System.out.println("Sheep ->   " + farmAnimal);
        farmAnimal.produce();
        
        Sheep sheep = new Sheep(0, true, 9, "Dorper",new Date(99, 2, 21));
        sheep.isLastSheering();
        sheep.layWool();
        sheep.shear();
        System.out.println("Sheep --->" + sheep);
        
        farmAnimal = new Alpaca(0, 10, "Andina", new Date(112, 2, 21));
        printTypeOfAnimal(farmAnimal);
        System.out.println("Alpaca ->   " + farmAnimal);
        farmAnimal.produce();
        
        Alpaca alpaca = new Alpaca(0, 11, "Huayaca", new Date(112, 2, 21));
        alpaca.layWool();
        System.out.println("Alpaca --->" + alpaca);
    }
        
    
    private static void printTypeOfAnimal(FarmAnimal farmAnimal){
        System.out.println("--------------------------------------------------");
        System.out.println("Type of farmAnimal ----> "+ farmAnimal.getClass().getSimpleName());
        System.out.println("-----------------------------------");
    }
}

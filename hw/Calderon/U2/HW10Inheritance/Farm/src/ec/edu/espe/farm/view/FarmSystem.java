
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Alpaca;
import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Goat;
import ec.edu.espe.farm.model.Meat;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
import ec.edu.espe.farm.model.Turkey;
import java.util.Date;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class FarmSystem {

    public static void main(String[] args){
    
        FarmAnimal farmAnimal;
        Meat meat;
        
        meat = new Meat();
        farmAnimal = new Chicken(false, 0, 1, "broiled", new Date());

        printTypeAndANIMAL(farmAnimal);
        farmAnimal.produce();
        
        Chicken chicken = new Chicken(false, 0, 2, "Polish", new Date());
        chicken.produce(meat);
        System.out.println("new Chicken --> " + chicken);
        chicken.layAnEgg();
        chicken.layAnEgg();
        
        
        printTypeAndANIMAL(chicken);
        
        System.out.println("new Chicken --> " + chicken);
        meat.setPounds(1);
        System.out.println("Chicken ate --> "+ chicken.produce(meat));
        
        
        farmAnimal = new Pig(3, "Landrace", new Date());
        
        printTypeAndANIMAL(farmAnimal);
        
        System.out.println(farmAnimal);
        
        
        farmAnimal = new Turkey(true, 0, 1, "Borbon", new Date());
        printTypeAndANIMAL(farmAnimal);
        System.out.println(farmAnimal);
        
        farmAnimal = new Cow(true, 5, 1, "Albera", new Date());
        printTypeAndANIMAL(farmAnimal);
        System.out.println(farmAnimal);
        
        farmAnimal = new Goat(3, 1, "Boer",new Date());
        printTypeAndANIMAL(farmAnimal);
        System.out.println(farmAnimal);
        
        
        farmAnimal = new Sheep(new Date(), 0.4F, 1, "Merino", new Date());
        printTypeAndANIMAL(farmAnimal);
        System.out.println(farmAnimal);
        
        
        farmAnimal = new Alpaca(new Date(), 0.2F, 1, "Huacaya", new Date());
        printTypeAndANIMAL(farmAnimal);
        System.out.println(farmAnimal);
        
        System.out.println("\t\t\t\nProgram by Calderon Jilmar");
        
    } 

    private static void printTypeAndANIMAL(FarmAnimal farmAnimal) {
        
        System.out.println("-------------------------");
        System.out.println("\nType of farmAnimal --> " + farmAnimal.getClass().getSimpleName());
        System.out.println("-------------------------");
    
    }
}

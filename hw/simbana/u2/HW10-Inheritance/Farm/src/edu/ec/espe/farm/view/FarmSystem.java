
package edu.ec.espe.farm.view;

import edu.ec.espe.farm.model.Chicken;
import edu.ec.espe.farm.model.Coat;
import edu.ec.espe.farm.model.Cow;
import edu.ec.espe.farm.model.FarmAnimal;
import edu.ec.espe.farm.model.Meat;
import edu.ec.espe.farm.model.Pig;
import edu.ec.espe.farm.model.Sheep;
import edu.ec.espe.farm.model.Turkey;
import java.util.Date;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
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
        
        farmAnimal = new Turkey(false, 0, 4, "Ardesia", new Date());
        printTypeAndANIMAL(farmAnimal);
        
        
        farmAnimal = new Sheep(new Date(2023, 05, 20), 5, "Merino", new Date());
        printTypeAndANIMAL(farmAnimal);
        
        farmAnimal = new Cow(true, 0, "Is producing Leather", 6, "Braford", new Date());
        printTypeAndANIMAL(farmAnimal);
        
        farmAnimal = new Coat(true, 0, 7, "Saanen", new Date());
        printTypeAndANIMAL(farmAnimal);
        
    } 
    

    private static void printTypeAndANIMAL(FarmAnimal farmAnimal) {
        
        System.out.println("-------------------------");
        System.out.println("Type of farmAnimal --> " + farmAnimal.getClass().getSimpleName());
        System.out.println("Animal: --> " + farmAnimal);

    
    }
}

package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Goat;
import ec.edu.espe.farm.model.Llama;
import ec.edu.espe.farm.model.Meat;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
import ec.edu.espe.farm.model.Turkey;
import java.util.Date;


/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class FarmSystem {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Meat meat;
        
        meat = new Meat();
        farmAnimal = new Chicken(false, 0, 1, "broiled", new Date());
        
        printTypeAndAnimal(farmAnimal);
        
        System.out.println("chicken --> " + farmAnimal);
        farmAnimal.produce();
        
        Chicken chicken = new Chicken(false, 0, 2, "polish", new Date());
        chicken.produce(meat);
        
        System.out.println("new chicken ----> " + chicken);
        chicken.layAnEgg();
        chicken.layAnEgg();
        
        printTypeAndAnimal(chicken);
        
        System.out.println("new chicken --->" + chicken);
        meat.setPounds(1);
        System.out.println("chicken ate --> " + chicken.produce(meat));
    
        farmAnimal = new Pig(3, "Landrace", new Date());
        
        printTypeAndAnimal(farmAnimal);
        
        System.out.println("pig ---> " + farmAnimal);
        
       
        farmAnimal = new Llama(1, true, 4, "guanicoe", new Date());
        printTypeAndAnimal(farmAnimal);
        System.out.println("llama ---> " + farmAnimal);
        
        farmAnimal = new Sheep(new Date(), 0, 5, "suffolk", new Date());
        
        printTypeAndAnimal(farmAnimal);
        System.out.println("sheep ---> " + farmAnimal);
        
        farmAnimal = new Turkey(2, 6, "royal", new Date());
        
        printTypeAndAnimal(farmAnimal);
        
        System.out.println("turkey ---> " + farmAnimal);
        
        farmAnimal = new Cow(true, 7, "holstein", new Date());
        
        printTypeAndAnimal(farmAnimal);
        System.out.println("cow ---> " + farmAnimal);
        
        farmAnimal = new Goat(true, 8, "kiko", new Date());
        
        printTypeAndAnimal(farmAnimal);
        System.out.println("goat ---> " + farmAnimal);
    }

    private static void printTypeAndAnimal(FarmAnimal farmAnimal) {
        System.out.println("-------------------------");
        System.out.println("type of farmAnimal ---> " + farmAnimal.getClass().getSimpleName());
        System.out.println("farmanimal --> " + farmAnimal);
        System.out.println("-------------------------");
    }
}

package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.Duck;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Goat;
import ec.edu.espe.farm.model.Meat;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
import java.util.Date;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class FarmSystem {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Meat meat;
        
        System.out.println("                           ALISON MIRANDA`S FARM SYSTEM");
        
        meat = new Meat();
        farmAnimal = new Chicken(true, 0, 1, "broiled", new Date() );
        
        printTypeAndAnimal(farmAnimal);
        farmAnimal.produce();
        
        System.out.println("chicken --> "+ farmAnimal);
        
        Chicken chicken = new Chicken(false, 0, 2, "Polish", new Date());
        chicken.produce(meat);
        System.out.println("new chicken --> " + chicken);
     
        chicken.layAnEgg();
        chicken.layAnEgg();
        System.out.println("new chicken --> " + chicken);
        meat.setPounds(1);
        System.out.println("chicken ate --> "+ chicken.produce(meat));
        
        farmAnimal =  new Duck(true, 0, 3, "Azulillo", new Date());
        printTypeAndAnimal(farmAnimal);
        System.out.println("duck --> " + farmAnimal);
    
        farmAnimal =  new Pig(4, "Landrace", new Date());
        printTypeAndAnimal(farmAnimal);
        System.out.println("pig --> " + farmAnimal);
        
        farmAnimal =  new Sheep(new Date(), 1, 5, "Lincoln", new Date());
        printTypeAndAnimal(farmAnimal);
        System.out.println("sheep --> " + farmAnimal);
        
        farmAnimal =  new Cow(true, 2, 6, "Criollo", new Date());
        printTypeAndAnimal(farmAnimal);
        System.out.println("cow --> " + farmAnimal);
        
        farmAnimal =  new Goat(true, 3, 7, "Nubian", new Date());
        printTypeAndAnimal(farmAnimal);
        System.out.println("goat --> " + farmAnimal);
    
    }

    private static void printTypeAndAnimal(FarmAnimal farmAnimal) {
        
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println(" TYPE OF FARM ANIMAL --> " + farmAnimal.getClass().getSimpleName());
        System.out.println("-----------------------------------------------------");
    
    }
}

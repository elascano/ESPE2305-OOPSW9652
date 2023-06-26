package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Meat;
import ec.edu.espe.farm.model.Pig;
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

        printTypeAndANIMAL(chicken);
        System.out.println("new Chicken --> " + chicken);
        meat.setPounds(1);
        System.out.println("Chicken ate --> "+ chicken.produce(meat));
        
        
        farmAnimal = new Pig(3, "Landrace", new Date());
        printTypeAndANIMAL(farmAnimal);
        System.out.println("pig --> " + farmAnimal);
    } 

    private static void printTypeAndANIMAL(FarmAnimal farmAnimal) {
        System.out.println("-------------------------");
        System.out.println("Type of farmAnimal --> " + farmAnimal.getClass().getSimpleName());
        System.out.println("Chicken --> " + farmAnimal);
        System.out.println("-------------------------");
    
    }
}

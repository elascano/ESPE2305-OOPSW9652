package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Horse;
import ec.edu.espe.farm.model.Meat;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
import ec.edu.espe.farm.model.Turkey;
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

        System.out.println("----System By Gabriel Calvache----");

        typeOfAnimal(farmAnimal);
        farmAnimal.produce();

        Chicken chicken = new Chicken(false, 0, 2, "polish", new Date());
        chicken.produce(meat);
        System.out.println("New Chicken--> " + chicken);
        chicken.layAnEgg();
        chicken.layAnEgg();

        typeOfAnimal(chicken);

        System.out.println("New Chicken --> " + chicken);
        meat.getPounds(1);
        System.out.println("Chicken Ate ---> " + chicken.produce(meat));

        farmAnimal = new Pig(3, "Landrace", new Date());

        typeOfAnimal(farmAnimal);
        System.out.println("Pig --> " + farmAnimal);

        farmAnimal = new Turkey(false, 2, 1, "Ardesia", new Date());
        typeOfAnimal(farmAnimal);
        System.out.println(farmAnimal);

        farmAnimal = new Cow(true, true, 1, "Holstein", new Date());
        typeOfAnimal(farmAnimal);
        System.out.println(farmAnimal);

        farmAnimal = new Sheep(new Date(), 3.2f, 1, "Merino", new Date());
        typeOfAnimal(farmAnimal);
        System.out.println(farmAnimal);

        farmAnimal = new Horse(32, 1, "Datmoor", new Date());
        typeOfAnimal(farmAnimal);
        System.out.println(farmAnimal);

    }

    private static void typeOfAnimal(FarmAnimal farmAnimal) {
        System.out.println("----------------------");
        System.out.println("Type of Animal --> " + farmAnimal.getClass().getSimpleName());
        System.out.println("----------------------");
    }
}

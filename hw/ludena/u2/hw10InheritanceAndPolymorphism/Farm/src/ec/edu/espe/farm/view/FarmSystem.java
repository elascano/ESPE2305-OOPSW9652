/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Goat;
import ec.edu.espe.farm.model.Meat;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sausage;
import ec.edu.espe.farm.model.Sheep;
import ec.edu.espe.farm.model.Turkey;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class FarmSystem {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Meat meat;
        
        meat = new Meat();
        Sausage sausage = new Sausage();
        farmAnimal = new Chicken(false,0,1,"broiled",new Date());
        
        printTypeAndAnimal(farmAnimal);
        
        System.out.println("Chicken --> " + farmAnimal);
        farmAnimal.produce();
        
        Chicken chicken = new Chicken(false,0,2,"polish", new Date());
        chicken.produce(meat);
        System.out.println("new chicken --> " + chicken);
        chicken.layAnEgg();
        chicken.layAnEgg();
        
        printTypeAndAnimal(chicken);
        
        
        System.out.println("new chicken --> " + chicken);
        meat.setPounds(1);
        System.out.println("chicken ate --> " + chicken.produce(meat));
        
        farmAnimal = new Pig(123,3,"Landrace",new Date());
        
        printTypeAndAnimal(farmAnimal);
        
        farmAnimal = new Turkey (true, 2, 1, "Bronze", new Date());
        printTypeAndAnimal(farmAnimal);
        
        farmAnimal = new Cow(true, 2, "Red Angus", new Date());
        printTypeAndAnimal(farmAnimal);
        
        farmAnimal = new Sheep(new Date(), 3, "Dorper", new Date());
        printTypeAndAnimal(farmAnimal);
        
        farmAnimal = new Goat(new Date(), 4, "Boer", new Date());
        printTypeAndAnimal(farmAnimal);

        
    }  

    
    private static void printTypeAndAnimal(FarmAnimal farmAnimal) {
    System.out.println("----------------------------------------------");
    System.out.println("Type of farmAnimal --> " + farmAnimal.getClass().getSimpleName());

    if (farmAnimal instanceof Chicken) {
        System.out.println("chicken: " + farmAnimal);
    } else if (farmAnimal instanceof Pig) {
        System.out.println("pig: " + farmAnimal);
    } else if (farmAnimal instanceof Turkey) {
        System.out.println("turkey: " + farmAnimal);
    } else if (farmAnimal instanceof Cow) {
        System.out.println("cow: " + farmAnimal);
    } else if (farmAnimal instanceof Sheep) {
        System.out.println("sheep: " + farmAnimal);
    } else if (farmAnimal instanceof Goat) {
        System.out.println("goat: " + farmAnimal);
    } else {
        System.out.println("Unknown animal type");
    }

    System.out.println("----------------------------------------------");
}

}

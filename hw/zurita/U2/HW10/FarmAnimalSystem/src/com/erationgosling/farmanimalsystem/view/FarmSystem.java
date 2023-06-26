/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erationgosling.farmanimalsystem.view;

import com.erationgosling.farmanimalsystem.model.Chicken;
import com.erationgosling.farmanimalsystem.model.FarmAnimal;
import com.erationgosling.farmanimalsystem.model.Meat;
import com.erationgosling.farmanimalsystem.model.Pig;
import java.util.Date;

/**
 *
 * @author PabloEZurita
 */
public class FarmSystem {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Meat meat;
        meat = new Meat();
        farmAnimal = new Chicken(false, 0, 1, "Broiled", new Date());
        
        printTypeOfClass(farmAnimal);
        
        System.out.println("Chicken -> " + farmAnimal);
        farmAnimal.produce();
        
        Chicken chicken = new Chicken(false, 0, 2, "Polaca", new Date());
        chicken.produce(meat);
        System.out.println("New Chicken ->" + chicken);
        chicken.layAnEgg();
        chicken.layAnEgg();
        System.out.println("New Chicken ->" + chicken);
        meat.setPounds(1);
        System.out.println("Chciken ate ->" + chicken.produce(meat));
        
        farmAnimal = new Pig(3, "Landraci", new Date());
        System.out.println("Pig -> " + farmAnimal);
        printTypeOfClass(farmAnimal);
    }

    private static void printTypeOfClass(FarmAnimal farmAnimal) {
        System.out.println("Type of Animal is -> " + farmAnimal.getClass().getSimpleName());
        System.out.println(farmAnimal.getClass().getSimpleName() + " -> " + farmAnimal);
    }
}

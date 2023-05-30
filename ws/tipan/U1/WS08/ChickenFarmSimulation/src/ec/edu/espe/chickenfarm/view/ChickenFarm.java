/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;
 
import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Oswaldo Tipan
 */
public class ChickenFarm {
    
    public static void main(String[] args){
      Poop poop;
        Egg egg;
        Chicken chicken;
        ArrayList<Chicken> chickens = new ArrayList<>();
        ArrayList<Chicken> chickens2 = new ArrayList<>();
        Coop coop; 
        Coop coop2;
        egg = new Egg(0);
        
        chicken = new Chicken(1, "Lucy", "w&b", false, new Date(70, 0, 1));
        poop = new Poop(chicken.getId());
        chickens.add(chicken);
        chicken = new Chicken(2, "Maruja", "w&b", false, new Date(70, 0, 1));
        chickens.add(chicken);
        chicken = new Chicken(3, "Leydi", "w&b", false, new Date(70, 0, 1));
        chickens.add(chicken);
        chicken = new Chicken(4, "Marta", "w&b", false, new Date(70, 0, 1));
        chickens.add(chicken);
        chicken = new Chicken(5, "Monica", "w&b", false, new Date(70, 0, 1));
        chickens.add(chicken);
        
        chicken = new Chicken(1, "Claudia", "w&b", false, new Date(70, 0, 1));
        chickens2.add(chicken);
        chicken = new Chicken(2, "Maribel", "w&b", false, new Date(70, 0, 1));
        chickens2.add(chicken);
        chicken = new Chicken(3, "Marisol", "w&b", false, new Date(70, 0, 1));
        chickens2.add(chicken);
        chicken = new Chicken(4, "Sol", "w&b", false, new Date(70, 0, 1));
        chickens2.add(chicken);
        chicken = new Chicken(5, "Soyla", "w&b", false, new Date(70, 0, 1));
        chickens2.add(chicken);
        
        coop = new Coop(1, chickens);
        coop2 = new Coop(2, chickens2);
        
        System.out.println("Chickens1 size: " + chickens.size());
        System.out.println("Coop1: " + coop);
        System.out.println("Chickens2 size: " + chickens2.size());
        System.out.println("Coop2: " + coop2);
    }
}

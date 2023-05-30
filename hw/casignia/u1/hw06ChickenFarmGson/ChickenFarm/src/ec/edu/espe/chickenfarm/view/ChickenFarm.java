package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.controller.PrintMenu;
import ec.edu.espe.chickenfarm.controller.RegisterChicken;
import ec.edu.espe.chickenfarm.controller.SaveData;
import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.ArrayList;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class ChickenFarm {
    public static void main(String[] args){
        Chicken chicken;
        ArrayList<Chicken> chickens1 = new ArrayList<>();
        ArrayList<Chicken> chickens2 = new ArrayList<>();
        PrintMenu printMenu = new PrintMenu();
        RegisterChicken registerChicken = new RegisterChicken();
        SaveData saveData = new SaveData();
        
        boolean finish = true;
        while(finish == true){
            int optionMenu = printMenu.printMenu();
            switch (optionMenu){
                case 1:
                    chicken = registerChicken.registerChicken();
                    chickens1.add(chicken);
                    break;
                case 2:
                    chicken = registerChicken.registerChicken();
                    chickens2.add(chicken);
                    break;
                case 3:
                    Coop coop1 = new Coop(1, chickens1);
                    Coop coop2 = new Coop(2, chickens2);
                    saveData.saveData(coop1, coop2);
                    break;
                default:
                    finish = false;
                    break;
            }
        }
    }
    //overloading
    /*public static void modify(Chicken chicken){
        chicken.setName("Maria");
    }*/
}

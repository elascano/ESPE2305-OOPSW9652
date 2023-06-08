package ec.edu.espe.chickenfarm.view;

import java.util.ArrayList;
import ec.edu.espe.chickenfarm.model.Menu;
import ec.edu.espe.chickenfarm.controller.Save;
import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.RegisterChicken;


/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class ChickenFarm {
    public static void main(String[] args){
        Chicken chicken;
        ArrayList<Chicken> chickens1 = new ArrayList<>();
        ArrayList<Chicken> chickens2 = new ArrayList<>();
        Menu printMenu = new Menu();
        RegisterChicken registerChicken = new RegisterChicken();
        Save saveData = new Save();
        
        boolean exit = true;
        while(exit == true){
            int option = printMenu.printMenu();
            switch (option){
                case 1:
                    System.out.println("-----Coop 1-----");
                    chicken = registerChicken.registerChicken();
                    chickens1.add(chicken);
                    break;
                case 2:
                    System.out.println("-----Coop 2-----");
                    chicken = registerChicken.registerChicken();
                    chickens2.add(chicken);
                    break;
                case 3:
                    Coop coop1 = new Coop(1, chickens1);
                    Coop coop2 = new Coop(2, chickens2);
                    saveData.saveInfo(coop1, coop2);
                    break;
                default:
                    exit = false;
                    break;
            }
        }
    }
}

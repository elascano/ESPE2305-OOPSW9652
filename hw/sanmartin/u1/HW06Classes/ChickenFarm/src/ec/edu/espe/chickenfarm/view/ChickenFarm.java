
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.controller.CreateMenu;
import ec.edu.espe.chickenfarm.controller.FileReader;
import ec.edu.espe.chickenfarm.controller.FileWritter;
import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class ChickenFarm {
    public static void main(String[] args) {
        Poop poop;
        Egg egg;
        Chicken chicken;
        ArrayList<Chicken> chickens = new ArrayList<>();
        ArrayList<Chicken> chickens2 = new ArrayList<>();              
        CreateMenu createMenu = new CreateMenu();
        FileReader fileRead = new FileReader();
        FileWritter fileWritte = new FileWritter();
        
        boolean finish = true;
        while(finish == true){
            int optionMenu = createMenu.createMenu();
            switch (optionMenu){
                case 1:
                    chicken = fileRead.readFile();
                    chickens.add(chicken);
                    break;
                case 2:
                    chicken = fileRead.readFile();
                    chickens2.add(chicken);
                    break;
                case 3:
                    Coop coop1 = new Coop(1, chickens);
                    Coop coop2 = new Coop(2, chickens2);
                    fileWritte.fileWritter(coop1, coop2);
                    break;
                default:
                    finish = false;
                    break;
            }
        }
    }
   
        
    }


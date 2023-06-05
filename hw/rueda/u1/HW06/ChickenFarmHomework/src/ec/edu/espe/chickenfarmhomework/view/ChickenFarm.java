package ec.edu.espe.chickenfarmhomework.view;


import ec.edu.espe.chickenfarmhomework.controller.ChickenRegister;
import ec.edu.espe.chickenfarmhomework.controller.Menu;
import ec.edu.espe.chickenfarmhomework.controller.SaveData;
import ec.edu.espe.chickenfarmhomework.model.Chicken;
import ec.edu.espe.chickenfarmhomework.model.Coop;
import java.util.ArrayList;



/**
 *
 * @author Juan Rueda, The Javas, DCCO-ESPE
 */
public class ChickenFarm {
    public static void main(String[] args) {
        Chicken chicken;
        ArrayList<Chicken> chicken1 = new ArrayList<>();
        ArrayList<Chicken> chicken2 = new ArrayList<>();
        Menu menu = new Menu();
        ChickenRegister chickenRegister = new ChickenRegister();
        SaveData saveData = new SaveData();
        
        boolean finish = true;
        while(finish == true){
            int selectionMenu = menu.menu();
            switch(selectionMenu){
                case 1:
                    chicken = chickenRegister.chickenRegister();
                    chicken1.add(chicken);
                    break;
                case 2:
                    chicken = chickenRegister.chickenRegister();
                    chicken2.add(chicken);
                    break;
                case 3:
                    Coop coop1 = new Coop(1, chicken1);
                    Coop coop2 = new Coop(2, chicken2);
                    saveData.saveData(coop1, coop2);
                    break;
                default:
                    finish = false;
                    break;
                      
            }
        }
    }
    
}

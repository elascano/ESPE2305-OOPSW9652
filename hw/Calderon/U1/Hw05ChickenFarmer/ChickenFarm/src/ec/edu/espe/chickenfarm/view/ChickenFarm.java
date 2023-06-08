
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.controller.EnterNewChicken;
import ec.edu.espe.chickenfarm.controller.MenuView;
import ec.edu.espe.chickenfarm.controller.SaveChicken;
import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import java.util.ArrayList;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class ChickenFarm {
    
    public static void main(String[] args){
    
        
        Chicken chicken;
        
        ArrayList<Chicken> chickens = new ArrayList<>();
        
        ArrayList<Chicken> chickens2 = new ArrayList<>();
        
        MenuView menuView = new MenuView();
        
        EnterNewChicken enterNewChicken = new EnterNewChicken();
        
        SaveChicken savechicken = new SaveChicken();
        
        boolean finish = true;
        
        while(finish == true){
            
            int optionMenu = menuView.MenuView();
            
 
            switch (optionMenu){
                case 1:
                    chicken = enterNewChicken.EnterNewChicken();
                    chickens.add(chicken);
                    break;
                case 2:
                    chicken = enterNewChicken.EnterNewChicken();
                    chickens2.add(chicken);
                    break;
                case 3:
                    Coop coop1 = new Coop(1, chickens);
                    Coop coop2 = new Coop(2, chickens2);
                    savechicken.SaveChicken(coop1, coop2);
                    break;
                default:
                    finish = false;
                    break;
            }
        }

    }
    
}

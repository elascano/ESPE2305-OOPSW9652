
package apartments;

import ec.edu.espe.Apartments.controller.Menu;
import ec.edu.espe.Apartments.controller.Save;
import ec.edu.espe.Apartments.model.Hall;
import ec.edu.espe.Apartments.model.Kitchen;
import java.util.ArrayList;

/**
 *
 * @author Your Name <your.name at your.org>
 */
public class Apartments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Hall hall;
        ArrayList<hall> hall1=new ArrayList<>();
        ArrayList<hall> hall2=new ArrayList<>();
        Menu printmenu=new Menu();
        RegisterHall registerHall= new RegisterHall();
        Save saveInfo=new Save();
        
        boolean exit = true;
        
        while (exit==true){
            int option =printmenu.printMenu();
            switch(option){
                case 1:
                    System.out.println("--Departamento 1---");
                    hall=registerHall.Hall();
                    hall1.add(hall);
                    break;
                case 2 :
                    System.out.println("----- Departamento 2 -----");
                    hall=registerHall.Hall();
                    hall2.add(hall );
                    break;
                case 3 :
                    Kitchen kitchen1 = new Kitchen(1, hall1);
                    Kitchen kitchen2 = new Kitchen(2, hall2);
                    saveInfo.saveInfo(kitchen1, kitchen2);
                    break;
                default:
                    exit = false;
                    break;
            }
            
            
        }
        
        
    }
}

        
    
    


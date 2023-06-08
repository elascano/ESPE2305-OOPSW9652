
package ec.edu.espe.ferrinventory.view;

import ec.edu.espe.ferrinventory.controller.Menu;
import ec.edu.espe.ferrinventory.model.ListOfUniversity;



/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class University {
    public static void main(String[] args) {
        Menu printMenu= new Menu();
        boolean exit= true;
        while (exit==true){
            int option =printMenu.printMenu();
            switch(option){
                case 1:
                    ListOfUniversity.ShowMenu();
                    break;
                case 2 :
                    exit=false;
                    break;
                default:
                    System.out.println("Opcion invalida ");
                    break;
            } 
        } 
    }
}

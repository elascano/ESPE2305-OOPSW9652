
package ec.edu.espe.drinksDB.view;

import ec.edu.espe.drinksDB.model.DataBase;
import ec.edu.espe.drinksDB.model.Menu;


/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class DrinksStorage {
    public static void main(String[] args) {
        Menu printMenu= new Menu();
        boolean exit= true;
        while (exit==true){
            int option =printMenu.printMenu();
            switch(option){
                case 1:   
                    DataBase.createDocument();
                    break;
                case 2 :
                    DataBase.readDocument();
                    break;
                case 3 :
                    DataBase.modifyDocument();
                    break;
                case 4 :
                    DataBase.deleteDocument();
                    break;
                case 5:
                    DataBase.showDatabase();
                    break;
                case 6:
                    exit=false;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
                    
            } 
        }
      
    }
}

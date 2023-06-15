
package ec.edu.espe.HardwareStore.view;

import ec.edu.espe.HardwareStore.model.Menu;
import ec.edu.espe.HardwareStore.utils.FileManager;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class HardwareStore {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Menu printMenu= new Menu();
        boolean exit= true;
        while (exit==true){
            int option =printMenu.printMenu();
            switch(option){
                case 1:
                   FileManager.saveObject();
                    break;
                case 2 :
                   
                    FileManager.readObject();
                    break;
                default:
                    exit=false;
                    break;
            } 
        } 
    }
}

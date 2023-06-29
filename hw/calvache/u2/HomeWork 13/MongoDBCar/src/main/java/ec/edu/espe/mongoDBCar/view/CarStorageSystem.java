
package ec.edu.espe.mongoDBCar.view;

import ec.edu.espe.mongoDBCar.model.MongoData;
import ec.edu.espe.mongoDBCar.model.Menu;


/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class CarStorageSystem {
    public static void main(String[] args) {
        Menu menu= new Menu();
        boolean exit= true;
        
        while (exit==true){
            int option =menu.generateMenu();
            switch(option){
                case 1:   
                    MongoData.createData();
                    break;
                case 2 :
                    MongoData.readData();
                    break;
                case 3 :
                    MongoData.modifyData();
                    break;
                case 4 :
                    MongoData.deleteData();
                    break;
                case 5:
                    MongoData.showAllCar();
                    break;
                case 6:
                    exit=false;
                    break;
                default:
                    System.out.println("Thats an invalid option please tyr again");
                    break;
                    
            } 
        }
      
    }
}

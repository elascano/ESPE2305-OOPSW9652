
package ec.edu.espe.ferrinventory.model;

import ec.edu.espe.ferrinventory.controller.Menu;
import ec.edu.espe.ferrinventory.controller.RegisterUniversity;
import ec.edu.espe.ferrinventory.controller.Save;
import java.util.ArrayList;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class ListOfUniversity {
   public static void ShowMenu() {
        University university;
        ArrayList<University> ListOfUniversity=new ArrayList<>();
        UniversityList List = new UniversityList(1, ListOfUniversity);
        Menu printmenu=new Menu();
        RegisterUniversity registerU= new RegisterUniversity();
        Save saveInfo=new Save();
       
        boolean exit = true;
        
        while (exit==true){
            int option =printmenu.printProductMenu();
            switch(option){
                case 1:
                    System.out.println("-----Ingreso de Datos -----");
                    university=registerU.University();
                    ListOfUniversity.add(university);
                    saveInfo.saveWareHouse1(List);
                    break;
                case 2 :   
                     System.out.println("COMMING SOON!!");
                default:
                    exit = false;
                    System.out.println("Opcion invalida");
                    break;
            } 
        } 
    } 
}

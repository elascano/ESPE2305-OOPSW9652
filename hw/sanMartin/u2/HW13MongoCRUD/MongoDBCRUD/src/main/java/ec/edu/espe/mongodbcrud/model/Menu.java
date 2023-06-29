
package ec.edu.espe.mongodbcrud.model;
import ec.edu.espe.mongodbcrud.controller.CrudOptions;
import java.util.Scanner;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class Menu {
    public int printMenu(){
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.println("----Airplane Manage System----");
        System.out.println("What do you whant to do?");
        System.out.println("1.- Add new Airplane");
        System.out.println("2.-Search a Airplane");
        System.out.println("3.-Modify a Airplane");
        System.out.println("4.-Delete a Airplane");
        System.out.println("5.-Show all ");
        System.out.println("6.- Exit");
        option = sc.nextInt();
        return option;
    }
    public void menuOption(){
        printMenu();
        CrudOptions crud = new CrudOptions();
        boolean exit= true;
        while (exit==true){
            int option =printMenu();
            switch(option){
                case 1:   
                    CrudOptions.createDocument();
                    break;
                case 2 :
                    CrudOptions.readDocument();
                    break;
                case 3 :
                    CrudOptions.modifyDocument();
                    break;
                case 4 :
                    CrudOptions.deleteDocument();
                    break;
                case 5:
                    CrudOptions.showDatabase();
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




package ec.edu.espe.homeworkphysicformula.control;

import static ec.edu.espe.homeworkphysicformula.model.FileReader.fileReader;
import static ec.edu.espe.homeworkphysicformula.model.FileWritter.fileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class Menu {
    public static void menuController() {
    Scanner keyboard = new Scanner(System.in);
        boolean exit = false;
        int option;
        while(!exit){
            System.out.println("---Hello, Welcome to your Final Velocity Calculator---- ");
            System.out.println("1.- Calculate Velocity \n2.-Read Data \n3.-Exit \nOption: ");
            try{
            option= keyboard.nextInt();
            switch(option){
                case 1:
                    System.out.println("Calculate Speed");
                    fileWriter();
                    break;
                case 2:
                    System.out.println("Read Speed");
                    fileReader();
                    break;
                case 3:
                    exit=true;
                    break;
                default:
                    System.out.println("Invalid option it must be 1,2 or 3");
                }        
            }catch(InputMismatchException e){
                System.out.println("It must be a number");
                keyboard.next();
            }
        }
        System.out.println("Bye, I see you soon");
    }
   }


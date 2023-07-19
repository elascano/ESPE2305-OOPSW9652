
package ec.edu.espe.view;

import ec.edu.espe.controller.CalculateICE;
import java.util.Scanner;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class AlcoholicDrinKSystemManagment {
    public static void main(String[] args) {
        CalculateICE ice = new CalculateICE();
        int option = 0;
        Scanner optionIn = new Scanner(System.in);
        
        do{
            System.out.println("-------Welcome to ICE Calculator-----\n");
            System.out.println("1. Add a Drink\n");
            System.out.println("2. Print List\n");
            System.out.println("3. Exit\n");
            
            System.out.println("Choose an option: ");
            option = optionIn.nextInt();
            
            switch(option){
                case 1:
                    ice.computeData();
                    break;
                case 2:
                    break;
                 
                case 3:
                    System.out.println("GoodBye");
                    option=3;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }while(option!=3);
    }
    
 
}


package espe.edu.ec.view;

import espe.edu.ec.controller.computingData;
import java.util.Scanner;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class TaxesCalculator {
    public static void main(String[] args) {
        
        computingData computeTax = new computingData();
        int option = 0;
        Scanner optionIn = new Scanner(System.in);
        
        do{
            System.out.println("-------Income Tax Calculator-----\n");
            System.out.println("1. Calculate Tax\n");
            System.out.println("2. Print tax\n");
            System.out.println("3. Exit\n");            
            System.out.println("Selecciones una opción: ");
            option = optionIn.nextInt();
            
            switch(option){
                case 1:
                    System.out.println("Welcome please add information");
                    computeTax.compute();
                    break;
                case 2:
                    break;
                case 3:
                    option=3;
                    break;               
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }while(option!=3);
    }
    
  
}

package ec.edu.espe.taxsystem.model;

import java.util.Scanner;

/**
 *
 * @author Cesar Galarza, BugBusters, DCCO-ESPE
 */
public class Menu {
    public void menuDisplay(){
        Scanner scanner = new Scanner(System.in);
        int option=0;
        
        while (option != 4){
        System.out.println("\nBOOKKEEPING -v0.9");
        System.out.println("1. Shoes Sale");
        System.out.println("2. Special Products Sale");
        System.out.println("3. Calculate Income Tax");
        System.out.println("4. Exit");
        System.out.print("Introduce option: ");
        option = scanner.nextInt();

            switch (option) {
                case 1:
                    ShoesSaleSystem.shoesIva();
                break;
                case 2:
                    SpecialProductsSaleSystem.productIceData();
                break;
                case 3:
                    IncomeTaxSalarySystem.printIncomeTax();
                break;
                case 4:
                    System.out.println("Thanks for your preference!");
                    break;
                default:
                    System.out.println("ERROR! unused option");
            }
        };
    }
}

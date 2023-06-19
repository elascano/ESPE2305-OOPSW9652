package ec.edu.espe.taxsystem.view;

import ec.edu.espe.taxsystem.model.ShoesSalesSystem;
import java.util.Scanner;
import ec.edu.espe.taxsystem.model.IncomeTaxSalarySystem;
import ec.edu.espe.taxsystem.model.ProductSalesSystem;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class TaxSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        
        do{
            
        System.out.println(" \n          ----- MENU -----");
        System.out.println("1. Calculate IVA");
        System.out.println("2. Calculate ICE");
        System.out.println("3. Calculate Income Tax");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
        option = scanner.nextInt();

            switch (option) {
                case 1:
                    ShoesSalesSystem.shoesIva();
                break;
                case 2:
                    ProductSalesSystem.getIceData();
                break;
                case 3:
                    IncomeTaxSalarySystem.printIncomeTax();
                break;
                case 4:
                    System.out.println("Exited successfully");
                    break;
                default:
                    System.out.println("Invalid option, enter again: ");
            }
        }while (option != 4);   
    }
}

package ec.edu.espe.liquor.view;

import ec.edu.espe.liquor.model.ProductAndIce;
import ec.edu.espe.liquor.model.Taxes;
import java.util.Scanner;



/**
 *
 * @author Juan Rueda, The Encoders, DCCO-ESPE
 */
public class LiquorStore {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do{
                        
            System.out.println("<----------Juan Liquor Store---------->");
            System.out.println("1. Enter a product\n");
            System.out.println("2. Calculate income tax\n");
            System.out.println("3. Exit\n");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

                switch (option) {

                    case 1 -> ProductAndIce.IceData();
                    case 2 -> Taxes.printIncome();
                    case 3 -> System.out.println("Exited successfully");
                    default -> System.out.println("Invalid option, enter again: ");
                }
            }while (option != 3); 
        
    }
}

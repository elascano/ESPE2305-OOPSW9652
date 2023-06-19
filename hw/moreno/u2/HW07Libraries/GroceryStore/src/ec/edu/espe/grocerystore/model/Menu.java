
package ec.edu.espe.grocerystore.model;

import java.util.Scanner;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class Menu {
    int option;
    public int printMenu(){
        Scanner readOption = new Scanner(System.in);
        System.out.println("<----------Paul`s Grocery Store---------->");
        System.out.println("1. View products\n");
        System.out.println("2. Income Tax Payable\n");
        System.out.println("3. Exit\n");
        option = readOption.nextInt();
        return option;
    }
}

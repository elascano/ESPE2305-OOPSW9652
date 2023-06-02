package ec.edu.espe.chickenfarm.model;

import java.util.Scanner;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class Menu {
    int option;
    public int printMenu(){
        Scanner readOption = new Scanner(System.in);
        System.out.println("<----------MENU---------->");
        System.out.println("1. Add Chicken in coop 1\n");
        System.out.println("2. Add Chicken in coop 2\n");
        System.out.println("3. Save\n");
        System.out.println("4. Exit\n");
        option = readOption.nextInt();
        return option;
    }
}

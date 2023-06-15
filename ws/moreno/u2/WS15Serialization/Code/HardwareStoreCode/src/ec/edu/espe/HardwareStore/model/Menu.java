
package ec.edu.espe.HardwareStore.model;

import java.util.Scanner;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class Menu {
    public  int printMenu(){
        Scanner readOption = new Scanner(System.in);
        System.out.println("<----Welcome---->");
        System.out.println("What do you want to do ?");
        System.out.println("1. Add Hammers\n");
        System.out.println("2. Print Hammers\n");
        System.out.println("3. Exit\n");
        int option = readOption.nextInt();
        return option;
    }
}


package ec.edu.espe.drinksDB.model;

import java.util.Scanner;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class Menu {
    public int printMenu(){
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.println("----Drinks Storage----");
        System.out.println("What do you whant to do?");
        System.out.println("1.- Insert a new Drink");
        System.out.println("2.-Search a Drink");
        System.out.println("3.-Modify a Drink");
        System.out.println("4.-Delete a Drink");
        System.out.println("5.-Show all drinks");
        System.out.println("6.- Exit");
        option = sc.nextInt();
        return option;
    }
}

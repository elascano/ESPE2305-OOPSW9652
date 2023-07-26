package ec.edu.espe.mongoDBCar.model;

import java.util.Scanner;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class Menu {

    public int generateMenu() {
        int option;
       
        Scanner sc = new Scanner(System.in);
        System.out.println("----Student System----");
        System.out.println("1.Show Student");
        System.out.println("2.Exit");
        System.out.println("Please select an option");
        option = sc.nextInt();
        return option;
    }
}

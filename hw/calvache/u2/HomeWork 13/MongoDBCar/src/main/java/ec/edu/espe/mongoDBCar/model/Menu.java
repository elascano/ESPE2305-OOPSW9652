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
        System.out.println("----Car Storage System----");
        System.out.println("----By Diego Casignia and Gabriel Calvache----");
        System.out.println("1.Insert New Car");
        System.out.println("2.Search Car");
        System.out.println("3.Modify Car");
        System.out.println("4.Delete Car");
        System.out.println("5.Show all cars");
        System.out.println("6.Exit");
        System.out.println("Please select an option");
        option = sc.nextInt();
        return option;
    }
}

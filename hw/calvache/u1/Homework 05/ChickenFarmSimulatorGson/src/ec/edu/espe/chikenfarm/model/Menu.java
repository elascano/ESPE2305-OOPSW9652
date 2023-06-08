package ec.edu.espe.chikenfarm.model;

import java.util.Scanner;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class Menu {

    public static int main() {
        Scanner selectedOption = new Scanner(System.in);

        int option;
        System.out.println("----CHICKEN FARM BY GABRIEL CALVACHE----");

        System.out.println("\nPlease select one option:");
        System.out.println("1.Add chiekn in Coop 1");
        System.out.println("2.Add chicken in Coop 2");
        System.out.println("3.Generate Gson");
        System.out.println("4.Exit");
        do {
            System.out.println("Selected option: ");
            option = selectedOption.nextInt();

            if (option < 1 || option > 4) {
                System.out.println("Please select an option between 1 and 4\n");
            }

        } while (option < 1 || option > 4);
        return option;
    }

}

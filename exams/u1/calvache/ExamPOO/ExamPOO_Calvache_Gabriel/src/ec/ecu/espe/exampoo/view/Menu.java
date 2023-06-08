package ec.ecu.espe.exampoo.view;

import ec.ecu.espe.exampoo.model.ModifyCellPhone;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class Menu {

    public static void showMenu() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        int option;
        ModifyCellPhone modifyCellPhone = new ModifyCellPhone();

        boolean continueMenu = true;
        while (continueMenu) {
            System.out.println("\n-----Welcome to Exam Program-----");
            System.out.println("\n-----This program deletes all the information in Json-----");
            System.out.println("1. Register Cell Phone");
            System.out.println("2. Show Cell Phone List");
            System.out.println("3. Delete all Cell Phone ");
            System.out.println("3. Exit");
            do {
                System.out.print("\n\tSelected option: ");
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        modifyCellPhone.createCellPhone();
                        break;

                    case 2:
                        modifyCellPhone.readCellPhone();
                        break;

                    case 3:
                        modifyCellPhone.deleteCellPhone();
                        break;
                    case 4:
                        System.out.println("\nSee you later\n\n");
                        continueMenu = false;

                    default:
                        System.out.println("Invalid option, try again ");
                }
            } while (option < 0 || option > 4);
        }
    }
}

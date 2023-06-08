package exam1.view;

import exam1.model.EditForniture;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class Menu {
    public void showMenu() throws FileNotFoundException{
        Scanner scanner = new Scanner(System.in);
        EditForniture editForniture = new EditForniture();
        System.out.println("\n\t\t--- Forniture ---");
        boolean continueMenu = true;
        while (continueMenu){
            System.out.println("\nMenu:");
            System.out.println("1. Add new forniture");
            System.out.println("2. Print All");
            System.out.println("3. Finish");
            System.out.print("\n\tOption: ");
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    editForniture.createForniture();
                    break;
                case 2:
                    editForniture.readForniture();
                    break;
                case 3:
                    continueMenu = false;
                    break;
                default:
                    break;
            }
        }
    }
}

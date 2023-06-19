
package ec.edu.espe.candystore.view;

import ec.edu.espe.candystore.model.Menu.Chocolate;
import ec.edu.espe.candystore.model.Menu.Gummy;
import ec.edu.espe.candystore.model.Menu.Menu;
import ec.edu.espe.candystore.model.Menu.Pacifier;
import ec.edu.espe.tax.IncomeTax;
import java.util.Scanner;

/**
 *
 * @author Your Name <your.name at your.org>
 */
public class CandyStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Chocolate chocolate;
        Gummy gummy ;
        Pacifier pacifier;
        
        Menu printMenu = new Menu();
        boolean exit = true;
        while(exit == true){
            int option = printMenu.printMenu();
            switch (option){
                case 1:
                    chocolate = new Chocolate("Galak", 0.3F);
                    System.out.println("Unit price of chocolate/n"+chocolate);
                    gummy= new Gummy("Grisly", 0.15F);
                    System.out.println("Unit price of a gummy/n"+gummy);
                    pacifier = new Pacifier("Plop", 2.35F);
                    System.out.println("Price of a pacifier/n"+pacifier);

                    break;
                case 2:
                    System.out.println("How much is your annual salary :");
                    double salary= sc.nextDouble();
                    double tax =IncomeTax.compute(salary);
                    System.out.println("The annual tax to be pay is "+tax);
                    System.out.println("The monthly tax to be pay is"+tax/12);
                    break;
                case 3:
                    exit = false;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
                    
            }
        }
    }
}

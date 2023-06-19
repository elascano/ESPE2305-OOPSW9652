
package ec.edu.espe.grocerystore.view;

import ec.edu.espe.grocerystore.model.Menu;
import ec.edu.espe.grocerystore.model.PackOfCigarrette;
import ec.edu.espe.grocerystore.model.PackOfPlasticBag;
import ec.edu.espe.grocerystore.model.Tobacco;
import ec.edu.espe.tax.IncomeTax;
import java.util.Scanner;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class GroceryStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PackOfCigarrette cigarrete;
        PackOfPlasticBag plasticBag;
        Tobacco tobacco;
        
        Menu printMenu = new Menu();
        boolean exit = true;
        while(exit == true){
            int option = printMenu.printMenu();
            switch (option){
                case 1:
                    cigarrete = new PackOfCigarrette("Marlboro", 0.3F);
                    System.out.println("Unit price of cigarretes--->"+cigarrete);
                    plasticBag= new PackOfPlasticBag("La dura", 0.15F);
                    System.out.println("Unit price of a plastic bag --->"+plasticBag);
                    tobacco = new Tobacco("Abano", 2.35F);
                    System.out.println("Price of a tobacco---->"+tobacco);

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

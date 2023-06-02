package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.controller.ChangeChickens;
import ec.edu.espe.chickenfarm.controller.KeepChickens;
import ec.edu.espe.chickenfarm.controller.SaveChickens;
import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class ChickenFarm {
    public static void main(String[] args) {
        Chicken chicken;
        ArrayList<Chicken> chickens = new ArrayList<>();
        ArrayList<Chicken> chickens2 = new ArrayList<>();
        SaveChickens saveChickens = new SaveChickens();
        KeepChickens keepChickens = new KeepChickens();
        ChangeChickens changeChickens = new ChangeChickens();
        
        Scanner scanner = new Scanner(System.in);
        int option;
        boolean exit = false;

        while (!exit) {

            System.out.println("--Welcome--");
            System.out.println("1. Add Chickens");
            System.out.println("2. Stored Data");
            System.out.println("3. Change Chickens");
            System.out.println("4. Exit");

            System.out.println("Choose an Option");
           
            try{
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Add Chickens to:");
                    System.out.println("1. Coop 1");
                    System.out.println("2. Coop 2");
                  
                    int option2 = scanner.nextInt();
                    
                    if(option2 == 1){
                        chicken = keepChickens.keepChickens();
                        chickens.add(chicken);
                    }
                    else if (option2 == 2){
                        chicken = keepChickens.keepChickens();
                        chickens2.add(chicken);
                    }                   
                    break;
                case 2:
                    Coop coop1 = new Coop(1, chickens);
                    Coop coop2 = new Coop(2, chickens2);
                    saveChickens.saveChickens(coop1, coop2);
                    break;
                case 3:
                    System.out.println("Change Chicken");
                    System.out.print("Numbre of Coop: ");
                    int coopNumber = scanner.nextInt();
                    scanner.nextLine();
                    changeChickens.changeChickens(coopNumber);
                    System.out.println("Gallina modificada con éxito.");
                    break;
                
                case 4:
                    exit = true;
                    break;
            }
            }catch(InputMismatchException e){
                System.out.println("Error");
                scanner.next();
            }
                
                
        }
    }
}

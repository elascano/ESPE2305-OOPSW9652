package ec.edu.edpe.accelerationformula.view;

import ec.edu.edpe.accelerationformula.model.CSVGenerator;
import ec.edu.edpe.accelerationformula.model.CSVRead;
import java.util.Scanner;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */

public class Menu {
    public static void main(String[] args) {
      Scanner selectedOption=new Scanner(System.in);
      
      int option;
        System.out.println("----CHICKEN FARM BY GABRIEL CALVACHE----");
        do{
        System.out.println("\nPlease select one option:");
        System.out.println("1.Create Coop");
        System.out.println("2.Insert data in Coop");
        System.out.println("3.Exit");
        System.out.println("Selected option: ");
        option= selectedOption.nextInt();
              
        switch(option){
            case 1:
                CSVGenerator.main();
                break;
            case 2:
                CSVRead.main();
                break;
            case 3:
                System.out.println("See you later");
                break;
        }    
        }while(option!=3);
        
    }

}


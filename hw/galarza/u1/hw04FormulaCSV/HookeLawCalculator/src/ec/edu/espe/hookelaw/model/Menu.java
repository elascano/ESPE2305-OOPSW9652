package ec.edu.espe.hookelaw.model;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Cesar Galarza, BugBusters, DCCO-ESPE
 */
public class Menu{
    public void menuDisplay(){
    Scanner sn = new Scanner(System.in);
    SpringConstant sc = new SpringConstant();
    
    boolean exit = false;
    int option;
    
        while(!exit){
            System.out.println("");
            System.out.println("[----HOOKE'S LAW CALCULATOR----]");
            System.out.println("\nMENU OPTIONS");
            System.out.println("1. Insert data");
            System.out.println("2. Read data");
            System.out.println("3. Exit");

            try{

                System.out.print("Introduce option: ");
                option = sn.nextInt();

                switch(option){
                    case 1 -> {
                        sc.doStuff();
                    }
                    case 2 -> {

                    }
                    case 3 -> {
                        exit = true;
                        System.out.println("Thanks for your support!");
                    }
                    default -> {
                        System.out.println("Select from 1-3 option");
                    }
                }
            }catch(InputMismatchException e){
                System.out.println("The option must be number!");
                sn.next();
            }
        }
    }
}

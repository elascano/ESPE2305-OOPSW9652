package ec.edu.espe.sportstore.model;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Cesar Galarza, BugBusters, DCCO-ESPE
 */
public class Menu {
    public void menuDisplay(){
        Scanner sn = new Scanner(System.in);
        CreateSport createSport = new CreateSport();
        DelateSport delateSport = new DelateSport();

        boolean exit = false;
        int option;

            while(!exit){
                System.out.println("");
                System.out.println("[----SPORT STORE----]");
                System.out.println("\nMENU OPTIONS");
                System.out.println("1. Insert sport");
                System.out.println("2. Delete ALL sports");
                System.out.println("3. Exit");
                System.out.print("Introduce option: ");

                try{
                    option = sn.nextInt();

                    switch(option){
                        case 1 -> {
                            createSport.Sport();
                        }
                        case 2 -> {
                            delateSport.Sport();
                        }
                        case 3 -> {
                            exit = true;
                            System.out.println("\nThanks for your preference!");
                        }
                        default -> {
                            System.out.println("Select from 1-3 option!");
                        }
                    }
                }catch(InputMismatchException e){
                    System.out.println("The option must be number!");
                    sn.next();
                }
            }
    }
}

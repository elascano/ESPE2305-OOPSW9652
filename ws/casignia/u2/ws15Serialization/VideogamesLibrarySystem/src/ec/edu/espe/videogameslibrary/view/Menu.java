/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.videogameslibrary.view;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class Menu {
    public void showMenu() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        CreatorStudio creatorStudio = new CreatorStudio();
        CustomerMenu customerMenu = new CustomerMenu();

        System.out.println("\n\t\t------ Videogames Library ------");

        boolean continueMenu = true;
        while (continueMenu) {
            System.out.println("\n\t*** Main Menu ***\n");
            System.out.println("1. Customer");
            System.out.println("2. Developer");
            System.out.println("3. Exit");
            System.out.print("\n\tOption: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1: 
                    customerMenu.showCustomerMenu();
                    break;

                case 2:
                    creatorStudio.showDeveloperMenu();
                    break;

                case 3:
                    continueMenu = false;
                    break;

                default:
                    System.out.println("");
            }
        }
    }
}

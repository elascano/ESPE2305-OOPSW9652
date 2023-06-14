/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.videogameslibrary.view;

import ec.edu.espe.videogameslibrary.utils.FileManager;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class CreatorStudio {
    public void showDeveloperMenu() throws FileNotFoundException{
        Scanner scanner = new Scanner(System.in);
        FileManager editVideogameData = new FileManager();

        boolean continueMenu = true;
        while (continueMenu) {
            System.out.println("\n\t*** Creator Studio ***\n");
            System.out.println("1. Save new videogame");
            System.out.println("2. Read videogames");
            System.out.println("3. Exit");
            System.out.print("\n\tOption: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1: 
                    editVideogameData.writeVideogameData();
                    break;

                case 2:
                    editVideogameData.readVideogameData();
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

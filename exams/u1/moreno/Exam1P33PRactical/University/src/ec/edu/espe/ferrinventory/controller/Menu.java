package ec.edu.espe.ferrinventory.controller;

import java.util.Scanner;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class Menu {

    int option;
    public  int printProductMenu(){
        Scanner readOption = new Scanner(System.in);
        System.out.println("<----Informacion Universitaria---->");
        System.out.println("Que deseas hacer ?");
        System.out.println("1. Ingresar informacion de universidad\n");
        System.out.println("2. Borrar la informacion guardada\n");
        System.out.println("3. Salir\n");
        
        option = readOption.nextInt();
        return option;
    }
    public  int printMenu(){
        Scanner readOption = new Scanner(System.in);
        System.out.println("Informacion Universitaria");
        System.out.println("Que desea hacer:");
        System.out.println("1. Acceder al programa\n");
        System.out.println("2. Salir del programa\n");
        option = readOption.nextInt();
        return option;
    }
        
    
}


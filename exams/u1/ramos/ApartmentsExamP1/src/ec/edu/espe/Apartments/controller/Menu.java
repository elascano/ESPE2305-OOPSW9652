package ec.edu.espe.Apartments.controller;

import java.util.Scanner;

/**
 *
 * @author Your Name <your.name at your.org>
 */
public class Menu {
    int option;
    public  int printMenu(){
        Scanner readOption = new Scanner(System.in);
        System.out.println("<----Apartments---->\n");
        System.out.println("Que Deseas Hacer?");
        System.out.println("1. A que cuarto deseas ingresar #1\n");
        System.out.println("2. A que parte del departamento quieres ir # 2\n");
        System.out.println("3. A que departamento deseas entrar");
        System.out.println("4. Salir del Programa\n");
        option = readOption.nextInt();
        return option;
    }
    
}

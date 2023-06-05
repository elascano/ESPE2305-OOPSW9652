package ec.edu.espe.chickenfarmhomework.controller;

import java.util.Scanner;

/**
 *
 * @author Juan Rueda, The Javas, DCCO-ESPE
 */
public class Menu {
    int optionMenu;
    public int menu(){
        Scanner readOptionMenu = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Add a  Chicken in coop 1"); 
        System.out.println("2. Add a Chicken in coop 2");
        System.out.println("3. Save Data");
        System.out.println("4. Exit");
        System.out.println("Powered by Juan Rueda");
        optionMenu = readOptionMenu.nextInt();
        return optionMenu;
    }
}


package ec.edu.espe.chickenfarm.controller;

import java.util.Scanner;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class PrintMenu {
    int optionMenu;
    public int printMenu(){
        Scanner readOptionMenu = new Scanner(System.in);
        System.out.println("----------MENU----------");
        System.out.println("1. Add Chicken in coop 1");
        System.out.println("2. Add Chicken in coop 2");
        System.out.println("3. Save Data");
        System.out.println("5. Finish");
        optionMenu = readOptionMenu.nextInt();
        return optionMenu;
    }
}

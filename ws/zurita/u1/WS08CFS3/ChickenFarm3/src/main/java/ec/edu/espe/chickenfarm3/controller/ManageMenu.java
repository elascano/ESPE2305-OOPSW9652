package ec.edu.espe.chickenfarm3.controller;

import java.util.Scanner;

/**
 *
  * @author PabloEZurita
 */
public class ManageMenu {
    int pageOfMenu;
    public int printMenu(){
        Scanner menuOptions = new Scanner(System.in);
        System.out.println("________  MENU  ________");
        System.out.println("------------------------");
        System.out.println("Select one opcion:");
        System.out.println("------------------------");
        System.out.println("1. Add Chicken in the coop number 1");
        System.out.println("2. Add Chicken in the coop number 2");
        System.out.println("3. Save Data of coops");
        System.out.println("5. Exit");
        pageOfMenu = menuOptions.nextInt();
        return pageOfMenu;
    }
}


package ec.edu.espe.chickenfarm.controller;


import java.util.Scanner;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class CreateMenu{

     int optionMenu;
    public int createMenu(){
        Scanner readOptionMenu = new Scanner(System.in);
        System.out.println("----------Welcome to your Coop Manage System----------");
        System.out.println("Powered by Jose Sanmartin");
        System.out.println("1. Add a  Chicken in coop 1"+"\n2. Add a Chicken in coop 2"+"\n3.Coop Status"+"\n4.Exit");       
        optionMenu = readOptionMenu.nextInt();
        return optionMenu;
    }
}

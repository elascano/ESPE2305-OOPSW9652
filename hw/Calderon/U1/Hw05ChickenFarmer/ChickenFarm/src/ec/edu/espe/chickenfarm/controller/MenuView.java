
package ec.edu.espe.chickenfarm.controller;

import java.util.Scanner;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class MenuView {
    
    int ChoiseOptions;
    public int MenuView(){
        
        Scanner readOptionMenu = new Scanner(System.in);
        
        System.out.println("---------Choise an action----------\n");
        System.out.println("--Name: Calderon Jilmar----\n");
        System.out.println("-----------------------------------");
        System.out.println("1-> Add Chicken in coop 1");
        System.out.println("2-> Add Chicken in coop 2");
        System.out.println("3-> Save ");
        System.out.println("5-> Finish the Program");
        System.out.println("-----------------------------------");
        ChoiseOptions = readOptionMenu.nextInt();
        
        return ChoiseOptions;
        
    }
    
    
}



package ec.edu.espe.shoppper.controller;

import java.util.Scanner;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class Menu {
   
    public int printMenu(){
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.println("----Shoppers Manage System----");
        System.out.println("What do you whant to do?");
        System.out.println("1.- Add new Airplane");
        System.out.println("1.-Search a Airplane");       
        System.out.println("2.-Show all ");
        System.out.println("3.- Exit");
        option = sc.nextInt();
        return option;
    }
    public void menuOption(){
        printMenu();
        ShoppersReadPrint crud = new ShoppersReadPrint();
        boolean exit= true;
        while (exit==true){
            int option =printMenu();
            switch(option){               
                case 1 :
                    ShoppersReadPrint.readDocument();
                    break;                
                case 2:
                    ShoppersReadPrint.showDatabase();
                    break;
                case 3:
                    exit=false;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
                    
                }
            }
        }
    }


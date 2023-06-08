/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.controller;

import ec.edu.espe.chickenfarm.view.ChickenFarmSystem;
import java.util.Scanner;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class Menu {
    
    
    public static void main(String[] args, Scanner Scanner){
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option;
        
        while(!exit){
            System.out.println("------Menu------");
            System.out.println("1. Chickens");
            System.out.println("2. Coops");
            System.out.println("3. Data");
            System.out.println("4. Exit");
            
            System.out.println("Enter option: ");
            option = sn.nextInt();
            
            switch(option){
                case 1 :
                    
                    break;
                case 2 :
                    break;
                case 3 :
                    break;
                case 4 :
                    exit = true;
                    break;
            }
        }    
    }
}

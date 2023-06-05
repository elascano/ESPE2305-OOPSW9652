/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.speed.view;

import ec.edu.espe.speed.model.Speed;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class MenuSpeed {
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;
    int option;
    
    while(!exit){
        System.out.println("1. Speed");
        System.out.println("2. Text");
        System.out.println("3. Exit");
        
        System.out.println("Choose an option");
        
        try{
        option = scanner.nextInt();
        
        switch(option){
        
            case 1:
                Speed.computeSpeed(2, 2, 6);
                break;
            case 2:
                
                break;
            case 3:
                exit = true;
                break;
            default:
                System.out.println("Error");
        }
        
        }catch(InputMismatchException e){
            System.out.println("Number");
            scanner.next();
        }
    }
    
    }
    
}

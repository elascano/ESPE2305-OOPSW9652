/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exam2theory.view;

import ec.edu.espe.exam2theory.model.A;
import java.util.Scanner;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class Exam2Theory {
    public static void main(String[] args){
        A a = new A();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Exam2 Theory");
        System.out.println("1. B");
        System.out.println("2. C");
        System.out.println("3. D");
        System.out.print("Option:");
        int option = scanner.nextInt();
        
        switch(option){
            case 1: a.B();
            case 2: a.C();
            case 3: a.D();
            default: System.out.println(""); 
        }
    }
}

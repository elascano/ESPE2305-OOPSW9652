/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Exam1Exercise.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Labs-DCCO
 */
public class Menu {
    private static ArrayList<String> gradesOfStudents = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcionOfMenu;

        do {
            System.out.println("-------Menu-------");
            System.out.println("1. Show all data ingresed");
            System.out.println("2. Exit");
         
            System.out.println("Enter any opcion: ");

            opcionOfMenu = checkEnteredData();

            switch (opcionOfMenu) {
                case 1:
                    showData();
                    break;
                
                case 2:
                    System.out.println("Exit program...");
                    break;
                default:
                    System.out.println("Enter a value opcion");
                    break;
            }

            System.out.println();
        } while (opcionOfMenu != 5);
        
        
    }
    
    private static int checkEnteredData() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine(); 
                System.out.println("Enter a inter correct value");
            }
        }
    }
    private static void showData(){
        
    }
}

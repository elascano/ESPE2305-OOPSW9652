/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erationgosling.shoesales.view;

import com.erationgosling.shoesales.model.PairOfShoes;
import com.operationgosling.tax.sales.SalesTax;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PabloEZurita
 */
public class Menu {
    private static List<Integer> pairOfShoes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcionOfMenu;
        float ivaPercentage = 0.12F;
        do {
            System.out.println("Menu of Shoes Store");
            System.out.println("1. Add Shoe");
            System.out.println("2. Delet Shoe");
            System.out.println("3. Modify Shoe");
            System.out.println("4. Show Shoe");
            System.out.println("5. Add Iva");
            System.out.println("6. Exit");
            System.out.println("Enter a opción: ");

            opcionOfMenu = checkEnteredData();

            switch (opcionOfMenu) {
                case 1:
                    addShoe(ivaPercentage);
                    break;
                case 2:
                    removeGrade();
                    break;
                case 3:
                    modifyGrade();
                    break;
                case 4:
                    showGrades();
                    break;
                case 5:
                    ivaPercentage = addIva();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida, del 1 al 5");
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
                System.out.println("Ingrese un numero entero valido");
            }
        }
    }
    
    private static void addShoe(float ivaPercentage) {
        System.out.println("Enter the shoe that you wanna save: ");
        PairOfShoes pairOfShoes = new PairOfShoes(0, "", "", 0, 0);
        for (int i = 0; i < 100; i++) {
            pairOfShoes.id =(i+1) ;
        }
        System.out.println("Make: ");
        pairOfShoes.make = scanner.nextLine();
        System.out.println("Model: ");
        pairOfShoes.mode = scanner.nextLine();
        System.out.println("Price: ");
        pairOfShoes.price = scanner.nextFloat();
        pairOfShoes.totalPrice = SalesTax.computeIVA(pairOfShoes.price, ivaPercentage);
        
        Menu.pairOfShoes.add(pairOfShoes.id);
        System.out.println("Shoe add correctly");
        
    }
    private static float addIva(){
        System.out.println("Enter the iva percentage");
        float ivaPercentage = scanner.nextFloat();
        return ivaPercentage;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.techware.accounting.view;

import com.techware.accounting.model.ComputeTax;
import java.util.Scanner;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class Menu {

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        ComputeTax computeTax = new ComputeTax();

        System.out.println("\n\t\t------ Accouting System ------");

        boolean continueMenu = true;
        while (continueMenu) {
            System.out.println("\nMenu:");
            System.out.println("1. Compute IVA");
            System.out.println("2. Compute ICE");
            System.out.println("3. Salir");
            System.out.print("\n\tOption: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1: 
                    computeTax.computeIva();
                    break;

                case 2:
                    computeTax.computeIce();
                    break;

                case 3:
                    continueMenu = false;
                    break;

                default:
                    System.out.println("");
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.shoes.view;

import com.opertaiongosling.tax.SalesTax;
import ec.edu.espe.shoes.model.DataTax;
import ec.edu.espe.shoes.model.PairOfShoes;
import java.util.Scanner;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class ShoesSalesSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PairOfShoes pairOfShoes;
        float price;
        float ivaPrecentage;
        ivaPrecentage = 12.0F;
        price = 20.37F;
        float totalPrice;
        float income;
        float incomeTax;
        DataTax dataSalary = new DataTax();
        System.out.println("Michael Simbana Shoe Maker");
        
        int option;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Calculate Iva");
            System.out.println("2. Calculate ICE");
            System.out.println("3. Calculate Income Tax");
            System.out.println("4. Exit");
            System.out.print("Enter an option: ");
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    totalPrice = SalesTax.computeIva(price, ivaPrecentage);
                    pairOfShoes = new PairOfShoes(1, "Venus", "Escolar", price, totalPrice);
                    System.out.println("Pair of shoes ----> " + pairOfShoes);
                    
                    pairOfShoes = new PairOfShoes(1, "Venus", "Escolar", 20.0F, totalPrice);
                    System.out.println("Pair of shoes ---> " + pairOfShoes);
                    
                    price = 10.0F;
                    pairOfShoes = new PairOfShoes(1, "Buestan", "Casual", price);
                    System.out.println("Pair of shoes ----> " + pairOfShoes);
                    break;
                    
                case 2:
                    System.out.print("Enter the number of packages: ");
                    int numPackages = scanner.nextInt();

                    System.out.print("Enter the number of packs per package: ");
                    int packsPerPackage = scanner.nextInt();

                    System.out.print("Enter the number of cigarettes per pack: ");
                    int cigarettesPerPack = scanner.nextInt();

                    scanner.close();

                    double tax = SalesTax.calculateIceCigarette(numPackages, packsPerPackage, cigarettesPerPack);
                    System.out.println("The ICE tax for cigarettes is: USD " + tax);

                    break;
                    
                case 3:
                    income = dataSalary.getValueIr();
                    dataSalary.setIncome(income);
                    incomeTax = SalesTax.computeIr(income);
                    System.out.println("The income tax for a salary of " + income + " is " + incomeTax);
                    break;
                    
                case 4:
                    System.out.println("Exiting the program...");
                    break;
                
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (option != 3);
        
        scanner.close();
    }
} 

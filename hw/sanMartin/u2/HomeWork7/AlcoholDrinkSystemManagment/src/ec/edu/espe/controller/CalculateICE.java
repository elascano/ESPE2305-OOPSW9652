
package ec.edu.espe.controller;

import com.operartiongosling.taxes.ICETax;
import ec.edu.espe.model.Drink;
import java.util.Scanner;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class CalculateICE {
    Scanner data = new Scanner(System.in);
    
    public void computeData(){
        System.out.println("Add an ID: ");
        int id = data.nextInt();
        System.out.println("Add Brand: ");
        String brand = data.next();
        System.out.println("Add Content in milimeters: ");
        float content = data.nextFloat();
        System.out.println("add percentage in Alcohol: ");
        float percentage = data.nextFloat();
        System.out.println("Choose and option:");
        float tax = taxMenu(content, percentage);
        Drink drink = new Drink(id, brand, content, percentage, tax);
        System.out.println("Drink"+ drink);
    }
     public static float taxMenu(float content, float percentage){
        float tax = 0.0F;
        int option = 0;
        Scanner optionIn = new Scanner(System.in);        
        do{
            System.out.println("-------Select The Correct Option -----\n");
            System.out.println("1. Alcohol\n");
            System.out.println("2. Alcoholic Drink\n");
            System.out.println("3. Artesenal Beer\n");
            System.out.println("4. Small Industrie Beer\n");
            System.out.println("5. Medium Industrie Beer\n");
            System.out.println("6. Big Industrie of Beer\n");
            System.out.println("7. Continue\n");
            System.out.println("Choose an option: ");
            option = optionIn.nextInt();
            
            switch(option){
                case 1:
                    tax = ICETax.computeAlcoholTax(content, percentage, 7.15F, 75.0F);
                    
                    break;
                case 2:
                    tax = ICETax.computeAlcoholDrinkTax(content, percentage, 7.18F, 75.0F);
                    
                    break;
                case 3:
                    tax=ICETax.computeBeerTax(content, percentage, 1.49F, 75.0F);
                    
                    break;
                case 4:
                    tax=ICETax.computeBeerSmallIndustrieTax(content, percentage, 8.41F, 75.0F);
                    
                    break;
                case 5:
                    tax=ICETax.computeBeerMediumIndustrieTax(content, percentage, 10.48F, 75.0F);
                    
                    break;  
                case 6:
                    tax=ICETax.computeBeerIndustrieTax(content, percentage, 13.08F, 75.0F);
                        
                    break;
                case 7:                    
                    option=7;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }while(option!=7);
        return tax;
    }
     
        
    
   
    
}

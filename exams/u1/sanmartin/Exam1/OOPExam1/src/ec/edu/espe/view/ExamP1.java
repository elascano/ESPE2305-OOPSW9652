
package ec.edu.espe.view;

import ec.edu.espe.controller.ShoeRecord;
import ec.edu.espe.model.Shoe;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class ExamP1 {
     public static void main(String[] args){
        
        
        
        
        int option = 0;
        Scanner optionIn = new Scanner(System.in);
        ShoeRecord shoes = new ShoeRecord();
        do{
            System.out.println("-------Shoes Controller-----\n");
            System.out.println("1. Add a Shoe\n");
            System.out.println("2. Print List\n");  
            System.out.println("3. Exit\n");
            System.out.println("Choose an Option: ");
            option = optionIn.nextInt();
            
            switch(option){
                case 1:
                    shoes.record();
                    break;
                case 2:
                    shoes.print();
                    break;
                case 3:
                    System.out.println("Exit...");
                    option =3;
                    break;                  
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }while(option!=3);
    }
         
     }


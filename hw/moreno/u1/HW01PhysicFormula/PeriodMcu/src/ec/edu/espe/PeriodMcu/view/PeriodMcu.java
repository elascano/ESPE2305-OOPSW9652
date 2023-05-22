package ec.edu.espe.PeriodMcu.view;

import static ec.edu.espe.PeriodMcu.model.CalculateQ.CalculateQ;
import static ec.edu.espe.PeriodMcu.model.DataRead.dataReader;
import static ec.edu.espe.PeriodMcu.model.DataWritter.dataWriter;
import ec.edu.espe.PeriodMcu.model.Dato;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PeriodMcu {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean exit = false;
        
        while(!exit){
            System.out.println("Menu");
            System.out.println("1.-Calculate Period");
            System.out.println("2. History");
            System.out.println("3.-Exit");
            int option = sc.nextInt();
            
            switch(option){
                case 1:
                    System.out.println("Calculate Period");
                    dataWriter();
                    break;
                case 2:
                    System.out.println("History");
                    dataReader();
                    break;
                case 3 :
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            System.out.println();
        }
        
        
        
    }
}



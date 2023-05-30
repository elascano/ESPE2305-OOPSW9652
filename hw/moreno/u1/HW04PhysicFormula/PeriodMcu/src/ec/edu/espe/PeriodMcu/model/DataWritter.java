/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.PeriodMcu.model;

import static ec.edu.espe.PeriodMcu.model.CalculateQ.CalculateQ;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class DataWritter {
    public static void dataWriter(){
        Scanner sc= new Scanner(System.in);
        ArrayList<Dato> ad= listaDato(sc);
                    File f = new File("./CalculateTotal.csv");
                    
                    try(FileWriter fw = new FileWriter(f);){
                        for(Dato dato :ad){
                        fw.write(dato.toCSV()+"\n");
                    } 
                    }catch(Exception e){
                        }
    }
    
    public static ArrayList<Dato> listaDato(Scanner sc){
        ArrayList<Dato> ad = new ArrayList <>();
        String choose;
        double frequency;
        double period;
        Dato d;
        do{
            System.out.println("Other calculate? Y/N");
            choose=sc.nextLine();
            if(!choose.equalsIgnoreCase("N")){
                System.out.println("Frequency (Hz):");
                frequency = Double.parseDouble(sc.nextLine());
                period =CalculateQ(frequency);
                System.out.println("The Period is:"+ period + "s");
                d= new Dato(period,frequency);
                ad.add(d);
            } 
        }while(!choose.equalsIgnoreCase("N"));
        return ad;
        
    }                
    
}

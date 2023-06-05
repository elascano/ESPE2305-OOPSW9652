package adittionalities;


import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class WriteFile {
    
    public static void writeFile(){
    
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Development> development2 = ListDevelopment(keyboard);
        File f = new File("./development2.csv");
        
        try(FileWriter fw = new FileWriter(f);){
           for(Development ListDevelopment : development2){
               fw.write(ListDevelopment.toCVS() +"\n");
          } 
        }catch(Exception e){
            System.out.println("Error");
      }

        
    }

public static ArrayList<Development>ListDevelopment(Scanner keyboard){

    ArrayList<Development> development2 = new ArrayList<Development>();

 float speed;
 float distance;
 float time;

 Development d;

do{

    System.out.println("Write the speed: ");
    speed = keyboard.nextFloat();
    if(speed>0){
        System.out.println("Write de distance: ");
        distance = keyboard.nextFloat();
        
        time = speed/distance;
        
        System.out.println("The Time Travel is: " +time+"s");
        d = new Development(speed, distance, time);
        development2.add(d);
        }
    }while (speed<=0);
    return development2;

    }
        
}
    

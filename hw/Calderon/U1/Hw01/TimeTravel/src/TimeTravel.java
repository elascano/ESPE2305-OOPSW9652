

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class TimeTravel {
        
    public static void main(String[] args){
        // TODO code application logic here
    
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;
    int option;

    while(!exit){
    System.out.println("----Wlcome to the menu---");
    System.out.println("1.- Calculate");
    System.out.println("2.- Data read ");
    System.out.println("3.- Exit");  
    
    System.out.println("Choise the option");
    try{
    option = scanner.nextInt();

    switch(option){
    
        case 1:
            System.out.println("1.- Calculate time ");
            fileWriteF();
            break;
        case 2:
            System.out.println("2.- Read Data");
            fileReader();
            break;
        case 3:
            exit = true;
            break;
        default :
            System.out.println("Invalid choise");
        }
      }catch(InputMismatchException e){
          System.out.println("Number");
          scanner.next();
      }
    }
    
    }

    private static void fileReader() {
    ArrayList<Development> development2 = new ArrayList<>();
        Development d;
        String[] read;
            try(Scanner scFile = new Scanner(new File("./development2.csv"))){
            while(scFile.hasNextLine()){
                read = scFile.nextLine().split(",");
                d = new Development(Float.parseFloat(read[0]), Float.parseFloat(read[1]), Float.parseFloat(read[2]));
                development2.add(d);
            }
            }catch (Exception e){
                System.out.println("System Error");}
                for(Development development : development2){
                    System.out.println(development);
                }
            
}

    private static void fileWriteF() {
      
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

    System.out.println("Write the speed -> 0 ");
    speed = keyboard.nextFloat();
    if(speed>0){
        System.out.println("Write de distance");
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

  


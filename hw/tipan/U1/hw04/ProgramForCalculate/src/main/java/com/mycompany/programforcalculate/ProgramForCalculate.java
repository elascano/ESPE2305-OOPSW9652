
package com.mycompany.programforcalculate;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ProgramForCalculate {
    
    static double gravitationalConstant = 0.0000000000667;
    static double massObjectOne = 0;
    static double massObjectTwo = 0;
    static double distanceTheCentreOfGravitiesOfBothObject = 0;
        
    public static void main(String[] args) throws IOException {  
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\oswal\\Desktop\\Personal\\IngSoftware\\OOP\\U1\\ProgramForCalculate\\Data.csv", true));
        writer.newLine();
        writer.write("GravitatioalConstat, Mass Of Object One, Mass Of Object Two, Distance The Centre of Gravity Of Both Objects, Gravitational Force");
        mainMenu(writer); 
    }
    
    public static void mainMenu(BufferedWriter writer) throws IOException{
        
        Scanner dataIn = new Scanner (System.in);  
        int switchOption = 0;
        
        while(switchOption != 4){
            
            System.out.println("-----Program For Calculte The Gravitational Force Between Two Objects-----");
            System.out.println("1. Insert Data\n");
            System.out.println("2. Get Results\n");
            System.out.println("3. Restart Data\n");
            System.out.println("4. Exit\n");
            System.out.println("Insert your option:");
            
            switchOption = dataIn.nextInt();
            
            switch(switchOption){
                
                case 1:
                    askForData(writer);
                break;
                        
                case 2:
                    System.out.println("The gravity force between those two objects is: "+ calculateGravitationForce(writer));
                break;
            
                case 3:
                    restartData();
                break;
            
                case 4:
                    System.out.println("Thanks");
                break;
            
                default:
                    System.out.println("Please, insert a correct option ");
                break;
            }   
        }
    }
    
    public static void askForData (BufferedWriter writer) throws IOException{
      
        Scanner infoRead = new Scanner (System.in);
        
        if(massObjectOne == 0){
            System.out.println("Introduce tha mass of the object One: ");
            massObjectOne = infoRead.nextDouble();
        }
        if (massObjectTwo == 0){
            System.out.println("Introduce the mass of the object Two: ");
            massObjectTwo = infoRead.nextDouble();
        }
        if(distanceTheCentreOfGravitiesOfBothObject == 0){
            System.out.println("Introduce the distance between the two objects: ");
            distanceTheCentreOfGravitiesOfBothObject  = infoRead.nextDouble();
        }else{
            System.out.println("Data is already charged");
            System.out.println("The gravity force between those two objects is: "+ calculateGravitationForce(writer));
        }
        
        
    }
    
    public static double calculateGravitationForce(BufferedWriter writer) throws IOException{
        double gravitationalForce = (gravitationalConstant*massObjectOne*massObjectTwo)/(Math.pow(distanceTheCentreOfGravitiesOfBothObject,2)); 
        writer.newLine();
        writer.write(gravitationalConstant+","+massObjectOne+","+ massObjectTwo+","+distanceTheCentreOfGravitiesOfBothObject+","+gravitationalForce+"\n");
        
        return gravitationalForce;
    }
    
    public static void restartData(){
        massObjectOne = 0;
        massObjectTwo = 0;
        distanceTheCentreOfGravitiesOfBothObject = 0;
    }
}

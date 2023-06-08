
package ec.edu.espe.homeworkphysicformula.model;

import ec.edu.espe.homeworkphysicformula.model.Components;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class FileWritter {
    public static void fileWriter() {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Components> component1 = ListComponents(keyboard);
        File f = new File("./components.csv");
        try(FileWriter fw = new FileWriter(f)){
            for (Components component : component1){
                fw.write(component.toCSV()+"\n");
            }
        } catch (Exception e) {
            System.out.println("Error,check out");
        }
        
      
    }
    public static ArrayList<Components>ListComponents(Scanner keyboard){
        ArrayList<Components> component1 = new  ArrayList<Components>();
    float initialVelocity;
    float acceleration;
    float distance;
    double finalVelocity;
    Components c;
    do{
        System.out.println("Write the distance in m or -1 to finish; ");
        distance = keyboard.nextFloat();
        if(distance>=0){           
            System.out.println("Please write the acceleration in m/s^2: ");
            acceleration = keyboard.nextFloat();
            System.out.println("Please write the initial velocity in m/s: ");
            initialVelocity = keyboard.nextFloat();
        
            double finalInitialSpeed = Math.pow(initialVelocity, 2);
            double partialAnswer = finalInitialSpeed + 2*acceleration*distance;
            finalVelocity = Math.pow(partialAnswer, 0.5);
            System.out.println("The final Velocity is: "+finalVelocity+" m/s");
        c=new Components(initialVelocity,acceleration,distance,finalVelocity);
        component1.add(c);
        }
    } while (distance>=0);
    return component1;
    }
    
}

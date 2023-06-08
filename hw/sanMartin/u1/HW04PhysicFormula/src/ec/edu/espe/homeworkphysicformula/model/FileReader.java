
package ec.edu.espe.homeworkphysicformula.model;
import ec.edu.espe.homeworkphysicformula.model.Components;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class FileReader {
    public static void fileReader() {
        ArrayList<Components> component1 = new ArrayList<Components>();
        Components c;
        String[] data;
        try(Scanner scFile = new Scanner(new File("./components.csv"))){
            while(scFile.hasNextLine()){
                data=scFile.nextLine().split(",");
                c = new Components(Float.parseFloat(data[0]),Float.parseFloat(data[1]),Float.parseFloat(data[2]),Double.parseDouble(data[3]));
                component1.add(c);
            }
    }catch(Exception e){
            System.out.println("Error");}
        for (Components component : component1){
            System.out.println(component);
        } 
    }
}
    



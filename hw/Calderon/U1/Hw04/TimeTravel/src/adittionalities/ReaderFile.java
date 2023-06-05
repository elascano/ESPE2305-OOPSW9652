package adittionalities;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class ReaderFile {
    
    public static void fileReader(){
        
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
}



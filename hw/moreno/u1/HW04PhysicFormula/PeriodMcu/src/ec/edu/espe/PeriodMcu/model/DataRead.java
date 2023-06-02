
package ec.edu.espe.PeriodMcu.model;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class DataRead {
    public static void dataReader(){
        ArrayList<Dato> datosF=new ArrayList<Dato>();
        Dato d;
        String[] info;
        try (Scanner scFile = new Scanner(new File("./CalculateTotal.csv"))){
            while(scFile.hasNextLine()){
                info=scFile.nextLine().split(",");
                d= new Dato(Double.parseDouble(info[1]),Double.parseDouble(info[0]));
                datosF.add(d); 
            }
            
        } catch (Exception e) {
            System.out.println("ERROR");
        }
         for(Dato dato:  datosF){
            System.out.println(dato);
        }
    }
    
}

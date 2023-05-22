package ec.edu.espe.file;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import kineticenergy.KineticEnergy;

/**
 *
 * @author Michael Simbaña
 */
public class ReadTheSaved {
    
    public static void readFile() {
        ArrayList<KineticEnergy> al = new ArrayList<KineticEnergy>();
        KineticEnergy k;
        String[] data;
        try (Scanner scFile = new Scanner(new File("./SaveData.csv"))){
            while(scFile.hasNextLine()){
                data = scFile.nextLine().split(",");
                k = new KineticEnergy(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]), Float.parseFloat(data[4]));
                al.add(k);
            }
        }catch (Exception e){
            System.out.println("Error");}
        for (KineticEnergy kineticenergy : al){
            System.out.println(kineticenergy);
        }
    }
}

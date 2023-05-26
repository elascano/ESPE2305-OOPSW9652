package ec.edu.espe.file;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import kineticenergy.KineticEnergy;

/**
 *
 * @author Michael Simbaña
 */

public class FileCsv {
    
    public static void createfile(){
    Scanner sc = new Scanner(System.in);
    ArrayList<KineticEnergy> al = dataSave(sc);
    File f = new File("./SaveData.csv");
    
    try (FileWriter fw = new FileWriter(f)){
        for (KineticEnergy kineticenergy : al){
            fw.write(kineticenergy.toCSV() + "\n");
        }        
    }catch (Exception e){
        System.out.println("Se ha producido un error");
    } 
}
        

    public static ArrayList<KineticEnergy> dataSave(Scanner sc){
        ArrayList<KineticEnergy> al = new ArrayList<KineticEnergy>();
        int mass;
        int speed;
        int constant = 8;
        int square_of_velocity;
        float kinetic_energy;
        KineticEnergy k;
        
        System.out.print("Masa: ");
        mass = Integer.parseInt(sc.nextLine());
        System.out.print("Velocidad: ");
        speed = Integer.parseInt(sc.nextLine());
        
        System.out.println("Constante: " + constant);
        square_of_velocity = speed* speed;
        kinetic_energy = (mass * square_of_velocity) / constant;
        k = new KineticEnergy(mass, speed, constant, square_of_velocity, kinetic_energy);
        al.add(k);
        System.out.println("La energia cinetica es: " + kinetic_energy);
        return al;
    }    
}
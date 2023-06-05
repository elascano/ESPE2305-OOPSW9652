package ec.edu.edpe.accelerationformula.model;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class CSVRead {

    public static void main() {
        ArrayList<Data> list = new ArrayList<Data>();
        Data data;
        String[] information;
        try (Scanner scFile = new Scanner(new File("./acceleration.csv"))) {
            while (scFile.hasNextLine()) {
                information = scFile.nextLine().split(",");
                data = new Data(Float.parseFloat(information[0]), Float.parseFloat(information[1]), Float.parseFloat(information[2]), Float.parseFloat(information[3]));
                list.add(data);
            }
        } catch (Exception error) {
            System.out.println("An error has occurred");
        }
        
        for(Data datas : list){
            System.out.println(datas);
        }
    }
}

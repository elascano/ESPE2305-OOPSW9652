package exam1.model;

import exam1.controller.EditFornitureDataFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class EditForniture {
    public void createForniture() throws FileNotFoundException{
        File file = new File("data\\forniture.json");
        EditFornitureDataFile editFornitureDataFile = new EditFornitureDataFile();
        ArrayList<Forniture> listForniture = new ArrayList();
        Scanner readData = new Scanner(System.in);
        if (file.exists() && file.length() == 0) {
            listForniture = new ArrayList<>();
        } else {
            listForniture = editFornitureDataFile.readFornitureData();
        }
        System.out.print("\nID: ");
        int id = readData.nextInt();
        System.out.print("Price: ");
        float price = readData.nextFloat();
        System.out.print("Stock: ");
        String stock = readData.next();
        Forniture forniture = new Forniture(id, price, stock);
        listForniture.add(forniture);
        editFornitureDataFile.writeFornitureData(listForniture);
    }
    
    public void readForniture() throws FileNotFoundException{
        File file = new File("data\\forniture.json");
        EditFornitureDataFile editFornitureDataFile = new EditFornitureDataFile();
        ArrayList<Forniture> listForniture = new ArrayList();
        if (file.exists() && file.length() == 0) {
            System.out.println("File Null\n\n");
        } else {
            listForniture = editFornitureDataFile.readFornitureData();
            System.out.println("\n\n\tForniture list");
            for (Forniture forniture : listForniture) {
                System.out.println(forniture.toString());
            }
        }
    }
}

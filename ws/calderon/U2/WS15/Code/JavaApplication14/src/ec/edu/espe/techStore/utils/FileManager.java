package ec.edu.espe.techStore.utils;

import ec.edu.espe.techStore.model.CellphoneData;
import java.io.*;
import java.util.List;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class FileManager {

    public static void SaveAndReadObject(List<CellphoneData> cellphoneDataList) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public static List<CellphoneData> loadCellphoneData() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public class SaveAndReadObject {

        public static void SaveObject(CellphoneData object, String file) {
            try {
                FileOutputStream fileOut = new FileOutputStream(file);
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(object);
                out.close();
                fileOut.close();
                System.out.println("Object save " + file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static CellphoneData readObject(String file) {
            CellphoneData objeto = null;
            try {
                FileInputStream fileIn = new FileInputStream(file);
                ObjectInputStream in = new ObjectInputStream(fileIn);
                objeto = (CellphoneData) in.readObject();
                in.close();
                fileIn.close();
                System.out.println("Object Read " + file);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            return objeto;
        }
    }
}

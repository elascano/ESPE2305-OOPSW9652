package ec.edu.espe.chickenfarmhomework.controller;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.chickenfarmhomework.model.Coop;
import java.io.File;
import java.io.PrintWriter;

/**
 *
 * @author Juan Rueda, The Javas, DCCO-ESPE
 */
public class SaveData {
    public void saveData(Coop coop1, Coop coop2){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String gsonCoop1 = gson.toJson(coop1);
        String gsonCoop2 = gson.toJson(coop2);
        System.out.println(gsonCoop1);
        System.out.println(gsonCoop2);
        try(PrintWriter printWriter = new PrintWriter(new File("Data.json"))){
            printWriter.write(gsonCoop1);
            printWriter.write(gsonCoop2);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}

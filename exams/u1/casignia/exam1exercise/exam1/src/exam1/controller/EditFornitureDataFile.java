package exam1.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import exam1.model.Forniture;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class EditFornitureDataFile {
    public void writeFornitureData(ArrayList<Forniture> forniture) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(forniture);

        try (FileWriter writer = new FileWriter("data\\forniture.json")) {
            writer.write(json);
        }
        catch (IOException e) {
        }
    }
    
    public ArrayList<Forniture> readFornitureData() throws FileNotFoundException{
        ArrayList<Forniture> listForniture = new ArrayList();
        
        try (FileReader reader = new FileReader("data\\forniture.json")) {
            Gson gson = new Gson();
            Type arrayListAdministrator = new TypeToken<ArrayList<Forniture>>(){}.getType();
            listForniture = gson.fromJson(reader, arrayListAdministrator);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listForniture;
    }
}

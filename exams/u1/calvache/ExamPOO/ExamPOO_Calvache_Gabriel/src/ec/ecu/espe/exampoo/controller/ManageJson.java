package ec.ecu.espe.exampoo.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import ec.ecu.espe.exampoo.model.CellPhone;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class ManageJson {

    public static void writteJson(ArrayList<CellPhone> cellPhone) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(cellPhone);

        try ( FileWriter writer = new FileWriter("data\\cellphone.json")) {
            writer.write(json);
        } catch (IOException e) {
            System.out.println("Error generating JSON file" + e.getMessage());
        }
    }

    public static ArrayList<CellPhone> readJson() throws FileNotFoundException {
        ArrayList<CellPhone> listCellPhone = new ArrayList<>();

        try ( FileReader reader = new FileReader("data\\cellphone.json")) {
            Gson gson = new Gson();
            Type arrayListCellPhone = new TypeToken<ArrayList<CellPhone>>() {
            }.getType();
            listCellPhone = gson.fromJson(reader, arrayListCellPhone);
        } catch (IOException | JsonSyntaxException | JsonIOException e) {
        }

        return listCellPhone;
    }
}

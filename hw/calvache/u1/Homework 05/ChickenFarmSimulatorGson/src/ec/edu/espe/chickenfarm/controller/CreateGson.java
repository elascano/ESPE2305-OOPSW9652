package ec.edu.espe.chickenfarm.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.chikenfarm.model.Coop;
import java.io.File;
import java.io.PrintWriter;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class CreateGson {

    public void saveData(Coop coop1, Coop coop2) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String gsonCoop1 = gson.toJson(coop1);
        String gsonCoop2 = gson.toJson(coop2);
        System.out.println(gsonCoop1);
        System.out.println(gsonCoop2);
        try (PrintWriter printWriter = new PrintWriter(new File("chickenfarminformation.json"))) {
            printWriter.write(gsonCoop1);
            printWriter.write(gsonCoop2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

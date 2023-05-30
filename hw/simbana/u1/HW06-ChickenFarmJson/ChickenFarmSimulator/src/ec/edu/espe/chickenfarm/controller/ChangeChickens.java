package ec.edu.espe.chickenfarm.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class ChangeChickens {
    public void changeChickens(int coopNumber) {
        Coop coop1 = loadCoopFromJson("Saved.json");
        Coop coop2 = loadCoopFromJson("Saved.json");
        
        Coop targetCoop;
        if (coopNumber == 1) {
            targetCoop = coop1;
        } else if (coopNumber == 2) {
            targetCoop = coop2;
        } else {
            return;
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Id: ");
        int chickenId = sc.nextInt();
        sc.nextLine();
        System.out.print("New Name: ");
        String newName = sc.nextLine();
        System.out.print("Nueva Age: ");
        int newAge = sc.nextInt();
        sc.nextLine();
        System.out.print("New Color: ");
        String newColor = sc.nextLine();

        for (Chicken chicken : targetCoop.getChickens()) {
            if (chicken.getId() == chickenId) {
                chicken.setName(newName);
                chicken.setAge(newAge);
                chicken.setColor(newColor);
                break;
            }
        }

        saveCoopToJson(coop1, "Saved.json");
        saveCoopToJson(coop2, "Saved.json");
    }

    private Coop loadCoopFromJson(String fileName) {
        try (FileReader fileReader = new FileReader(fileName)) {
            Gson gson = new Gson();
            return gson.fromJson(fileReader, Coop.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void saveCoopToJson(Coop coop, String fileName) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String gsonCoop = gson.toJson(coop);

        try (PrintWriter printWriter = new PrintWriter(new FileWriter(fileName))) {
            printWriter.write(gsonCoop);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}

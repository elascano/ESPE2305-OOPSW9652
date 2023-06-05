/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.speed.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.speed.model.Speed;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class JsonSpeed {
    public void Speed(Speed speed) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(speed);

        try (FileWriter writer = new FileWriter("speed.json")) {
            writer.write(json);
        } catch (IOException e) {
            System.out.println("Error generating JSON file: " + e.getMessage());
        }
    }
    
    public void readAdministratorData() throws FileNotFoundException{
        FileReader reader = new FileReader("speed.json");
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String jsonString = stringBuilder.toString();
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        Speed speed = gson.fromJson(jsonString, Speed.class);
        System.out.println(speed.toString());
    }
}

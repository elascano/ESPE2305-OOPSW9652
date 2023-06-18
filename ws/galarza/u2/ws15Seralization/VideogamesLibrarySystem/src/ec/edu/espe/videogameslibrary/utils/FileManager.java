/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.videogameslibrary.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.videogameslibrary.model.Videogame;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class FileManager {

    static public void writeVideogameData() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Scanner scanner = new Scanner(System.in);
        ArrayList <Videogame> listVideogame = new ArrayList();
        File file = new File("data\\videogame.json");
        
        if (file.exists() && file.length() == 0) {
            listVideogame = new ArrayList<>();
        } else {
            try (FileReader reader = new FileReader(file)) {
                Gson gsonRead = new Gson();
                Type arrayListVideogame = new TypeToken<ArrayList<Videogame>>() {}.getType();
                listVideogame = gsonRead.fromJson(reader, arrayListVideogame);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Language: ");
        String language = scanner.nextLine();
        System.out.print("Genre: ");
        String genre = scanner.nextLine();
        System.out.print("Developer: ");
        String developer = scanner.nextLine();
        System.out.print("Price: ");
        float price = scanner.nextFloat();
        System.out.print("Is Multiplayer: ");
        boolean isMultiplayer = scanner.nextBoolean();
        
        Videogame videogame = new Videogame(language, title, genre, price, developer, isMultiplayer);
        listVideogame.add(videogame);
        
        String json = gson.toJson(listVideogame);
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(json);
        } catch (IOException e) {
        }
    }

    static public void readVideogameData() throws FileNotFoundException {
        ArrayList<Videogame> listVideogames = new ArrayList<>();
        File file = new File("data\\videogame.json");

        if (file.exists() && file.length() == 0) {
            System.out.println("\n0 results match your search\n");
        } else {
            try (FileReader reader = new FileReader(file)) {
                Gson gson = new Gson();
                Type arrayListVideogame = new TypeToken<ArrayList<Videogame>>() {}.getType();
                listVideogames = gson.fromJson(reader, arrayListVideogame);
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (Videogame videogame : listVideogames) {
                System.out.println(videogame.toString());
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategy.controller;

import com.mongodb.MongoClientException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Juan Pasquel, The Encoders, DCCO-ESPE
 */
public class MongoConnection {
    public static MongoCollection<org.bson.Document> getConnection(String collection) throws MongoClientException {
        try {
            String url = "mongodb+srv://jdpasquel1:jdpasquel1@cluster0.edeoi1j.mongodb.net/";
            String dataBase = "StrategyPasquel";
            MongoClient mc = MongoClients.create(url);
            MongoDatabase database = mc.getDatabase(dataBase);
            MongoCollection<org.bson.Document> c = database.getCollection(collection);

            return c;
        } catch (MongoClientException e) {
            System.out.println("Error connecting to MongoDB Atlas: " + e.getMessage());
            throw e;
        }
    }
}

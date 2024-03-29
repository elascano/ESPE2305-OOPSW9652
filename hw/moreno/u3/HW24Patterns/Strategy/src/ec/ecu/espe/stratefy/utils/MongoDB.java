/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.ecu.espe.stratefy.utils;

import com.mongodb.MongoClientException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class MongoDB {
    public static MongoCollection<org.bson.Document> getConnection(String collection) throws MongoClientException {
        try {
            String url = "mongodb+srv://pmoreno:pmoreno@cluster0.to6ri80.mongodb.net/?retryWrites=true&w=majority";
            String dataBase = "ExamP2";
            MongoClient cluster = MongoClients.create(url);
            MongoDatabase database = cluster.getDatabase(dataBase);
            MongoCollection<org.bson.Document> dbCollection = database.getCollection(collection);

            return dbCollection;
        } catch (MongoClientException e) {
            System.out.println("Error connecting to MongoDB Atlas: " + e.getMessage());
            throw e;
        }
    }
}

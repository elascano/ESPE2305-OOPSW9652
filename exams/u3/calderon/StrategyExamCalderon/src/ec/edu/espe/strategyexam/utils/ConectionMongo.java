/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategyexam.utils;

import com.mongodb.MongoClientException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class ConectionMongo {
    
    public static MongoCollection<org.bson.Document> getConnection(String collection) throws MongoClientException {
        try {
            String url = "mongodb+srv://techware:techware@cluster1.catv1fd.mongodb.net/?retryWrites=true&w=majority";
            String dataBase = "strategyCalderon";
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

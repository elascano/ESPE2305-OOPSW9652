/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.q71100.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.crud.utils.MongoDBConnection;
import javax.swing.text.Document;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class SoccerTeamsController {
    private final MongoCollection<Document> collection;
    
    public SoccerTeamsController() {
        MongoDBConnection mongoDBConnection = new MongoDBConnection();
        MongoDatabase database = mongoDBConnection.getDatabase();
        this.collection = database.getCollection("SoccerTeams"); 
    }
    public void readSoccerTeams() {
        try (MongoCursor<Document> cursor = collection.find().iterator()) {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                System.out.println(doc.toJson());
            }
        }
    }
}

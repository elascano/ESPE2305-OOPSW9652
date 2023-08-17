/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategy.controller;

import com.mongodb.client.MongoCollection;
import static ec.edu.espe.strategy.controller.MongoConnection.getConnection;
import org.bson.Document;

/**
 *
 * @author Juan Pasquel, The Encoders, DCCO-ESPE
 */
public class SortController {
    public static void addSortCase(Document sortCase) {
        MongoCollection activitiesCollection = getConnection("arrayJuan");
        activitiesCollection.insertOne(sortCase);
    }
}

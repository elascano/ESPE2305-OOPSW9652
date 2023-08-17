/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exam.utils;

import org.bson.Document;
import com.mongodb.client.MongoCollection;
import static ec.edu.espe.exam.controller.ConectionMongo.getConnection;


/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class SortedMethod {
    
    public static void CreateSortedMethod(Document sortMethod) {
        MongoCollection collection = getConnection("strategy pattern");
        collection.insertOne(sortMethod);
    }
    
    
}

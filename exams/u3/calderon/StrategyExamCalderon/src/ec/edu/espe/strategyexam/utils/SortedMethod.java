/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategyexam.utils;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
//import static ec.ecu.espe.strategyexam.utils.ConectionMongo.getConnection;
import static ec.edu.espe.strategyexam.utils.ConectionMongo.getConnection;


/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class SortedMethod {
    
    public static void CreateSortedMethod(Document sortMethod) {
        MongoCollection collection = getConnection("arrayJilmar");
        collection.insertOne(sortMethod);
    }
    
    
}

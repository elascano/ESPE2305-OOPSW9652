/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.ecu.espe.stratefy.utils;

import com.mongodb.client.MongoCollection;
import static ec.ecu.espe.stratefy.utils.MongoDB.getConnection;
import org.bson.Document;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class Operation {
    public static void addSortMethod(Document sortMethod) {
        MongoCollection collection = getConnection("OPPExam3");
        collection.insertOne(sortMethod);
    }
}

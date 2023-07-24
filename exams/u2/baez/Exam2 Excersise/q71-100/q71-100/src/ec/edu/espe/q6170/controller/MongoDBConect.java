/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.q6170.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.q6170.model.Vehicle;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class MongoDBConect {
    public void Vehicleconect(ArrayList<Vehicle> vehicleList, DefaultTableModel model, javax.swing.JTable tabList){
        
        Vehicle vehicle;
        String uri = "mongodb+srv://gabrielbaez:YsW2410EVJ@cluster0.mheqaaq.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Exam2");
            MongoCollection<Document> collection = database.getCollection("vehicles");
            
            int sizeVehicleList = vehicleList.size();
            
            for (int i = 0; i < sizeVehicleList; i++) {
                vehicle = vehicleList.get(i);
                Bson usernameFilter = Filters.eq("Id", vehicle.getId());
                Document productDocument = collection.find(usernameFilter).first();
                if (productDocument != null) {
                    int amount = productDocument.getInteger("Ammount");
                    amount = amount - vehicle.getAmount();
                    Bson update = new Document("$set", new Document("Ammount", amount));
                    collection.updateOne(usernameFilter, update);
                } else {
                    JOptionPane.showMessageDialog(null, "Vehicle not found");
                }
                model.removeRow(0);
                tabList.setModel(model);
            }
        } catch (MongoException e) {
            JOptionPane.showMessageDialog(null, "Error in conection to data base");
            e.printStackTrace();
        }
    }
}

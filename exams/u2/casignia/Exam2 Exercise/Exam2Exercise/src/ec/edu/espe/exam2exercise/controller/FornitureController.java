package ec.edu.espe.exam2exercise.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import javax.swing.JOptionPane;
import org.bson.Document;
import org.bson.conversions.Bson;
import ec.edu.espe.exam2exercise.model.Sale;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class FornitureController {
    public void inventoryConnect(ArrayList<Sale> saleList, DefaultTableModel model, javax.swing.JTable tabList){
        Sale sale;
        String uri = "mongodb+srv://dacasignia:dacasignia@cluster0.zry5emh.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("exam");
            MongoCollection<Document> collection = database.getCollection("inventory");
            
            int sizeSaleList = saleList.size();
            
            for (int i = 0; i < sizeSaleList; i++) {
                sale = saleList.get(i);
                Bson usernameFilter = Filters.eq("id", sale.getId());
                Document productDocument = collection.find(usernameFilter).first();
                if (productDocument != null) {
                    int amount = productDocument.getInteger("stock");
                    amount = amount - sale.getAmount();
                    Bson update = new Document("$set", new Document("stock", amount));
                    collection.updateOne(usernameFilter, update);
                } else {
                    JOptionPane.showMessageDialog(null, "Producto no encontrado");
                }
                model.removeRow(0);
                tabList.setModel(model);
            }
        } catch (MongoException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos");
            e.printStackTrace();
        }
    }
    public void incomeConnect(ArrayList<Sale> saleList, float finalPrice){

    Sale sale;
        
    String uri = "mongodb+srv://dacasignia:dacasignia@cluster0.zry5emh.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("exam");
            MongoCollection<Document> collection = database.getCollection("income");

            int id;
            String name;
            int amount;
            float price;
            
            for(int i=0; i<saleList.size(); i++){
                
            sale = saleList.get(i);
                
            id = sale.getId();
            name = sale.getNameProduct();
            amount = sale.getAmount();
            price = sale.getTotalPrice();
            
            Document doc1 = new Document("id", id).append("name", name).append("stock", amount).append("price", price).append("final price", finalPrice);

            collection.insertOne(doc1);
            } 
        }

    }
    
}

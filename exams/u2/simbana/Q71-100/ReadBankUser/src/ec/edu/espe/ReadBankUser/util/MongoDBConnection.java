
package ec.edu.espe.ReadBankUser.util;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class MongoDBConnection {
   private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;

    public void connection(String collections) {
        String uri ="mongodb+srv://stevenriva21:stevenriva21@cluster0.skbktne.mongodb.net/?retryWrites=true&w=majority";
        String db = "Bank";
        mongoClient = MongoClients.create(uri);
        database = mongoClient.getDatabase(db);
        collection = database.getCollection(collections);
        System.out.println("Connected to MongoDB Atlas successfully!");
    }
    
    public static String validId(String cedula) {
        cedula = cedula.trim();
        if (cedula.length() != 10) {
            return "Cadena inválida";
        }
        // Verificar que sean solo dígitos
        if (!cedula.matches("\\d+")) {
            return "La cédula debe contener solo dígitos";
        }
        return cedula;
    }
    
    
    public long countDocumentsInCollection() {
        try {
            MongoCollection<Document> collection = getCollection();
            long count = collection.countDocuments();
            return count;
        } catch (Exception e) {
            System.err.println("Error al contar objetos en la colección: " + e.getMessage());
            return -1;
        }
    }

    public MongoDatabase getDatabase() {
        return database;
    }

    public MongoCollection<Document> getCollection() {
        return collection;
    }
}
    


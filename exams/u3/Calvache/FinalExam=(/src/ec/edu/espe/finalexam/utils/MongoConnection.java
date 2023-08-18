
package ec.edu.espe.finalexam.utils;

import com.mongodb.MongoClientException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class MongoConnection {
    public static MongoCollection<org.bson.Document> getConnection(String collection) throws MongoClientException {
        try {
            String url = "mongodb+srv://gcalvache:gcalvache@cluster0.qsalyjy.mongodb.net/?retryWrites=true&w=majority";
            String dataBase = "strategyCalvache";
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

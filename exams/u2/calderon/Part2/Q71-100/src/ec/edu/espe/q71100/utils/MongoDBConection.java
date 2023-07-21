
package ec.edu.espe.q71100.utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class MongoDBConection {
    
    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;

    public void connection(String collections) {
        String uri ="mongodb+srv://techware:techware@cluster1.catv1fd.mongodb.net/?retryWrites=true&w=majority";
        String db = "Computers";
        mongoClient = MongoClients.create(uri);
        database = mongoClient.getDatabase(db);
        collection = database.getCollection(collections);
    }

    public long countDocumentsInCollection() {
        try {
            MongoCollection<Document> collection = getCollection();
            long count = collection.countDocuments();
            return count;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
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


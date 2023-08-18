
package Utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Edison Ludeña, BugBusters,DCC-ESPE
 */
public class MongoDBConnection {
   private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;

    public void connection(String collections) {
        String uri = "mongodb+srv://eludena:eludena@cluster0.sxrxhjy.mongodb.net/?retryWrites=true&w=majority";
        String db = "strategyLudeña";
        mongoClient = MongoClients.create(uri);
        database = mongoClient.getDatabase(db);
        collection = database.getCollection(collections);
    }

    public MongoDatabase getDatabase() {
        return database;
    }

    public MongoCollection<Document> getCollection() {
        return collection;
    }
}
    


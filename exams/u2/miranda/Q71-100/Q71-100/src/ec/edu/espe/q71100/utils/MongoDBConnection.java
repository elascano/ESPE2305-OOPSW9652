package ec.edu.espe.crud.utils;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class MongoDBConnection {
    private static final String DATABASE_NAME = "Q71-100"; 
    public MongoDatabase getDatabase() {
        MongoClientURI uri = new MongoClientURI("mongodb+srv://mirandaalison:mirandaalison@cluster0.d67n2we.mongodb.net/?retryWrites=true&w=majority");
        MongoClient mongoClient = new MongoClient(uri);
        return mongoClient.getDatabase(DATABASE_NAME);
    }
}
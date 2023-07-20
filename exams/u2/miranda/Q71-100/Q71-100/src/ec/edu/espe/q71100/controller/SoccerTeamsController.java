package ec.edu.espe.q71100.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.q71100.model.SoccerTeams;
import ec.edu.espe.q71100.utils.MongoDBConnection;
import org.bson.Document;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class SoccerTeamsController {
    private final MongoCollection<Document> collection;

    public SoccerTeamsController() {
        MongoDBConnection mongoDBConnection = new MongoDBConnection();
        MongoDatabase database = mongoDBConnection.getDatabase();
        this.collection = database.getCollection("SoccerTeams");
    }

    public SoccerTeams readSoccerTeams(int id) {
        Document query = new Document("id", id);
        Document result = collection.find(query).first();

        if (result != null) {
            Integer docId = result.getInteger("id");
            String name = result.getString("name");
            Integer numberOfPlayers = result.getInteger("numberOfPlayers");

            Double feePerPlayer = null;
            Object feePerPlayerObj = result.get("feePerPlayer");
            if (feePerPlayerObj instanceof Double) {
                feePerPlayer = (Double) feePerPlayerObj;
            } else if (feePerPlayerObj instanceof Integer) {
                feePerPlayer = ((Integer) feePerPlayerObj).doubleValue();
            }

            Double totalFee = null;
            Object totalFeeObj = result.get("totalFee");
            if (totalFeeObj instanceof Double) {
                totalFee = (Double) totalFeeObj;
            } else if (totalFeeObj instanceof Integer) {
                totalFee = ((Integer) totalFeeObj).doubleValue();
            }

            return new SoccerTeams(docId, name, numberOfPlayers, feePerPlayer, totalFee);
        }

        return null;
    }
}

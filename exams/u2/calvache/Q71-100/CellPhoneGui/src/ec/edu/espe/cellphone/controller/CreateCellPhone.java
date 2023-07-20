
package ec.edu.espe.cellphone.controller;

import ec.edu.espe.cellphone.model.CellPhone;
import ec.edu.espe.cellphone.utils.MongoDBConection;
import org.bson.Document;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class CreateCellPhone {

    private MongoDBConection mongoDBConnection;

    public CreateCellPhone(MongoDBConection mongoDBConnection) {
        this.mongoDBConnection = mongoDBConnection;
    }

    public void createCellPhone(int id, String brand, float price, int stock) {
        CellPhone cellPhone = new CellPhone(id, brand, price, stock);

        Document document = new Document("Id", cellPhone.getId())
                .append("Brand", cellPhone.getBrand())
                .append("Price", cellPhone.getPrice())
                .append("Stock", cellPhone.getStock());

        mongoDBConnection.getCollection().insertOne(document);
    }
}

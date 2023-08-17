
package ec.edu.espe.strategyfinalexam.controller;

import ec.edu.espe.conecction.MongoConnection;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JTextField;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class StrategyController {
    public void reciveData(JTextField numbers,JTextField list,JTextField type) {
        
        String uri = "mongodb+srv://jmsanmartin:12345@cluster0.nfzl84s.mongodb.net/?retryWrites=true&w=majority";
        String[] numberInput = numbers.getText().split(",");
        int[] insertedData = new int[numberInput.length];
        for (int i = 0; i < numberInput.length; i++) {
            insertedData[i] = Integer.parseInt(numberInput[i].trim());
        }

        SortingContext context = new SortingContext();
        int[] sortedNumbers = context.sort(insertedData);

        list.setText(Arrays.toString(sortedNumbers));

        String sortStrategy = context.getSortStrategy().getClass().getSimpleName();
        type.setText(sortStrategy);

        ArrayList<Integer> sortArr = new ArrayList<>();

        for (int i = 0; i < sortedNumbers.length; i++) {
            sortArr.add(sortedNumbers[i]);
        }

        Document sortDocument = new Document().append("_id", new ObjectId())
                .append("unsorted", numbers.getText())
                .append("size", insertedData.length)
                .append("sortAlgorithm", sortStrategy)
                .append("sorted", sortArr.toString());

        MongoConnection.addDataDoc("arrayJose", uri, "strategySanmartin", sortDocument);
    }
}

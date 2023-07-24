/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.codepartexam.cotroller;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.edu.espe.codepartexam.model.Student;
import javax.swing.FocusManager;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
/**
 *
 * @author Oswaldo Tipan
 */
public class StudentController {
    public String uri = "mongodb+srv://jmsanmartin:12345@managmentsystem.kklzuz1.mongodb.net/?retryWrites=true&w=majority";
     
    public void fileWritter(Student student){
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("SchoolManagmentSystem");
            MongoCollection<Document> collection = database.getCollection("Student");
                        
            try {
                Document holisticStudentDocument = new Document();
                holisticStudentDocument.append("_id", student.getId());
                holisticStudentDocument.append("name", student.getName());
                holisticStudentDocument.append("txtMonthlyPayment", student.getMonthylPayment());
                holisticStudentDocument.append("course", student.getCourse());
                collection.insertOne(holisticStudentDocument);    
            } catch (MongoException me) {

            }
        }
    }
}

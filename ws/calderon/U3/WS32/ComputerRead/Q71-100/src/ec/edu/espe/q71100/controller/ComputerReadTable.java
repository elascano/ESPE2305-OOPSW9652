
package ec.edu.espe.q71100.controller;

import com.mongodb.client.FindIterable;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class ComputerReadTable {
    
    public static void showTable(JTable tbComputer, FindIterable<Document> iterable) {
        
        DefaultTableModel model = (DefaultTableModel) tbComputer.getModel();
        model.setRowCount(0);
        model.addColumn("Id");
        model.addColumn("Product");
        model.addColumn("Amount");
        model.addColumn("Price unit");
        model.addColumn("Price + IVA");

        for (Document document : iterable) {
                int id = document.getInteger("Id");
                String nombre = document.getString("Name");
                int cantidad = document.getInteger("Ammount");
                float precio = document.getDouble("Price").floatValue();

                float priceIva = precio + (precio*0.12F);
                
                model.addRow(new Object[]{id, nombre, cantidad, precio, priceIva});
            }
        }
}

package ec.edu.espe.ReadBankUser.controller;

import com.mongodb.client.FindIterable;
import org.bson.Document;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class readBankUser {
     public static void showTable(JTable jTable, FindIterable<Document> data) {
        DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();
        tableModel.setRowCount(0);

        tableModel.addColumn("ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Age");
        tableModel.addColumn("Money in the Bank");
        tableModel.addColumn("Type of Benefit");

        for (Document document : data) {
            Object[] row = new Object[5];
            row[0] = document.getInteger("id");
            row[1] = document.getString("name");
            row[2] = document.getInteger("age");
            row[3] = document.getDouble("moneyInTheBank");

            double dineroDepositado = (Double) row[3];
            if (dineroDepositado >= 800) {
                row[4] = "Credit and Debit";
            } else {
                row[4] = "Debit";
            }
            
            tableModel.addRow(row);
        }
    }
}

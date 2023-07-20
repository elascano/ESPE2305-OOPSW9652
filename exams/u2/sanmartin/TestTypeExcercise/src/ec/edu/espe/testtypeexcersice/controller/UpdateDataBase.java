
package ec.edu.espe.testtypeexcersice.controller;
import org.bson.Document;
import ec.edu.espe.testtypeexcersice.utils.MongoDBConection;
import ec.edu.espe.testtypeexcersice.view.frmTelevisionSell;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class UpdateDataBase {
   public static void recover(JTextField ids,JTextField tvModel,JTextField tvStock) {
        MongoDBConection mdc = new MongoDBConection();
        mdc.connection("Tvs");
        int id = Integer.parseInt(ids.getText());                
        Document query = new Document("id", id);
        Document document = mdc.getCollection().find(query).first();
        
        if (document != null) {
            String model = document.getString("model");
            int stock = document.getInteger("stock");
            
            tvModel.setText(model);
            tvStock.setText(String.valueOf(stock));
            
            
            tvModel.setEditable(false);
            tvStock.setEditable(false);
        } else {
            
            tvModel.setText("");
            tvStock.setText("");
        }
   }
        
        public void update(JTextField identification,JTextField sell,JTextField inStock,JTextField tvModel){
        MongoDBConection mdc = new MongoDBConection();
        frmTelevisionSell fts = new frmTelevisionSell();
        mdc.connection("Tvs");    
        int id = Integer.parseInt(identification.getText());
        int toSell = Integer.parseInt(sell.getText());        
        
        Document query = new Document("id", id);
        Document document = mdc.getCollection().find(query).first();
        
        if (document != null) {
            int stock = document.getInteger("stock");
            int newStock = stock - toSell;
            
            if (newStock >= 0) {
                Document update = new Document("$set", new Document("stock", newStock));
                mdc.getCollection().updateOne(query, update);
                
                
                inStock.setText(String.valueOf(newStock));                
                JOptionPane.showMessageDialog(fts, "Venta realizada con éxito");
                
                
                identification.setText("");
                tvModel.setText("");
                inStock.setText("");
                sell.setText("");
            } else {
                JOptionPane.showMessageDialog(fts, "No hay suficiente stock para realizar la venta");
            }
        }
    }
    }
   
    
    
    
   
  


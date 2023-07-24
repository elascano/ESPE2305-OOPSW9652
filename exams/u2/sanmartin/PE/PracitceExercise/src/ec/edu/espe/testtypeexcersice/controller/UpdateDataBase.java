
package ec.edu.espe.testtypeexcersice.controller;
import org.bson.Document;
import ec.edu.espe.testtypeexcersice.utils.MongoDBConection;
import ec.edu.espe.testtypeexcersice.view.frmShoesInventory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class UpdateDataBase {
   public static void recover(JTextField ids,JTextField tvModel,JTextField tvStock,JTextField color,JTextField price) {
        MongoDBConection mdc = new MongoDBConection();
        mdc.connection("Shoes");
        int id = Integer.parseInt(ids.getText());                
        Document query = new Document("id", id);
        Document document = mdc.getCollection().find(query).first();
        
        if (document != null) {
            String model = document.getString("brand");
            String shoeColor = document.getString("color");
            int stock = document.getInteger("stock");
            int shoesPrice = document.getInteger("price");
            
            tvModel.setText(model);
            tvStock.setText(String.valueOf(stock));
            color.setText(shoeColor);
            price.setText(String.valueOf(shoesPrice));
            
            tvModel.setEditable(false);
            tvStock.setEditable(false);
            color.setEditable(false);
        } else {
            
            tvModel.setText("");
            tvStock.setText("");
            color.setText("");
        }
   }
        
        public void update(JTextField identification,JTextField sell,JTextField inStock,JTextField tvModel,JTextField color){
        MongoDBConection mdc = new MongoDBConection();
        frmShoesInventory fts = new frmShoesInventory();
        mdc.connection("Shoes");    
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
                color.setText("");
            } else {
                JOptionPane.showMessageDialog(fts, "No hay suficiente stock para realizar la venta");
            }
        }
    }
    }
   
    
    
    
   
  


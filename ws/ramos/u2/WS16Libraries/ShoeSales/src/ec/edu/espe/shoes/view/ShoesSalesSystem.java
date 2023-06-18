
package ec.edu.espe.shoes.view;
import ec.edu.espe.shoes.model.PairOfShoes;
import ec.edu.espe.tax.SalesTax;

/**
 *
 * @author Your Name <your.name at your.org>
 */
public class ShoesSalesSystem {
    public static void main(String[] args){
        PairOfShoes pairOfShoes;
        
        float price; 
        price = 20.0F;
        float ivaPercentage = 12.0F;
        float totalPrice;
        totalPrice = SalesTax.computeIva(price, ivaPercentage);
        
        System.out.println("Javier Ramos Shoes Maker");
       
        pairOfShoes = new PairOfShoes(1,"Venus", "Escolar", price,totalPrice );
        System.out.println("pair of shoes --> "+ pairOfShoes);
        
        pairOfShoes = new PairOfShoes(1,"Venus", "Escolar", 20.0F,22.40F );
        System.out.println("pair of shoes --> "+ pairOfShoes);
        price =10.0F;
        pairOfShoes = new PairOfShoes(1,"Buestan", "Casual", price);
        System.out.println("pair of shoes --> "+ pairOfShoes);    
    }
    
}

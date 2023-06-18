
package ec.edu.espe.view;

import ec.edu.espe.model.PairOfShoes;
import com.ooperationgosling.tax.SalesTax;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */

public class ShoesSalesSystem {
      public static void main(String[] args){
          PairOfShoes pairOfShoes;
          float price;
          float ivaPercentage;
          ivaPercentage=12.0F;
          price = 20.37F;
          float totalPrice;
          totalPrice = SalesTax.compute(price, ivaPercentage);
          
          pairOfShoes = new PairOfShoes(1,"Venus","Escolar",price,totalPrice);
          System.out.println("Pair of shoes --->: "+ pairOfShoes);
          
          pairOfShoes = new PairOfShoes(1,"Venus","escolar",20.0F,0);
          System.out.println("Pair of shoes --->: "+ pairOfShoes);
          
          price=10.0F;
          pairOfShoes = new PairOfShoes(1,"Buestan","casual",price,totalPrice);
          System.out.println("Pair of shoes --->: "+ pairOfShoes);
      }
}

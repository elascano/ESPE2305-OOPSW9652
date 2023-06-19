
package ec.edu.espe.candystore.model.Menu;

import java.util.Scanner;

/**
 *
 * @author Your Name <your.name at your.org>
 */
public class Menu {
    int resultado;
    public int printMenu(){
        Scanner readResultado = new Scanner ( System.in);
        System.out.println("--- Javir Candy Store---");
        System.out.println("1. View products\n ");
        System.out.println("2. Impuesto tax\n");
        System.out.println("3. Exit\n");
        resultado = readResultado.nextInt();
        return resultado;
    
    }
    
}

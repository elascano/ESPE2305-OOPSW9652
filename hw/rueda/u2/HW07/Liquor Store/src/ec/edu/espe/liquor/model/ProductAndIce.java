package ec.edu.espe.liquor.model;

import ec.edu.espe.tax.SalesTax;
import java.util.Scanner;

/**
 *
 * @author Juan Rueda, The Encoders, DCCO-ESPE
 */
public class ProductAndIce {
    public static void IceData() {
        float icePercentage = 16.0F;
        int totalOfProducts;
        float total;
        float taxes;
        float totalAndIce;
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the name of the product: ");
        String productName = scanner.nextLine();
        System.out.println("Enter the price per unit: ");
        float pricePerUnit = scanner.nextFloat();
        System.out.println("How many packages do you have of the product?: ");
        int numberOfPackages = scanner.nextInt();
        System.out.println("How many boxes do you have per package?: ");
        int boxesPerPackage = scanner.nextInt();
        System.out.println("How many units come per box?: ");
        int unitsPerBox = scanner.nextInt();

        totalOfProducts = (unitsPerBox * boxesPerPackage)* numberOfPackages;
        total = pricePerUnit * totalOfProducts;
        
        taxes = SalesTax.computeIce(icePercentage, pricePerUnit, numberOfPackages, boxesPerPackage, unitsPerBox);
        totalAndIce = total + taxes;
        Product product = new Product(productName, pricePerUnit, numberOfPackages, boxesPerPackage, unitsPerBox, taxes, totalAndIce);
        System.out.println("Product ---> " + product.toString());
    }
}

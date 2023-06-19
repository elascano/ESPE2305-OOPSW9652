package ec.edu.espe.taxsystem.model;

import com.bugbusters.tax.SalesTax;

import java.util.Scanner;

/**
 * Created by Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class ProductSalesSystem {
    
    public static void getIceData() {
        float icePercentage = 16.0F;
        int totalOfProducts;
        float total;
        float iceProduced;
        float totalAndIce;
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the name of the product you want to calculate the ICE: ");
        String productName = scanner.nextLine();
        System.out.println("Enter the price per unit of the product: ");
        float pricePerUnit = scanner.nextFloat();
        System.out.println("How many packages are you importing?: ");
        int numberOfPackages = scanner.nextInt();
        System.out.println("How many boxes are per package?: ");
        int boxesPerPackage = scanner.nextInt();
        System.out.println("How many units of the product are per box?: ");
        int unitsPerBox = scanner.nextInt();

        totalOfProducts = (unitsPerBox * boxesPerPackage)* numberOfPackages;
        total = pricePerUnit * totalOfProducts;
        
        iceProduced = SalesTax.computeIce(icePercentage, pricePerUnit, numberOfPackages, boxesPerPackage, unitsPerBox);
        totalAndIce = total + iceProduced;
        Product product = new Product(1, productName, pricePerUnit, numberOfPackages, boxesPerPackage, unitsPerBox, iceProduced, totalAndIce);
        System.out.println("Product ---> " + product.toString());
    }
}

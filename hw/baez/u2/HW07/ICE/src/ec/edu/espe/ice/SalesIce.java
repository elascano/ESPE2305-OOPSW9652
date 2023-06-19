package ec.edu.espe.ice;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class SalesIce {
    public static void main(String[] args) {
        double basePrice = 100.0;
        double taxRate = 0.12;
        
        double iceAmount = calculateICE(basePrice, taxRate);
        double totalPrice = basePrice + iceAmount;
        
        System.out.println("Base Price: $" + basePrice);
        System.out.println("ICE Amount: $" + iceAmount);
        System.out.println("Total Price: $" + totalPrice);
    }
    
    public static double calculateICE(double basePrice, double taxRate) {
        return basePrice * taxRate;
    }
}



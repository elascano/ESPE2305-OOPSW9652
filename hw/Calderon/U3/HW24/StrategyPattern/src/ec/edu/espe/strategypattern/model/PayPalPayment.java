
package ec.edu.espe.strategypattern.model;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class PayPalPayment implements PaymentStrategy{
    
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(float amount) {
        System.out.println("Paid $" + amount + " via PayPal to " + email);
    }
    
    public String getEmail() {
        return email;
    }
    
}

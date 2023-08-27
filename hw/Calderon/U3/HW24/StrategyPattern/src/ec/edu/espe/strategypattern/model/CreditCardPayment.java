package ec.edu.espe.strategypattern.model;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class CreditCardPayment implements PaymentStrategy {

    private String cardNumber;


    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;

    }

    @Override
    public void pay(float amount) {
        System.out.println("Paid $" + amount + " with credit card " + cardNumber);
    }

    public String getCardNumber() {
        return cardNumber;
    }

}

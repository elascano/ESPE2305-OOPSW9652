package ec.edu.espe.incometax;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class PayIncome {

    public static void main(String[] args) {
        double taxableIncome = 11310.0;
        
        double incomeTax = calculateIncomeTax(taxableIncome);
        
        System.out.println("Taxable Income: $" + taxableIncome);
        System.out.println("Income Tax: $" + incomeTax);
    }
    
    public static double calculateIncomeTax(double taxableIncome) {
        double incomeTax = 0.0;
        
        if (taxableIncome <= 11310.0) {
            incomeTax = 0.0;
        } else if (taxableIncome <= 14410.0) {
            incomeTax = taxableIncome * 0.05 - 556.0;
        } else if (taxableIncome <= 18010.0) {
            incomeTax = taxableIncome * 0.10 - 947.0;
        } else if (taxableIncome <= 21630.0) {
            incomeTax = taxableIncome * 0.12 - 1204.0;
        } else if (taxableIncome <= 31630.0) {
            incomeTax = taxableIncome * 0.15 - 2394.0;
        } else if (taxableIncome <= 41630.0) {
            incomeTax = taxableIncome * 0.20 - 4428.0;
        } else if (taxableIncome <= 51630.0) {
            incomeTax = taxableIncome * 0.25 - 7410.0;
        } else if (taxableIncome <= 61630.0) {
            incomeTax = taxableIncome * 0.30 - 10367.0;
        } else if (taxableIncome <= 100000.0){
            incomeTax = taxableIncome * 0.35 - 13457.0;
        }
        
        return incomeTax;
    }
}
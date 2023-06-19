package com.bugbusters.tax;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class SalesTax {
    public static float computeIva(float total, float ivaPercentage) {
        float totalAndIva;
        totalAndIva = (total + (total * (ivaPercentage/100)));
        return totalAndIva;
    }
    
    public static float computeIce(float icePercentage, float pricePerUnit, int numberOfPackages, int boxesPerPackage, int unitsPerBox){
        int totalOfProducts;
        float iceProduced;
        float total;
        float totalAndIce;
        
        totalOfProducts = (unitsPerBox * boxesPerPackage)* numberOfPackages;
        iceProduced = totalOfProducts * (icePercentage/100);
        total = pricePerUnit * totalOfProducts;
        totalAndIce = total + iceProduced;
        
        return (iceProduced);
    }
    
    public static float computeIncomeTax(float salary){
        float annualSalary = (salary * 12);
        float incomeTax;
        
        if (annualSalary < 11722) {
            incomeTax = 0;
        } else if (annualSalary < 14935) {
            incomeTax = (14935 - annualSalary) * (5/100);
        } else if (annualSalary < 18666) {
            incomeTax = ((18666 - annualSalary) * (10/100)) + 161;
        } else if (annualSalary < 22418) {
            incomeTax = ((22418 - annualSalary) * (12/100)) + 534;
        } else if (annualSalary < 32783) {
            incomeTax = ((18666 - annualSalary) * (15/100)) + 984;
        } else if (annualSalary < 43147) {
            incomeTax = ((43147 - annualSalary) * (20/100)) + 2539;
        } else if (annualSalary < 53512) {
            incomeTax = ((53512 - annualSalary) * (25/100)) + 4612;
        } else if (annualSalary < 63876) {
            incomeTax = ((63876 - annualSalary) * (30/100)) + 7203;
        } else if (annualSalary < 103644) {
            incomeTax = ((103644 - annualSalary) * (35/100)) + 10312;
        } else {
            incomeTax = ((100000 - annualSalary) * (37/100)) + 24231;
        }
          
        return incomeTax;
    }
}


package com.opertaiongosling.tax;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class SalesTax {
    public static float computeIva(float total, float ivaPercentage){
        float totalAndIva;
        totalAndIva = total + total * ivaPercentage/100;
        return totalAndIva;
    }
    public static float computeIr(float income) {
        float totalTax;
        if (income <= 11722) {
            totalTax = 0.0F;
        } else if (income <= 14935) {
            totalTax = (income - 11722) * 0.05F;
        } else if (income <= 18666) {
            totalTax = (income - 14935) * 0.10F + 161;
        } else if (income <= 22418) {
            totalTax = (income - 18666) * 0.12F + 534;
        } else if (income <= 32783) {
            totalTax = (income - 22418) * 0.15F + 984;
        } else if (income <= 43147) {
            totalTax = (income - 32783) * 0.20F + 2539;
        } else if (income <= 53512) {
            totalTax = (income - 43147) * 0.25F + 4612;
        } else if (income <= 63876) {
            totalTax = (income - 53412) * 0.30F + 7203;
        } else if (income <= 103644) {
            totalTax = (income - 63512) * 0.35F + 10312;
        } else {
            totalTax = (income - 103644) * 0.37F + 24231;
        }
        return totalTax;
    }
    public static double calculateIceCigarette(int numPackages, int packsPerPackage, int cigarettesPerPack) {
        int totalCigarettes = numPackages * packsPerPackage * cigarettesPerPack;
        double iceTax = totalCigarettes * 0.16;
        
        return iceTax;
    }
}

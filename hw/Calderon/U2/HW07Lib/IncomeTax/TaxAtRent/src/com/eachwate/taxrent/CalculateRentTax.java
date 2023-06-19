
package com.eachwate.taxrent;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class CalculateRentTax {

    public static float computeIncomeTax(float income) {

        float anualSalary;
        float excess = 0.00F;
        float surplusFractionTax = 0.00F;
        float surplusPercentage=0.00F;
        float basicFractionTax = 0.00F;
        float totalIncome = 0.00F;

        anualSalary = income * 12;
        
        if (anualSalary >= 0 && anualSalary < 11722) {
            excess = 11722.00F;
            basicFractionTax = 0.00F;
            surplusFractionTax = 0.00F;
            totalIncome = basicFractionTax + surplusPercentage;
            
        }else if (anualSalary >= 11722 && anualSalary < 14935) {
            excess = 14935.00F;
            basicFractionTax = 0.00F;
            surplusFractionTax = 0.05F;
            surplusPercentage= (excess-anualSalary)*surplusFractionTax;
            totalIncome = basicFractionTax + surplusPercentage;
            
        }else if (anualSalary >= 14936 && anualSalary < 18666) {
            excess = 18666.00F;
            basicFractionTax = 161.00F;
            surplusFractionTax = 0.10F;
            surplusPercentage= (excess-anualSalary)*surplusFractionTax;
            totalIncome = basicFractionTax + surplusPercentage;
            
        }else if (anualSalary >= 18667 && anualSalary < 22418) {
            excess = 22418.00F;
            basicFractionTax = 534.00F;
            surplusFractionTax = 0.12F;
            surplusPercentage= (excess-anualSalary)*surplusFractionTax;
            totalIncome = basicFractionTax + surplusPercentage;
            
        }else if (anualSalary >= 22419 && anualSalary < 32783) {
            excess = 32783.00F;
            basicFractionTax = 984.00F;
            surplusFractionTax = 0.15F;
            surplusPercentage= (excess-anualSalary)*surplusFractionTax;
            totalIncome = basicFractionTax + surplusPercentage;
            
        }else if (anualSalary >= 32784 && anualSalary < 43147) {
            excess = 43147.00F;
            basicFractionTax = 2539.00F;
            surplusFractionTax = 0.20F;
            surplusPercentage= (excess-anualSalary)*surplusFractionTax;
            totalIncome = basicFractionTax + surplusPercentage;
            
        }else if (anualSalary >=43148 && anualSalary < 53512) {
            excess = 53512.00F;
            basicFractionTax = 4612.00F;
            surplusFractionTax = 0.25F;
            surplusPercentage= (excess-anualSalary)*surplusFractionTax;
            totalIncome = basicFractionTax + surplusPercentage;
            
        }else if (anualSalary >= 53513 && anualSalary < 63876) {
            excess = 63876.00F;
            basicFractionTax = 7203.00F;
            surplusFractionTax = 0.30F;
            surplusPercentage= (excess-anualSalary)*surplusFractionTax;
            totalIncome = basicFractionTax + surplusPercentage;
            
        }else if (anualSalary >= 63877 && anualSalary < 103644) {
            excess = 103644.00F;
            basicFractionTax = 10312.00F;
            surplusFractionTax = 0.35F;
            surplusPercentage= (excess-anualSalary)*surplusFractionTax;
            totalIncome = basicFractionTax + surplusPercentage;
            
        }else if (anualSalary >= 103644) {

            basicFractionTax = 24231.00F;
            surplusFractionTax = 0.37F;
            surplusPercentage = anualSalary * surplusFractionTax;
            totalIncome = basicFractionTax + surplusPercentage;

        }
        return totalIncome;
    }
  
}

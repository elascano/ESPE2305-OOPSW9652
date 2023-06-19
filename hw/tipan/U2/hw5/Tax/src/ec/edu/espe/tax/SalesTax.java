/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.tax;

/**
 *
 * @author Oswaldo Tipan
 */
public class SalesTax {
    
    public static float computeIva(float total, float ivaPercentage){
        float totalAndIva;
        totalAndIva = total + total * ivaPercentage/100;
        return totalAndIva;
    }
    
    public static float computerIce(float specificRate, float total, float icePercentage){
        
        float totalAndIce = specificRate + total + total * icePercentage;
        return totalAndIce; 
    }
    
    public static float computeIncomeTax(float monthlySalary){
        
        float anualSalary = monthlySalary * 12;
        float incomeTax = 0;
        
        if(anualSalary > 0 && anualSalary < 11722 ){
            incomeTax = monthlySalary;
        }else if(anualSalary > 11722 && anualSalary< 14935){
            incomeTax = monthlySalary - ( (14935 - anualSalary) * 0.05F)/12;
        }else if(anualSalary > 14935 && anualSalary < 18666){
            incomeTax = monthlySalary - (161 + (18666 - anualSalary) * 0.1F)/12;
        }else if(anualSalary > 18666 && anualSalary < 22438){
            incomeTax = monthlySalary - (534 + (22438 - anualSalary) * 0.12F)/12;
        }else if(anualSalary > 22438 && anualSalary < 32783){
            incomeTax = monthlySalary - (984 + (32783 - anualSalary) * 0.15F)/12;
        }else if(anualSalary > 32783 && anualSalary < 43147){
            incomeTax = monthlySalary - (2539 + (43147 -anualSalary) * 0.2F)/12;
        }else if(anualSalary > 43147 && anualSalary < 53512){
            incomeTax = monthlySalary - (4612 +(53512 - anualSalary) * 0.25F)/12;
        }else if(anualSalary > 53512 && anualSalary < 63876){
            incomeTax = monthlySalary - (7203 +(63876 - anualSalary) * 0.3F)/12;
        }else if(anualSalary > 63876 && anualSalary < 103644){
            incomeTax = monthlySalary - (10312+(103644- anualSalary) * 0.35F)/12;
        }else if(anualSalary > 103644){
            incomeTax = monthlySalary - (24231 +(anualSalary - 103644) * 0.37F)/12;
        }   
        return incomeTax;
    }
}

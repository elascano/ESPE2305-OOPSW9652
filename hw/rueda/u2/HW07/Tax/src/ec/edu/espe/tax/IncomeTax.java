
package ec.edu.espe.tax;

/**
 *
 * @author Juan Rueda, The Encoders, DCCO-ESPE
 */
public class IncomeTax {
            public static double computeIncome (double monthlyIncome) {
        double annualIncome = 0;
        double income=0;
        double spare=0;
        
        annualIncome = monthlyIncome*12;
        
        if(annualIncome >= 0 && annualIncome<=11722){
            income = 0;
        }
        else if (annualIncome > 11722 && annualIncome<= 14935){
            spare = 14935 - annualIncome;
            income = (spare * 5) /100;
            income = (income + 0) /12;    
        }
        else if (annualIncome > 14935 && annualIncome<= 18666){
            spare = 18666 - annualIncome;
            income = (spare * 10) /100;
            income = (income + 161) /12;    
        }
        else if (annualIncome > 18666 && annualIncome<= 22418){
            spare = 22418 - annualIncome;
            income = (spare * 12) /100;
            income = (income + 534) /12;    
        }
        else if (annualIncome > 22418 && annualIncome<= 32783){
            spare = 32783 - annualIncome;
            income = (spare * 15) /100;
            income = (income + 984) /12;    
        }
        else if (annualIncome > 32783 && annualIncome<= 43147){
            spare = 43147 - annualIncome;
            income = (spare * 20) /100;
            income = (income + 2539) /12;    
        }
        else if (annualIncome > 43147 && annualIncome<= 53512){
            spare = 53512 - annualIncome;
            income = (spare * 25) /100;
            income = (income + 4612) /12;    
        }
        else if (annualIncome > 53512 && annualIncome<= 63876){
            spare = 63876 - annualIncome;
            income = (spare * 30) /100;
            income = (income + 7203) /12;    
        }
        else if (annualIncome > 63876 && annualIncome<= 103644){
            spare = 103644 - annualIncome;
            income = (spare * 35) /100;
            income = (income + 10312) /12;    
        }
        else if (annualIncome > 103644){
            spare = 103644 - annualIncome;
            income = (spare * 37) /100;
            income = (income + 24231) /12;    
        }
        return income;
    } 
}

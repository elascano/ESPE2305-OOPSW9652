package ec.edu.espe.shoes.model;

import java.util.Scanner;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class DataTax {
    float income;
    int numPackage;
    int packsPerPackage;
    int cigarettesPerPack;
        public static float getValueIr(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your anual salary: ");
        float income = scanner.nextFloat();
        return income;
    }
        
    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    public int getNumPackage() {
        return numPackage;
    }

    public void setNumPackage(int numPackage) {
        this.numPackage = numPackage;
    }

    public int getPacksPerPackage() {
        return packsPerPackage;
    }

    public void setPacksPerPackage(int packsPerPackage) {
        this.packsPerPackage = packsPerPackage;
    }

    public int getCigarettesPerPack() {
        return cigarettesPerPack;
    }

    public void setCigarettesPerPack(int cigarettesPerPack) {
        this.cigarettesPerPack = cigarettesPerPack;
    }
    
        
    
}

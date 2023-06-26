package edu.ec.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class Cow extends FarmAnimal implements IMammal {
    private boolean isProducingMilk;
    private int isMilk;
    private String leatherStatus;

    public Cow(boolean isProducingMilk, int isMilk, String leatherStatus, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
        this.isMilk = isMilk;
        this.leatherStatus = leatherStatus;
    }

    @Override
    public String toString() {
        return "Cow{"+ super.toString() + "isProducingMilk=" + isProducingMilk + ", isMilk=" + isMilk + ", leatherForClotes=" + leatherStatus + '}';
    }
    
    

    public void getLeatherForClotes(){
        boolean isDead = true;
        
        if(isDead){
            setLeatherStatus("Is producing Leather");
            System.out.println(getLeatherStatus());
        }
        else{
            setLeatherStatus("Is not producing Leather");
            System.out.println(getLeatherStatus());
        }
    }

    /**
     * @return the isProducingMilk
     */
    public boolean isIsProducingMilk() {
        return isProducingMilk;
    }

    /**
     * @param isProducingMilk the isProducingMilk to set
     */
    public void setIsProducingMilk(boolean isProducingMilk) {
        this.isProducingMilk = isProducingMilk;
    }

    /**
     * @return the isMilk
     */
    public int getIsMilk() {
        return isMilk;
    }

    /**
     * @param isMilk the isMilk to set
     */
    public void setIsMilk(int isMilk) {
        this.isMilk = isMilk;
    }

    @Override
    public boolean feed(Food food) {
       return true;
    }

    @Override
    public int produce() {
        return 9;
    }

    @Override
    public void getMilk() {
        setIsMilk(getIsMilk() + 1);
    }

    /**
     * @return the leatherStatus
     */
    public String getLeatherStatus() {
        return leatherStatus;
    }

    /**
     * @param leatherStatus the leatherStatus to set
     */
    public void setLeatherStatus(String leatherStatus) {
        this.leatherStatus = leatherStatus;
    }


}

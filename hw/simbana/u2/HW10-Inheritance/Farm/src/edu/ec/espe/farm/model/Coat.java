/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ec.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class Coat extends FarmAnimal implements IMammal {
    private boolean isProducingMilk;
    private int isMilk;

    public Coat(boolean isProducingMilk, int isMilk, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
        this.isMilk = isMilk;
    }

    @Override
    public String toString() {
        return "Coat{" + super.toString() + "isProducingMilk=" + isProducingMilk + ", isMilk=" + isMilk + '}';
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
        return 0;
    }

    @Override
    public void getMilk() {
    isMilk = isMilk + 1;
    }
    
}

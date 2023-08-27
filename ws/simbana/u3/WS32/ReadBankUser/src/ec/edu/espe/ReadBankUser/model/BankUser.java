/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ReadBankUser.model;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class BankUser {
    private int id;
    private String name;
    private int age;
    private double moneyInTheBank;

    public BankUser(int id, String name, int age, double moneyInTheBank) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.moneyInTheBank = moneyInTheBank;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the moneyInTheBank
     */
    public double getMoneyInTheBank() {
        return moneyInTheBank;
    }

    /**
     * @param moneyInTheBank the moneyInTheBank to set
     */
    public void setMoneyInTheBank(double moneyInTheBank) {
        this.moneyInTheBank = moneyInTheBank;
    }
    
    
}

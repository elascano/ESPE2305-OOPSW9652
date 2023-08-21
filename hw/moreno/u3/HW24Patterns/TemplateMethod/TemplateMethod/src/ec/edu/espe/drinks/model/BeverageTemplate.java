/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.drinks.model;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public abstract class BeverageTemplate {

    public void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public abstract void boilWater();

    public abstract void brew();

    public abstract void pourInCup();

    public abstract void addCondiments();
}

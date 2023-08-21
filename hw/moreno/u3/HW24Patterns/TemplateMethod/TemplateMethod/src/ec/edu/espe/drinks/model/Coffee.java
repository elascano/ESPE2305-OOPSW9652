/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.drinks.model;

/**
 * @author Moreno Paul,The encoders; DCCO-ESPE
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class Coffee extends BeverageTemplate {

    @Override
    public void boilWater() {
        System.out.println("Boiling water");
    }

    @Override
    public void brew() {
        System.out.println("Brewing coffee");
    }

    @Override
    public void pourInCup() {
        System.out.println("Pouring coffee into cup");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}

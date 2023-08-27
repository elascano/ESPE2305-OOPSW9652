/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.templatemethod.view;

import ec.edu.espe.templatemethod.controller.Coffee;
import ec.edu.espe.templatemethod.controller.Tea;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class BeverageTest {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffe = new Coffee();
        System.out.println("\nMaking tea...");
        tea.prepareRecipe();
        
        System.out.println("\nMaking coffe...");
        coffe.prepareRecipe();
    }
}

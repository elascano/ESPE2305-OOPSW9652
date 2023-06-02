/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;

import es.edu.espe.chickenfarm.control.Chicken;
import java.util.Date;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        Chicken chicken;
        chicken=new Chicken();
        chicken.doStuff(0);
        
        chicken.setId(1);
        chicken.setName("Prisscy");
        chicken.setColor("Yellow");
        chicken.setAge(23);
        chicken.setIsMolting(true);
        chicken.setBornOnDate(new Date());
        
        System.out.println("my chicken is --->"+chicken);
    }
}
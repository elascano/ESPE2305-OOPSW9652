/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.wscodetodiagram.model;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class Tiger extends Mammal {
    private String foodType;
    
    public Tiger(String foodType){
        this.foodType = foodType;
    }
    
    @Override
    public void feed(){
        System.out.println("The Tigger eat "+ foodType);
    }
    
}

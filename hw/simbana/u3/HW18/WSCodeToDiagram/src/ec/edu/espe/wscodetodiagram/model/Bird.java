/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.wscodetodiagram.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public abstract class Bird extends Animal{
    private List<Tooth> tooth = new ArrayList<>();
    private Beak beak;
    
    @Override
    public void feed(){
        
    }
}

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
public class Pig extends FarmAnimal{

    public Pig(int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
    }

    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public int produce() {
        return 50;
    }
    
    
}

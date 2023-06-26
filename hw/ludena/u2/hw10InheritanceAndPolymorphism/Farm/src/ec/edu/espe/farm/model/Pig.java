/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Pig extends FarmAnimal{

    int weight;
    
    public Pig(int weight,int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nweight=" + weight + super.toString();
    }
    
    
    
    @Override
    public boolean feed(Food food) {
         return true;
    }

    @Override
    public int produce() {
        return 12;
    }

    public int produce(Sausage sausage){
        return sausage.getNumberSausage();
    }
    
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Date getBornOn() {
        return bornOn;
    }

    public void setBornOn(Date bornOn) {
        this.bornOn = bornOn;
    }
    
    
    
}

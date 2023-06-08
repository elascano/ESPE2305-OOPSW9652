/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class Egg {
    private int egg;
    
    @Override
    public String toString(){
        return "Egg{" + "egg=" + egg + '}';
    }
    
    public Egg(int id){
        this.egg = egg;
    }

    /**
     * @return the egg
     */
    public int getEgg() {
        return egg;
    }

    /**
     * @param egg the egg to set
     */
    public void setEgg(int egg) {
        this.egg = egg;
    }
}

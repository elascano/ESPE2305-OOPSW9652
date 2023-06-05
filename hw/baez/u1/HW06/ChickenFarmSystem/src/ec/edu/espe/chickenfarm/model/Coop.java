/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.model;
import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.ArrayList;
/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class Coop {
    private int id;
    private ArrayList<Chicken> chickens;

    @Override
    public String toString(){
        return "Coop{" + "id=" + id + ", chickens=" + chickens + '}';
    }
    
    public Coop(int id, ArrayList<Chicken> chickens){
        this.id = id;
        this.chickens = chickens;
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
     * @return the chickens
     */
    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    /**
     * @param chickens the chickens to set
     */
    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }
    
    
}

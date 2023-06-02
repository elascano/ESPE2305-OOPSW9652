/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Oswaldo Tipan
 */
public class Poop {
      private int id;

    @Override
    public String toString() {
        return "Poop{" + "id=" + id + '}';
    }

    public Poop(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

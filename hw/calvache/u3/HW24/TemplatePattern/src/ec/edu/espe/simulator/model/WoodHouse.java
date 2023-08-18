/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.simulator.model;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class WoodHouse extends Construction {

    @Override
    public void prepareFoundation() {
        System.out.println("Preparing wooden foundations.");
    }

    @Override
    public void buildStructure() {
        System.out.println("Building wooden structure.");
    }

    @Override
    public void addRoofs() {
        System.out.println("Adding wooden ceilings.");
    }

    @Override
    public void addWalls() {
        System.out.println("Adding wooden walls.");
    }

    @Override
    public void housePainting() {
        System.out.println("Painting the wooden house.");
    }

}

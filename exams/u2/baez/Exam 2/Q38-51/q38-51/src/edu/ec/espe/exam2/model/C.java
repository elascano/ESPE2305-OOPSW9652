/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ec.espe.exam2.model;

import java.util.ArrayList;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class C extends A {
    private ArrayList<E> e;    
    public C(){
    
    }

    public C(ArrayList<E> e) {
        this.e = e;
    }

    public C(ArrayList<E> e, A a) {
        super(a);
        this.e = e;
    }

    @Override
    public String toString() {
        return "C{" + "e=" + e + '}';
    }

    
    
    /**
     * @return the e
     */
    public ArrayList<E> getE() {
        return e;
    }

    /**
     * @param e the e to set
     */
    public void setE(ArrayList<E> e) {
        this.e = e;
    }
    
}

package edu.ec.espe.exam2.model;

import java.util.ArrayList;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class B extends A {
    private ArrayList<H> h;
    
    public B(){
    
    }

    /**
     * @return the h
     */
    public ArrayList<H> getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(ArrayList<H> h) {
        this.h = h;
    }

    public B(ArrayList<H> h) {
        this.h = h;
    }

    public B(ArrayList<H> h, A a) {
        super(a);
        this.h = h;
    }

    @Override
    public String toString() {
        return "B{" + "h=" + h + '}';
    }
    
}

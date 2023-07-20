
package ec.edu.espe.examp2.model;

import java.util.ArrayList;

/**
 *
 * @author Paul Moreno,The encoders DCCO-ESPE
 */
public abstract class A {
    private int slot;
    private ArrayList<A> al = new ArrayList<A>();

    public A(int id) {
        this.slot = id;
    }

    @Override
    public String toString() {
        return "A{" + "id=" + slot + ", al=" + al + '}';
    }

    
    /**
     * @return the slot
     */
    public int getId() {
        return slot;
    }

    /**
     * @param id the slot to set
     */
    public void setId(int id) {
        this.slot = id;
    }

    /**
     * @return the al
     */
    public ArrayList<A> getAl() {
        return al;
    }

    /**
     * @param al the al to set
     */
    public void setAl(ArrayList<A> al) {
        this.al = al;
    }
    
    
}

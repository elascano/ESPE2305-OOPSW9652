/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.examp2.model;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class C extends A{
    private String name;
    private String type;
    

    public C(String name, String type, int id) {
        super(id);
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "C{" +super.toString()+ "name=" + name + ", type=" + type + '}';
    }

    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
}

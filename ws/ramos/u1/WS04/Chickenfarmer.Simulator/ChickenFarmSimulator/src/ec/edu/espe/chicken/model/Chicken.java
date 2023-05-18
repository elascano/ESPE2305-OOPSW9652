package ec.edu.espe.chicken.model;

import java.util.Date;

/**
 *
 * @author JAVIER
 */
public class Chicken {
    
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMulting;
    private Date bornOnDate;
    
    public void doStuff(int forTime){
        cluck ();
        eat();
        poop();
        layAnEgg();
    }
    
    private void cluck(){
        System.out.println("the chicken is clucking");
        
    }
    private void wander(){
        System.out.println("the chicken is wandering");
    }
    private void eat(){
        System.out.println("the chicken is eating");
    }
    private void drink(){
        System.out.println("the chicken is drinking");
    }
    private Poop poop(){
        System.out.println("the chicken is pooping");
        return new Poop();
    }
    private Egg layAnEgg(){
        System.out.println("the chicken is clwandering");
        return new Egg();
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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the isMulting
     */
    public boolean isIsMulting() {
        return isMulting;
    }

    /**
     * @param isMulting the isMulting to set
     */
    public void setIsMulting(boolean isMulting) {
        this.isMulting = isMulting;
    }

    /**
     * @return the bornOnDate
     */
    public Date getBornOnDate() {
        return bornOnDate;
    }

    /**
     * @param bornOnDate the bornOnDate to set
     */
    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
    }
}

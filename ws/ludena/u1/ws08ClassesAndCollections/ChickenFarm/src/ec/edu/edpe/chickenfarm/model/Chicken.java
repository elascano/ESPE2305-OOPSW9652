
package ec.edu.edpe.chickenfarm.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Edison Ludeña, BugBuster, DCCO-ESPE
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    private LocalDate bornDate;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + getId() + ", name=" + getName() + ", color=" + getColor() +
                ", age=" + getAge() + ", isMolting=" + isIsMolting() + ", bornOnDate=" + getBornDate() + '}';
    }

    
    public Chicken(int id, String name, String color, boolean isMolting, LocalDate bornDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.isMolting = isMolting;
        this.bornDate = bornDate;
        //TODO code, compute age in years using the bornOnDate
        this.age = computeAge(bornDate);
        //These methods are deprecated
    }

    public int computeAge(LocalDate bornOnDate){
        LocalDate DateNow = LocalDate.now();
        Period period = Period.between(getBornDate(),DateNow);
        return period.getYears();
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
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    /**
     * @return the bornDate
     */
    public LocalDate getBornDate() {
        return bornDate;
    }

    /**
     * @param bornDate the bornDate to set
     */
    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }
    
    

    
    
    
    
    
}

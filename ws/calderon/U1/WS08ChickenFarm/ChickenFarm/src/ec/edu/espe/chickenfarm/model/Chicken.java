
package ec.edu.espe.chickenfarm.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class Chicken {
    
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    private LocalDate bornOnDate;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + 
                ", isMolting=" + isMolting + ", bornOnDate=" + bornOnDate + '}';
    }
    

    public Chicken(int id, String name, String color, boolean isMolting, LocalDate bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.isMolting = isMolting;
        this.bornOnDate = bornOnDate;
        //Todo call method that compute age
        this.age = calculateYear(bornOnDate);
        //these metods are desprecated
    }
    
    public static int calculateYear(LocalDate bornOnDate){
    //Todo code, compute age in years using the bornOnDate
        LocalDate actualDate = LocalDate.now();
        Period periodo;
        periodo = Period.between(bornOnDate, actualDate);
        return periodo.getYears();
        //return new Date();
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
     * @return the bornOnDate
     */
    public LocalDate getBornOnDate() {
        return bornOnDate;
    }

    /**
     * @param bornOnDate the bornOnDate to set
     */
    public void setBornOnDate(LocalDate bornOnDate) {
        this.bornOnDate = bornOnDate;
    }
    
    
    
    
    
}

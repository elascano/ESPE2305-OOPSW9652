
package ec.edu.espe.chickenfarm3.model;

import java.util.Date;

/**
 *
 * @author PabloEZurita
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    private Date bornOnDate;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name +
                ", Color=" + color + ", age=" + age + 
                ", isMoling=" + isMolting + 
                ", bornOnDate=" + bornOnDate + '}';
    }
    public Chicken(int id, String name, String color, boolean isMolting, Date bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.isMolting = isMolting;
        this.bornOnDate = bornOnDate;
        this.age = computeAge(bornOnDate);  // Assign the computed age directly
    }

    public int computeAge(Date bornOnDate) {
        Date now = new Date();
        int year = now.getYear() - bornOnDate.getYear();
        return year;
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
     * @return the Color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.color = Color;
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
     * @return the isMoling
     */
    public boolean isIsMoling() {
        return isMolting;
    }

    /**
     * @param isMoling the isMoling to set
     */
    public void setIsMoling(boolean isMoling) {
        this.isMolting = isMoling;
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

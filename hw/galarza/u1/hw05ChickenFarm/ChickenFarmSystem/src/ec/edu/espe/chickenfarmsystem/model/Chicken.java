package ec.edu.espe.chickenfarmsystem.model;

import java.util.Date;

/**
 *
 * @author Cesar Galarza, BugBusters, DCCO-ESPE
 */
public class Chicken {
    private int id;
    private String name;
    private String Color;
    private int age;
    private boolean isMoling;
    private Date bornOnDate;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name +
                ", Color=" + Color + ", age=" + age + 
                ", isMoling=" + isMoling + 
                ", bornOnDate=" + bornOnDate + '}';
    }
    public Chicken(int id, String name, String Color, boolean isMoling, Date bornOnDate) {
        this.id = id;
        this.name = name;
        this.Color = Color;
        this.isMoling = isMoling;
        this.bornOnDate = bornOnDate;
        
        //TODO code, compute age in years using the bornOnDate
        this.age = computeAge();
    
    }

    public int computeAge(){
        //TODO code compute age in years using bornDate
        this.bornOnDate.setYear(this.bornOnDate.getYear()-1900);
        int chickenAge = new Date().getYear()-this.bornOnDate.getYear();
        return chickenAge;
        
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
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
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
        return isMoling;
    }

    /**
     * @param isMoling the isMoling to set
     */
    public void setIsMoling(boolean isMoling) {
        this.isMoling = isMoling;
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

package ec.edu.espe.chickenfarm.model;

import java.util.Date;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class Chicken {
    private int id;
    private String name;
    private int age;
    private boolean isMolting;
    private Date bornOnDate;
    private String color;

    @Override
    public String toString(){
        return "Chicken{" + "id=" + getId() + ", name" + getName() + ", color=" + getColor() + ", age=" + getAge() + ", isMolting=" + isIsMolting() + ", bornOnDate=" + getBornOnDate() + '}';
    }
    
    
    
    public Chicken(int id, String name, String color, boolean isMolting, Date bornOnDate){
        this.id = id;
        this.name = name;
        this.color = color;
        this.isMolting = isMolting;
        this.bornOnDate = bornOnDate;
        
        //TODO code, compute age in years using the bornOnDATE
        this.age = computeAge(bornOnDate).getYear();
        
        
    }
    
    public Date computeAge(Date bornOnDate){
        Date now = new Date();
            int year = now.getYear() - bornOnDate.getYear();
            int month = now.getMonth() - bornOnDate.getMonth();
            int day = now.getDay() - bornOnDate.getDate();
            Date age = new Date(year, month, day);
            return age;
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
    public Date getBornOnDate() {
        return bornOnDate;
    }

    /**
     * @param bornOnDate the bornOnDate to set
     */
    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
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
    
    
}

    
    


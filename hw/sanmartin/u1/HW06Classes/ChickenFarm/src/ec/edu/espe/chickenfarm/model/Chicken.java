
package ec.edu.espe.chickenfarm.model;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    private Date bornDate;


    public Chicken(int id, String name, String color, boolean isMolting, Date bornDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.isMolting = isMolting;
        bornDate.setYear(bornDate.getYear()-1900);
        this.bornDate = bornDate;
        this.age=computeAge().getYear();
    }
    
    private Date computeAge(){
        // TODO code, compute agein years using the bornOnDate
        long timeDiff = new Date().getTime() - bornDate.getTime();
        Date ageDate = new Date();
        ageDate.setTime(timeDiff);
        ageDate.setYear(ageDate.getYear()-70);
        return ageDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsMolting() {
        return isMolting;
    }

    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    public Date getBornOnDate() {
        return bornDate;
    }

    public void setBornOnDate(Date bornOnDate) {
        this.bornDate = bornOnDate;
    } 
    
}

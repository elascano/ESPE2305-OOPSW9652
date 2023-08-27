
package ec.edu.espe.zoo.controller;

import ec.edu.espe.zoo.model.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public abstract class Animal {
   public Date bornOn;
   private Claw[] claw;

    public Animal(Date bornOn, Claw[] claw) {
        this.bornOn = bornOn;
        this.claw = claw;
    }

    @Override
    public String toString() {
        return "Animal{" + "bornOn=" + bornOn + ", claw=" + claw + '}';
    }
   
   
   
   public void getAge(){
        LocalDate birthDate = bornOn.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate currentDate = LocalDate.now();
        Period agePeriod = Period.between(birthDate, currentDate);
        int age = agePeriod.getYears();
        if ((currentDate.getMonthValue() < birthDate.getMonthValue()) ||
            (currentDate.getMonthValue() == birthDate.getMonthValue() && currentDate.getDayOfMonth() < birthDate.getDayOfMonth())) {
            age--;
        }

        System.out.println("The age of the animal is : " + age + " years.");
        
   }

   public abstract void feed();
   
   public abstract void born();   

    public Date getBornOn() {
        return bornOn;
    }

    public void setBornOn(Date bornOn) {
        this.bornOn = bornOn;
    }

    public Claw[] getClaw() {
        return claw;
    }

    public void setClaw(Claw[] claw) {
        this.claw = claw;
    }

}

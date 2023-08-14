
package espe.edu.ec.testanimal.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public abstract class Animal {
    private Date bornOnDate;
    private Claw[] claws = new Claw[20];
    
    public int getAge(LocalDate bornDate){
        LocalDate actualDate = LocalDate.now();
        Period periodo = Period.between(bornDate, actualDate);
        return periodo.getYears();
    }
    public abstract void feed(String typeOfFood);
    
    public abstract void born();

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

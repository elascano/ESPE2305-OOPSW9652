
package ec.edu.espe.PeriodMcu.model;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class Dato {
    
    private double period;
    private double frequency;
    
    public Dato(double period,double frequency){
        this.period =period;
        this.frequency = frequency;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Dato{" + "period=" + period + ", frequency=" + frequency + '}';
    }
    
    public String toCSV(){
        return this.frequency+","+this.period;
    }

    /**
     * @return the period
     */
    public double getPeriod() {
        return period;
    }

    /**
     * @param period the period to set
     */
    public void setPeriod(double period) {
        this.period = period;
    }

    /**
     * @return the frequency
     */
    public double getFrequency() {
        return frequency;
    }

    /**
     * @param frequency the frequency to set
     */
    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    
}

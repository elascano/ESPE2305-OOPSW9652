
package ec.edu.espe.strategy.model;

import ec.edu.espe.strategy.controller.Calculate;

/**
 *
 * @author LENOVO
 */
public class Calculator {

    private Calculate calculate;

    public void setStrategy(Calculate calculate) {
        this.calculate= calculate;
    }

    public double executeStrategy(double a, double b) {
        return calculate.calculate(a, b);
    }
}

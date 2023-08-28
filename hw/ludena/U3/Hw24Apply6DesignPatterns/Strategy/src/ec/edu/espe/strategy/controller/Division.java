package ec.edu.espe.strategy.controller;

/**
 *
 * @author LENOVO
 */
public class Division implements Calculate {

    @Override
    public double calculate(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
}

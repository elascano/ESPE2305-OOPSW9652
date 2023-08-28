package ec.edu.espe.strategy.controller;

/**
 *
 * @author LENOVO
 */
public class Subtraction implements Calculate {

    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}


package ec.edu.espe.strategypattern.controller;

import ec.edu.espe.strategypattern.model.Area;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class AreaCircle implements Area{

    private final float radio;

    public AreaCircle(float radio) {
        this.radio = radio;
    }
    
    @Override
    public float computeArea() {
        return (float) (Math.PI*Math.pow(radio,2));
    }

    @Override
    public String getAnswer() {
        return "El area del circulo es "+ computeArea();
    }
    
}

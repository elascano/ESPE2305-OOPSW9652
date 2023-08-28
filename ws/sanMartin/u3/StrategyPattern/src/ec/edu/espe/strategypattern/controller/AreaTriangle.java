
package ec.edu.espe.strategypattern.controller;

import ec.edu.espe.strategypattern.model.Area;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class AreaTriangle implements Area{
    
    private final float base;
    private final float height;

    public AreaTriangle(float base, float height) {
        this.base = base;
        this.height = height;
    }
    
    

    @Override
    public float computeArea() {
         return (base * height) / 2;
    }

    @Override
    public String getAnswer() {
        return "El área del triángulo es "+computeArea();
    }
    
}

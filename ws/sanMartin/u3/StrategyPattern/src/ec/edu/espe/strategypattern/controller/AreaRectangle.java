
package ec.edu.espe.strategypattern.controller;

import ec.edu.espe.strategypattern.model.Area;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class AreaRectangle implements Area{
    
    private String name;
    private final float weight;
    private final float height;

    public AreaRectangle(float weight, float height) {
         name = "rectángulo";
        if (weight == height) {
            name = "cuadrado";
        }
        this.weight = weight;
        this.height = height;
    }

    @Override
    public float computeArea() {
       return (weight * height);
    }

    @Override
    public String getAnswer() {
        return "El área del "+name+" es "+computeArea();
    }
}


package ec.edu.espe.strategypattern.controller;

import ec.edu.espe.strategypattern.model.Area;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class AreaPoligonos implements Area{
    private final String nombre;
    private final float radio;
    private final int numeroDeLados;

    public AreaPoligonos(String nombre, float radio, int numeroDeLados) {
        this.nombre = nombre;
        this.radio = radio;
        this.numeroDeLados = numeroDeLados;
    }

    public AreaPoligonos(float radio, int lados) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
  

    @Override
    public float computeArea() {
        double numerador = numeroDeLados * Math.pow(radio, 2)
                * Math.sin((2 * Math.PI) / numeroDeLados);
        return (float) numerador / 2.0f;
        
    }

    @Override
    public String getAnswer() {
       return "El área del "+nombre+" es "+computeArea();  
    }
    
}

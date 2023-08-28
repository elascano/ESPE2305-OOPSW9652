package ec.edu.espe.strategypattern.model;

import ec.edu.espe.strategypattern.controller.AreaCircle;
import ec.edu.espe.strategypattern.controller.AreaPoligonos;
import ec.edu.espe.strategypattern.controller.AreaRectangle;
import ec.edu.espe.strategypattern.controller.AreaTriangle;


// Clase que implementa el patrón y que decidirá la estrategia a aplicar.

public class CuerpoGeometrico {

    private Area figura;
    private final float radio;
    private final int lados;
    private final float weight;
    private final float height;

    /** Constructor para polígonos regulares.
     * @param radio float longitud del radio.
     * @param lados int numero de lados.
     * @throws ConstructorIncorrectoException excepcion de constructor
     * incorrecto.
     */
    public CuerpoGeometrico(float radio, int lados) throws
            ConstructorIncorrectoException {
        if(lados<5)
            throw new ConstructorIncorrectoException();
        this.radio = radio;
        this.lados = lados;
        this.weight = 0;
        this.height = 0;
    }

    /** Constructor para un círculo.
     * @param radio float longitud del radio.
     */
    public CuerpoGeometrico(float radio) {
        this.radio = radio;
        this.lados = (int) Float.POSITIVE_INFINITY;
        this.weight = 0;
        this.height = 0;
    }

    /** Constructor para un triángulo o rectángulo.
     * @param base float longitud de la base.
     * @param altura float longitud de la altura.
     * @param lados int número de lados.
     */
    public CuerpoGeometrico(float base, float altura, int lados) {
        this.radio = 0;
        this.lados = lados;
        this.weight = base;
        this.height = altura;
    }

    /** Se establece la estrategia a desarrollar, en función de los
     * parametros establecidos.
     * @throws PoligonoNoExisteException, si no existe el polígono.
     * @throws PoligonoNoSoportadoException, si no existe algoritmo.
     */
    public void establecerTipo() throws PoligonoNoExisteException,
            PoligonoNoSoportadoException {
        if (esCirculo())
            figura = new AreaCircle(radio);
        else if (esTriangulo())
            figura = new AreaTriangle(radio, height);
        else if (esRectangulo())
            figura = new AreaRectangle(weight, height);
        else if (esPoligonoRegular())
            figura = new AreaPoligonos(radio, lados);
        else if (lados<=2)
            throw new PoligonoNoExisteException();
        else
            throw new PoligonoNoSoportadoException();        
    }

    // Método que realiza el cálculo y devuelve un mensaje respectivo.
    public String obtenerResultado() {
        return figura.getAnswer();
    }

    private boolean esCirculo() {
        return lados==(int)Float.POSITIVE_INFINITY && radio>0;
    }

    private boolean esPoligonoRegular() {
        return radio>=0 && lados>=5;
    }

    private boolean esTriangulo() {
        return weight>0 && height>0 && lados==3;
    }

    private boolean esRectangulo() {
        return weight>0 && height>0 && lados==4;
    }

}


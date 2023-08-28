package ec.edu.espe.strategypattern.model;

// Excepcion para polígonos que no existen.
public class PoligonoNoExisteException extends Exception {

    public PoligonoNoExisteException() {
        super("El polígono no existe.");
    }

    public PoligonoNoExisteException(String string) {
        super(string);
    }

}


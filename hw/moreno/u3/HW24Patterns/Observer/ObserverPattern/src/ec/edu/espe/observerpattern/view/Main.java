
package ec.edu.espe.observerpattern.view;

import ec.edu.espe.observerpattern.model.Motor;
import ec.edu.espe.observerpattern.model.Throttle;

/**
 *
 * @author Paul Moreno
 */
public class Main {
    public static void main(String[] args) {
        
        Motor hourse28 = new Motor();//create a motor
        Throttle acele = new Throttle();//create a throttle
        acele.bindObserver(hourse28);//se enlaza el acelerador con el motor creado/se comunican gracias a la interfaz
        acele.stepOnTheAccelerator();// al momento de conectar el metodo de accionar el acelerador con el acelerador, se muestra la accion
    }
}

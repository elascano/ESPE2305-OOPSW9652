/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.observerpattern.view;

import ec.edu.espe.observerpattern.model.Motor;
import ec.edu.espe.observerpattern.model.Throttle;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class Main {
    public static void main(String[] args) {
        //motor observa -> Acelerador(Throttle) , Observer and Observable
        //motor (observer)
        //throttle (observable)
        
        Motor hourse28 = new Motor();//create a motor
        Throttle acele = new Throttle();//create a throttle
        acele.bindObserver(hourse28);//se enlaza el acelerador con el motor creado/se comunican gracias a la interfaz
        acele.stepOnTheAccelerator();// al momento de conectar el metodo de accionar el acelerador con el acelerador, se muestra la accion
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.observerpattern.model;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class Motor implements Observer {

    public Motor(){
        
    }
    
    @Override
    public void update() {
        //accion a realizar despues de que se entera que el acelerador esta funcionando
        System.out.println("Subir la potencia, suber la velocidad");
    }
    
}

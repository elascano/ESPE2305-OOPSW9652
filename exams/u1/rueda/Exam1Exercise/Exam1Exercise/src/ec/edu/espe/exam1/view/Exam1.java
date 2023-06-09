
package ec.edu.espe.exam1.view;


import ec.edu.espe.exam1.controller.Eliminate;


/**
 *
 * @author juan rueda, The encoders; DCCO-ESPE
 */
public class Exam1 {
    public static void main(String[] args) {
        EliminateTopics eliminate = new EliminateTopics();

        EliminateTopic object1 = new EliminateTopics();
        object1.put("id", "2");
        object1.put("atributo1", "valor1");
        object1.put("atributo2", "valor2");
        Eliminate.agregateObject(object1);
        eliminate.eliminateObjects("valor1", "valor2");


        eliminate.saveData("Topics.json");
    }
}



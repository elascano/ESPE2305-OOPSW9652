package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.model.Condor;
import ec.edu.espe.zoo.model.Eagle;
import ec.edu.espe.zoo.model.Lion;
import ec.edu.espe.zoo.model.Pigeon;
import ec.edu.espe.zoo.model.Tiger;
import ec.edu.espe.zoo.model.Tooth;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class Zoo {
    public static void main(String[] args) {
        Condor condor = new Condor();
        Eagle eagle = new Eagle();
        Pigeon pigeon = new Pigeon();

        condor.feed();
        condor.born();
        condor.drawBeak();
        condor.drawFeathers();
        condor.drawClaws();

        eagle.feed();
        eagle.born();
        eagle.drawBeak();
        eagle.drawFeathers();
        eagle.drawClaws();

        pigeon.feed();
        pigeon.born();
        pigeon.drawBeak();
        pigeon.drawFeathers();
        pigeon.drawClaws();

        Tooth tooth1 = new Tooth();
        Tooth tooth2 = new Tooth();

        Lion lion = new Lion(tooth1);
        Tiger tiger = new Tiger(tooth2);

        lion.feed();
        lion.born();
        lion.drawTeeth();

        tiger.feed();
        tiger.born();
        tiger.drawTeeth();

        System.out.println("Lion's teeth: " + lion.getTeeth());
        System.out.println("Tiger's teeth: " + tiger.getTeeth());
    }
}

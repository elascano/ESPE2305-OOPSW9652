package ec.edu.espe.simulator.model;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public abstract class Construction {

    public void  buildHouse() {
        prepareFoundation();
        buildStructure();
        addRoofs();
        addWalls();
        housePainting();
    }

    public abstract void prepareFoundation();

    public abstract void buildStructure();

    public abstract void addRoofs();

    public abstract void addWalls();

    public abstract void housePainting();

}

package ec.edu.espe.finalexam.model;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class Number {

    private int[] numberDisorder;
    private int sizeListOfNumber;
    private String sortAlgoritm;
    private int listOfNumberOrder[];

    @Override
    public String toString() {
        return "Number{" + "numberDisorder=" + numberDisorder + ", sizeListOfNumber=" + sizeListOfNumber + ", sortAlgoritm=" + sortAlgoritm + ", listOfNumberOrder=" + listOfNumberOrder + '}';
    }

    public int[] getNumberDisorder() {
        return numberDisorder;
    }

    public void setNumberDisorder(int[] numberDisorder) {
        this.numberDisorder = numberDisorder;
    }

    public int getSizeListOfNumber() {
        return sizeListOfNumber;
    }

    public void setSizeListOfNumber(int sizeListOfNumber) {
        this.sizeListOfNumber = sizeListOfNumber;
    }

    public String getSortAlgoritm() {
        return sortAlgoritm;
    }

    public void setSortAlgoritm(String sortAlgoritm) {
        this.sortAlgoritm = sortAlgoritm;
    }

    public int[] getListOfNumberOrder() {
        return listOfNumberOrder;
    }

    public void setListOfNumberOrder(int[] listOfNumberOrder) {
        this.listOfNumberOrder = listOfNumberOrder;
    }
}

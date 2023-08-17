package ec.edu.espe.strategyfinalexam.controller;
import ec.edu.espe.strategyfinalexam.model.BubbleSort;
import ec.edu.espe.strategyfinalexam.model.InsertionSort;
import ec.edu.espe.strategyfinalexam.model.QuickSort;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class SortingContext {

    private SortingStrategy sortStrategy;

    public int[] sort(int data[]) {

        int size = data.length;

        setSortStrategy(setSortStrategy(size));

        return getSortStrategy().sort(data);

    }

    public SortingStrategy setSortStrategy(int n) {

        if (n > 0 && n < 30) {
            setSortStrategy(new BubbleSort());
        }

        if (n >= 30 && n < 100) {
            setSortStrategy(new InsertionSort());
        }

        if (n >= 100) {
            setSortStrategy(new QuickSort());
        }

        return getSortStrategy();

    }

    public SortingStrategy getSortStrategy() {
        return sortStrategy;
    }

    public void setSortStrategy(SortingStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

}

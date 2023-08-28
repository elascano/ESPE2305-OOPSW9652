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

        if (n > 2 && n < 5) {
            setSortStrategy(new BubbleSort());
        }

        if (n >= 6 && n < 11) {
            setSortStrategy(new InsertionSort());
        }

        if (n >= 11) {
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

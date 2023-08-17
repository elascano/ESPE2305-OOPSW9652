package ec.edu.espe.strategyfinalexam.model;

import ec.edu.espe.strategyfinalexam.controller.SortingStrategy;


/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class InsertionSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {
        System.out.println("InsertionSort");

        int arraySize = data.length;
        for (int i = 1; i < arraySize; ++i) {
            int key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }

        return data;
    }

}

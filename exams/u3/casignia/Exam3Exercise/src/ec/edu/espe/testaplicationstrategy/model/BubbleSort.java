package ec.edu.espe.testaplicationstrategy.model;

import ec.edu.espe.testaplicationstrategy.controller.SortingStrategy;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class BubbleSort implements SortingStrategy {
    @Override
    public int[] sort(int[] data) {
        for (int x = 0; x < data.length; x++) {
            for (int i = 0; i < data.length - x - 1; i++) {
                if (data[i] > data[i + 1]) {
                    int tmp = data[i + 1];
                    data[i + 1] = data[i];
                    data[i] = tmp;
                }
            }
        }
        return data;
    }
}


package ec.edu.espe.practiceexam.model;

import ec.edu.espe.practiceexam.controller.SortingStrategy;

/**
 *
 * @author Pablo Zurita, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class QuickSort implements SortingStrategy{

    @Override
    public int[] sort(int[] data) {
        int sortedData[];

        System.out.println("__QuickSort__");

        sortedData=quickSort(data, 0, data.length - 1);
        return sortedData;
    }

    private int[] quickSort(int[] data, int low, int high) {

        if (low < high) {
            int pi = partition(data, low, high);
            quickSort(data, low, pi - 1);
            quickSort(data, pi + 1, high);
        }
        
        return data;

    }

    static int partition(int[] data, int low, int high) {
        int pivot = data[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (data[j] <= pivot) {
                i++;
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        int temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;
        return i + 1;
    }
}

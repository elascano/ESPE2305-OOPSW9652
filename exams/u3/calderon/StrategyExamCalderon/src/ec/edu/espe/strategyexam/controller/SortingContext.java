/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategyexam.controller;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class SortingContext implements SortingStrategy {

    private SortingStrategy sortingStrategy;

    @Override
    public int[] sort(int[] data) {

        int size = data.length;

        setSortStrategy(setSortStrategy(size));

        return getSortStrategy().sort(data);

    }

    public SortingStrategy setSortStrategy(int n) {

        if (n > 2 && n < 5) {
            setSortStrategy(new BubbleSort());
        }

        if (n >= 6 && n < 10) {
            setSortStrategy(new InsertionSort());
        }

        if (n >= 11) {
            setSortStrategy(new QuickSort());
        }

        return getSortStrategy();

    }

    public SortingStrategy getSortStrategy() {
        return sortingStrategy;
    }

    public void setSortStrategy(SortingStrategy sortStrategy) {
        this.sortingStrategy = sortStrategy;
    }

}

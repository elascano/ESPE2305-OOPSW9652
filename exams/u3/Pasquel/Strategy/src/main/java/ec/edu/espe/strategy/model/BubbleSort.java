/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategy.model;

/**
 *
 * @author Juan Pasquel, The Encoders, DCCO-ESPE
 */
public class BubbleSort implements SortingStrategy {
     @Override
    public int[] sort(int data[]) {
        
        System.out.println("BubbleSort");

        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        
        return data;
    }
}

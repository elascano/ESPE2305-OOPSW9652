/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategy.model;

/**
 *
 * @author @author Juan Pasquel, The Encoders, DCCO-ESPE
 */
public class InsertionSort implements SortingStrategy {
    @Override
    public  int[] sort(int data[]){
        System.out.println("InsertionSort");
        
        int n = data.length;
        for (int i = 1; i < n; ++i) {
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

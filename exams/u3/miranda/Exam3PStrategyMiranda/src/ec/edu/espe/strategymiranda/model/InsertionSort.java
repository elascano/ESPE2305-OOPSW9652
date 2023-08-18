/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategymiranda.model;

import ec.edu.espe.strategymiranda.controller.SortingStrategy;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class InsertionSort implements SortingStrategy{

    @Override
    public int[] sort(int[] data) {
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


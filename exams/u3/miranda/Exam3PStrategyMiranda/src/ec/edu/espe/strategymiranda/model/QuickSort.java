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
public class QuickSort implements SortingStrategy{

    @Override
    public int[] sort(int[] data) {
        final int n = data.length;
        quickSort(data,0,n-1);
        
        return data;
    }
    
    public void quickSort(int data[], int lowIndex, int highIndex){
        if(lowIndex >= highIndex) return;
        
        int pivot = data[lowIndex];
        int leftElement = lowIndex + 1;
        int rightElement = highIndex;
                
        while(leftElement <= rightElement){
            while(leftElement <= highIndex && data[leftElement] < pivot){
                leftElement++;
            }
            
            while(rightElement > lowIndex && data[rightElement] >= pivot){
                rightElement--;
            }
                        
            if(leftElement < rightElement){
                int temp = data[leftElement];
                data[leftElement] = data[rightElement];
                data[rightElement] = temp;
            }
        }
                
        if(rightElement > lowIndex){
            int temp = data[lowIndex];
            data[lowIndex] = data[rightElement];
            data[rightElement] = temp;
        }
                
        quickSort(data, lowIndex, rightElement-1);
        quickSort(data, rightElement+1, highIndex);
    }
}

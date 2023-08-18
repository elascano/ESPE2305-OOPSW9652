/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategymiranda.controller;

import ec.edu.espe.strategymiranda.model.InsertionSort;
import ec.edu.espe.strategymiranda.model.QuickSort;
import ec.edu.espe.strategymiranda.model.BubbleSort;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class SortingContext {
    private SortingStrategy ss;
    
    public SortingStrategy setSortStrategy(int arraySize) {
        if( arraySize >1 && arraySize <= 5 ) {
            ss = new BubbleSort();} 
        else if ( arraySize > 5 && arraySize <= 10 ) {
            ss = new InsertionSort(); } 
        else if ( arraySize > 11 ) {
            ss = new QuickSort(); }
        
        return ss;
    }
    
    public int[ ] sort( int data[ ] ) {
        int size = data.length;
        ss = setSortStrategy(size);
        
        return ss.sort(data);
    }

    public SortingStrategy getSs() {
        return ss;
    }

}


package ec.edu.espe.finalExam.controller;

import ec.edu.espe.finalExam.model.BubbleSort;
import ec.edu.espe.finalExam.model.InsertionSort;
import ec.edu.espe.finalExam.model.QuickSort;

/**
 *
 * @author Edison Ludeña
 */
public class SortingContext {
    private SortingStrategy ss;
    
    public SortingStrategy setSortStrategy(int arraySize) {
        if( arraySize >0 && arraySize <= 5 ) {
            ss = new BubbleSort();} 
        else if ( arraySize > 6 && arraySize <= 10 ) {
            ss = new InsertionSort(); } 
        else if ( arraySize > 10 ) {
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

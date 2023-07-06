/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.serie;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class SerieTest {
    
    public SerieTest() {
    }

    /**
     * Test of computeFibonacci method, of class Serie.
     */
    @Test
    public void testComputeFibonacci() {
        System.out.println("computeFibonacci");
        int serie = 3;
        Serie.computeFibonacci(serie);

    }

    /**
     * Test of computeDivergence method, of class Serie.
     */
    @Test
    public void testComputeDivergence() {
        System.out.println("computeDivergence");
        int n = 1;
        int expResult = 1;
        int result = Serie.computeDivergence(n);
        assertEquals(expResult, result);

    }

    /**
     * Test of computeDivergence2 method, of class Serie.
     */
    @Test
    public void testComputeDivergence2() {
        System.out.println("computeDivergence2");
        int n = 1;
        int expResult = 1;
        int result = Serie.computeDivergence2(n);
        assertEquals(expResult, result);

    }
    
}

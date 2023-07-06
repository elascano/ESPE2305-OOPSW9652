/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.series;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class DivergenceTest {
    
    public DivergenceTest() {
    }

    /**
     * Test of doDivergence method, of class Divergence.
     */
    @Test
    public void testDoDivergence() {
        System.out.println("doDivergence");
        int num = 1;
        int expResult = -1;
        int result = Divergence.doDivergence(num);
        assertEquals(expResult, result);

    }
    
}

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
public class FactorialTest {
    
    public FactorialTest() {
    }

    /**
     * Test of calculateFactorial method, of class Factorial.
     */
    @Test
    public void testCalculateFactorial() {
        System.out.println("calculateFactorial");
        int number = 3;
        int expResult = 6;
        int result = Factorial.calculateFactorial(number);
        assertEquals(expResult, result);
    }
    
}

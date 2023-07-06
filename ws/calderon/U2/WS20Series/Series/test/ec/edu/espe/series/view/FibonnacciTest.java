
package ec.edu.espe.series.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class FibonnacciTest {

    @Test
    public void testLimit() {
        assertEquals(0, Fibonnacci.limit(0));
        assertEquals(1, Fibonnacci.limit(1));
        assertEquals(1, Fibonnacci.limit(2));
        assertEquals(2, Fibonnacci.limit(3));
        assertEquals(3, Fibonnacci.limit(4));
    }

    /**
     * Test of Fibo method, of class Fibonnacci.
     */
    @Test
    public void testFibo() {
        System.out.println("Fibo");
        int n = 0;
        int expResult = 0;
        int result = Fibonnacci.Fibo(n);
        assertEquals(expResult, result);
        assertEquals(0, Fibonnacci.limit(0));
        assertEquals(1, Fibonnacci.limit(1));
        assertEquals(1, Fibonnacci.limit(2));
        assertEquals(2, Fibonnacci.limit(3));
        assertEquals(3, Fibonnacci.limit(4));   
    }
}



package ec.edu.espe.serie.utils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class OperationTest {
    
    public OperationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculateFactorial method, of class Operation.
     */
    @Test
    public void testCalculateFactorial() {
        System.out.println("calculateFactorial");
        int n = 0;
        int expResult = 1;
        int result = Operation.calculateFactorial(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of computeDivergence method, of class Operation.
     */
    @Test
    public void testComputeDivergence() {
        System.out.println("computeDivergence");
        int n = 2;
        int expResult = -1;
        int result = Operation.computeDivergence(n);
        assertEquals(expResult, result);
        
    }
    
}

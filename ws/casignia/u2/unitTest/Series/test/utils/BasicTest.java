package utils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class BasicTest {
    
    public BasicTest() {
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

    @Test
    public void testComputeFactorial() {
        System.out.println("\n\t*** Factorial ***\n");
        validateComputeFactorial(0, 1);
        validateComputeFactorial(1, 1);
        validateComputeFactorial(2, 2);
        validateComputeFactorial(3, 6);
        validateComputeFactorial(4, 24);
        validateComputeFactorial(5, 120);
    }

    @Test
    public void testComputeDivergence() {
        System.out.println("\n\t*** Divergence ***\n");
        validateComputeDivergence(1, 1);
        validateComputeDivergence(2, -1);
        validateComputeDivergence(3, 2);
        validateComputeDivergence(4, -2);
        validateComputeDivergence(5, 3);
        validateComputeDivergence(6, -3);
    }
    
    public void validateComputeDivergence(int n, int expResult){
        int result = Series.computeDivergence(n);
        assertEquals(expResult, result);
    }
    
    public void validateComputeFactorial(int n, long expResult){
        long result = Series.computeFactorial(n);
        assertEquals(expResult, result);
    }
}

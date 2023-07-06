
package ec.edu.espe.series.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class DivergenceTest {
    
    public DivergenceTest() {
    }

    /**
     * Test of Serie method, of class Divergence.
     */
    @Test
    public void testSerie() {
        System.out.println("Serie");
        int n = 0;
        int expResult = 0;
        int result = Divergence.Serie(n);
       assertEquals(expResult, result);
       
        
    }
    //Calderon Jilmar Test
    /**
     * Test of divergentSeries method, of class Divergence.
     */
    @Test
    public void testDivergentSeries() {
        System.out.println("divergentSeries");
        int num = 0;
        Divergence.divergentSeries(num);
        
    }
    
}

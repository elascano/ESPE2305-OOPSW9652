/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package unitTestPackages;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class TestCalculatorTest {
    
    public TestCalculatorTest() {
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
     * Test of calculateFactorial method, of class TestCalculator.
     */
    @Test
    public void testCalculateFactorial() {
        System.out.println("calculateFactorial");
        int n = 0;
        int expResult = 1;
        int result = TestCalculator.calculateFactorial(n);
        assertEquals(expResult, result);
     
    }

    /**
     * Test of calculateSerie method, of class TestCalculator.
     */
    @Test
    public void testCalculateSerie() {
        System.out.println("calculateSerie");
        int n = 4;
        int expResult = -2;
        int result = TestCalculator.calculateSerie(n);
        assertEquals(expResult, result);
        
    }
    
}

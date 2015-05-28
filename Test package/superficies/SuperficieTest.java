/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superficies;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dpazolopez
 */
public class SuperficieTest {
    
    public SuperficieTest() {
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
     * Test of calcuCuad method, of class Superficie.
     */
    @Test
    public void testCalcuCuad() {
        System.out.println("calcuCuad");
        float lado = 0.0F;
        float expResult = 0.0F;
        float result = Superficie.calcuCuad(lado);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcuRectang method, of class Superficie.
     */
    @Test
    public void testCalcuRectang() {
        System.out.println("calcuRectang");
        float base = 0.0F;
        float altura = 0.0F;
        float expResult = 0.0F;
        float result = Superficie.calcuRectang(base, altura);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcuTrian method, of class Superficie.
     */
    @Test
    public void testCalcuTrian() {
        System.out.println("calcuTrian");
        float base = 0.0F;
        float altura = 0.0F;
        float expResult = 0.0F;
        float result = Superficie.calcuTrian(base, altura);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcuCirc method, of class Superficie.
     */
    @Test
    public void testCalcuCirc() {
        System.out.println("calcuCirc");
        float radio = 0.0F;
        float expResult = 0.0F;
        float result = Superficie.calcuCirc(radio);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

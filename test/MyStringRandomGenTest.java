/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ธนพล
 */
public class MyStringRandomGenTest {
    
    public MyStringRandomGenTest() {
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
     * Test of generateRandomString method, of class MyStringRandomGen.
     */
    @Test
    public void testGenerateRandomString() {
        System.out.println("generateRandomString");
        MyStringRandomGen instance = new MyStringRandomGen();
        String expResult = "";
        String result = instance.generateRandomString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class MyStringRandomGen.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] a = null;
        MyStringRandomGen.main(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

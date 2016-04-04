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
public class ConfirmTest {
    
    public ConfirmTest() {
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
     * Test of main method, of class Confirm.
     */
    @Test
    public void TestConfirm() {
        System.out.println("ConfirmTest1");
        String Username = "Username";
        String Password = "123456789";
        String Code = "bJj8N1ZvPc";
        String CodeTest = "bJj8N1ZvPc";
        Confirm confirm = new Confirm(Username,Password,Code);
        boolean result = confirm.checkConfirm(CodeTest,Code);
        boolean expResult = true;
        assertEquals(expResult,result);  
    }
    @Test
    public void TestConfirm2() {
        System.out.println("ConfirmTest1");
        String Username = "Username";
        String Password = "123456789";
        String Code = "bJj8N1ZvPc";
        String CodeTest = "abcdefghij";
        Confirm confirm = new Confirm(Username,Password,Code);
        boolean result = confirm.checkConfirm(CodeTest,Code);
        boolean expResult = false;
        assertEquals(expResult,result);  
    }
}

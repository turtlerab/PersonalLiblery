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
public class RegisterFormTest {
    
    public RegisterFormTest() {
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
     * Test of main method, of class RegisterForm.
     */
    @Test
    public void testRegisterForm() {
        RegisterForm register = new RegisterForm();
        String UsernameTest = "UsernameTest";//<<have Username in Database
        boolean result = register.checkDuplicate(UsernameTest);
        boolean expResult = true;
        //expResult is true when Username Duplicate
        //Test pass for Username is Duplicate
        assertEquals(expResult,result);
    }
    @Test
    public void testRegisterForm2() {
        RegisterForm register = new RegisterForm();
        String UsernameTest = "UsernameTest555";//not have Username in Database
        boolean result = register.checkDuplicate(UsernameTest);
        boolean expResult = false;
        //expResult is false when Username not Duplicate
        //Test pass for Username isn't Duplicate
        assertEquals(expResult,result);
    }
    
}

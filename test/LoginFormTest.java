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
public class LoginFormTest {
    
    public LoginFormTest() {
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
     * Test of main method, of class LoginForm.
     */
    @Test
    public void testLoginForm(){
        String Username = "saknoi";
        String Password = "123456";
        LoginForm login = new LoginForm();
        boolean result = login.checkUserInDB(Username,Password);
        boolean expResult = true;
        assertEquals(expResult, result);
    }
    @Test
    public void testLoginForm2(){
        String Username = "saknoiiiiiiiii";
        String Password = "123456";
        LoginForm login = new LoginForm();
        boolean result = login.checkUserInDB(Username,Password);
        boolean expResult = false;
        assertEquals(expResult, result);
    }
    @Test
    public void testLoginForm3(){
        String Username = "saknoi";
        String Password = "1234565555555555";
        LoginForm login = new LoginForm();
        boolean result = login.checkUserInDB(Username,Password);
        boolean expResult = false;
        assertEquals(expResult, result);
    }
    @Test
    public void testLoginForm4(){
        String Username = "lejglkndlkg";
        String Password = "613165465";
        LoginForm login = new LoginForm();
        boolean result = login.checkUserInDB(Username,Password);
        boolean expResult = false;
        assertEquals(expResult, result);
    }
}

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
public class EmailSenderTest {
    
    public EmailSenderTest() {
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
     * Test of sendMail method, of class EmailSender.
     */
    @Test
    public void testSendMail() throws Exception {
        System.out.println("sendMail");
        String from = "";
        String password = "";
        String message = "";
        String[] to = null;
        boolean expResult = false;
        boolean result = EmailSender.sendMail(from, password, message, to);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

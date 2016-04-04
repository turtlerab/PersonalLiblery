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
        EmailSender send = new EmailSender();
        String UsernameSender = "PDF_viewer@hotmail.com";
        String PasswordSender = "abc123456789";
        String Message = "Hello";
        String to[] = {"a5730123b@gmail.com"};
        boolean result = EmailSender.sendMail(UsernameSender,PasswordSender,Message,to);
        boolean expResult = true;
        assertEquals(expResult,result);
    }
    
    @Test
    public void testSendMail2() throws Exception {
        EmailSender send = new EmailSender();
        String UsernameSender = "PDF_viewer@hotmail.com5555555555"; //wrong Email
        String PasswordSender = "abc123456789";
        String Message = "Hello";
        String to[] = {"a5730123b@gmail.com"};
        boolean result = send.sendMail(UsernameSender,PasswordSender,Message,to);
        boolean expResult = false;
        assertEquals(expResult,result);
    }
    
    @Test
    public void testSendMail3() throws Exception {
        EmailSender send = new EmailSender();
        String UsernameSender = "PDF_viewer@hotmail.com";
        String PasswordSender = "abc123456789djdfhdfnfn"; //wrong Password
        String Message = "Hello";
        String to[] = {"a5730123b@gmail.com"};
        boolean result = send.sendMail(UsernameSender,PasswordSender,Message,to);
        boolean expResult = false;
        assertEquals(expResult,result);
    }
}

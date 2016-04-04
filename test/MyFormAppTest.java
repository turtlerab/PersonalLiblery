/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
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
public class MyFormAppTest {
    
    public MyFormAppTest() {
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
     * Test of getFileList method, of class MyFormApp.
     */
    @Test
    public void testGetFileList() {
        System.out.println("getFileList");
        String dirPath = "";
        File[] expResult = null;
        File[] result = MyFormApp.getFileList(dirPath);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of openMenuItemActionPerformed method, of class MyFormApp.
     */
    @Test
    public void testOpenMenuItemActionPerformed() {
        System.out.println("openMenuItemActionPerformed");
        MyFormApp instance = null;
        instance.openMenuItemActionPerformed();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteDir method, of class MyFormApp.
     */
    @Test
    public void testDeleteDir() {
        System.out.println("deleteDir");
        File dir = null;
        boolean expResult = false;
        boolean result = MyFormApp.deleteDir(dir);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pdfToimage method, of class MyFormApp.
     */
    @Test
    public void testPdfToimage() throws Exception {
        System.out.println("pdfToimage");
        File filename = null;
        MyFormApp instance = null;
        instance.pdfToimage(filename);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class MyFormApp.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MyFormApp instance = null;
        instance.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

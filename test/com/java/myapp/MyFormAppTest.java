/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.myapp;

import java.io.File;
import java.io.FilenameFilter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ball_
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
        String dirPath = "C:\\Users\\ball_\\Downloads\\Documents\\new folder";
        File file = new File("C:\\Users\\ball_\\Downloads\\Documents\\new folder");
        File[] expResult = file.listFiles(new FilenameFilter() {
                public boolean accept(File dir, String name) { 
                    return name.endsWith(".pdf");
                }
            });
        File[] result = MyFormApp.getFileList(dirPath);
   
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of openMenuItemActionPerformed method, of class MyFormApp.
     */
    @Test
    public void testOpenMenuItemActionPerformed() {
        System.out.println("openMenuItemActionPerformed");
        MyFormApp instance = new MyFormApp();
        instance.openMenuItemActionPerformed();
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of deleteDir method, of class MyFormApp.
     */
    @Test
    public void testDeleteDir() {
        System.out.println("deleteDir");
        File dir = new File("C:\\Users\\ball_\\Downloads\\Documents\\new folder\\assembly 5701012630069.pdf");
        boolean expResult = false;
        boolean result = MyFormApp.deleteDir(dir);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of pdfToimage method, of class MyFormApp.
     */
    @Test
    public void testPdfToimage() throws Exception {
        System.out.println("pdfToimage");
        File filename = new File("C:\\Users\\ball_\\Downloads\\Documents\\new folder\\test.pdf");
        MyFormApp instance = new MyFormApp();
        instance.pdfToimage(filename);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of main method, of class MyFormApp.
     */
   @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MyFormApp.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}

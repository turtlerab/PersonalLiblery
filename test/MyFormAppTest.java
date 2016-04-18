/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.adobe.acrobat.Viewer;
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
        String dirPath = "C:\\Users\\ball_\\Downloads\\Documents\\new folder";
        File file = new File("C:\\Users\\ball_\\Downloads\\Documents\\new folder");
        File[] expResult = file.listFiles(new FilenameFilter() {
                public boolean accept(File dir, String name) { 
                    return name.endsWith(".pdf");
                }
            });
        File[] result = MyFormApp.getFileList(dirPath);
   
        assertArrayEquals(expResult, result);
    }

   

    /**
     * Test of deleteDir method, of class MyFormApp.
     */
    @Test
    public void testDeleteDir() {
        System.out.println("deleteDir");
        File dir = new File("C:\\Users\\ball_\\Downloads\\Documents\\new folder\\test.pdf"); //ใส่พาทไฟล์ที่จะลบ
        boolean expResult = false;
        boolean result = MyFormApp.deleteDir(dir);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of pdfToimage method, of class MyFormApp.
     */
    @Test
    public void testPdfToimage() throws Exception {
        System.out.println("pdfToimage");
        File filename = new   File("C:\\Users\\ball_\\Downloads\\Documents\\test.pdf");
        String String = new String("C:\\Users\\ball_\\Downloads\\Documents\\new folder\\");
        
        MyFormApp.pdfToimage(filename,String);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class MyFormApp.
     */
    /*@Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MyFormApp instance = new MyFormApp();
        instance.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of confirmDelete method, of class MyFormApp.
     */



    
    /**
     * Test of confirmDelete method, of class MyFormApp.
     */
    @Test
    public void testConfirmDelete() {
        System.out.println("confirmDelete");
        String PATH = "C:\\Users\\ball_\\Downloads\\Documents\\new folder\\";
        String Element = "test.pdf";
        int expResult = 0;
        int result = MyFormApp.confirmDelete(PATH, Element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of addFile method, of class MyFormApp.
     */
    @Test
    public void testAddFile() {
        System.out.println("addFile");
        String PATH = "C:\\Users\\ball_\\Downloads\\Documents\\new folder\\";
        String expResult = "C:\\Users\\ball_\\Downloads\\Documents\\test.pdf";
        String result = MyFormApp.addFile(PATH);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of openMenuItemActionPerformed method, of class MyFormApp.
     */
    @Test
    public void testOpenMenuItemActionPerformed() throws Exception {
        System.out.println("openMenuItemActionPerformed");
        String name = "";
        Viewer expResult = null;
        Viewer result = MyFormApp.openMenuItemActionPerformed(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of addFile method, of class MyFormApp.
     */
    

    
}

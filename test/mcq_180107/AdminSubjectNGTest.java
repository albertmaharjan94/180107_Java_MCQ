/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcq_180107;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author albert
 */
public class AdminSubjectNGTest {
    
    public AdminSubjectNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of loadData method, of class AdminSubject.
     */
    @Test
    public void testLoadData() {
        System.out.println("loadData");
        AdminSubject instance = new AdminSubject();
        instance.loadData();
    }

    /**
     * Test of reset method, of class AdminSubject.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        AdminSubject instance = new AdminSubject();
        instance.reset();
    }

    /**
     * Test of checkSubject method, of class AdminSubject.
     */
    @Test
    public void testCheckSubject() throws Exception {
        System.out.println("checkSubject");
        String id = "2";
        String name = "JAVA";
        AdminSubject instance = new AdminSubject();
        boolean expResult = false;
        boolean result = instance.checkSubject(id, name);
        assertEquals(result, expResult);
    }

    /**
     * Test of checkSubjectDup method, of class AdminSubject.
     */
    @Test
    public void testCheckSubjectDup() throws Exception {
        System.out.println("checkSubjectDup");
        String name = "";
        AdminSubject instance = new AdminSubject();
        boolean expResult = false;
        boolean result = instance.checkSubjectDup(name);
        assertEquals(result, expResult);
    }

    /**
     * Test of checkField method, of class AdminSubject.
     */
    @Test
    public void testCheckField() {
        System.out.println("checkField");
        AdminSubject instance = new AdminSubject();
        boolean expResult = false;
        boolean result = instance.checkField();
        assertEquals(result, expResult);
    }

    /**
     * Test of main method, of class AdminSubject.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AdminSubject.main(args);
    }
    
}

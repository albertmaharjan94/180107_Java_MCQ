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
public class AdminQuestionSetNGTest {
    
    public AdminQuestionSetNGTest() {
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
     * Test of subId method, of class AdminQuestionSet.
     */
    @Test
    public void testSubId() {
        System.out.println("subId");
        String id = "";
        AdminQuestionSet instance = new AdminQuestionSet();
        instance.subId(id);
    }

    /**
     * Test of main method, of class AdminQuestionSet.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AdminQuestionSet.main(args);
    }

    /**
     * Test of reset method, of class AdminQuestionSet.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        AdminQuestionSet instance = new AdminQuestionSet();
        instance.reset();
    }

    /**
     * Test of checkQS method, of class AdminQuestionSet.
     */
    @Test
    public void testCheckQS() throws Exception {
        System.out.println("checkQS");
        String id = "2";
        String name = "Java - Set A";
        AdminQuestionSet instance = new AdminQuestionSet();
        boolean expResult = false;
        boolean result = instance.checkQS(id, name);
        assertEquals(result, expResult);
    }

    /**
     * Test of checkQSDup method, of class AdminQuestionSet.
     */
    @Test
    public void testCheckQSDup() throws Exception {
        System.out.println("checkQSDup");
        String name = "";
        AdminQuestionSet instance = new AdminQuestionSet();
        boolean expResult = false;
        boolean result = instance.checkQSDup(name);
        assertEquals(result, expResult);
    }

    /**
     * Test of checkField method, of class AdminQuestionSet.
     */
    @Test
    public void testCheckField() {
        System.out.println("checkField");
        AdminQuestionSet instance = new AdminQuestionSet();
        boolean expResult = false;
        boolean result = instance.checkField();
        assertEquals(result, expResult);
    }

    /**
     * Test of loadData method, of class AdminQuestionSet.
     */
    @Test
    public void testLoadData() {
        System.out.println("loadData");
        AdminQuestionSet instance = new AdminQuestionSet();
        instance.loadData();
    }
    
}

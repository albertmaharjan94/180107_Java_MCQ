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
public class UserDashNGTest {
    
    public UserDashNGTest() {
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
     * Test of setVar method, of class UserDash.
     */
    @Test
    public void testSetVar() throws Exception {
        System.out.println("setVar");
        String s = "albert";
        String id = "3";
        UserDash instance = new UserDash();
        instance.setVar(s, id);
    }

    /**
     * Test of getQuestionCount method, of class UserDash.
     */
    @Test
    public void testGetQuestionCount() throws Exception {
        System.out.println("getQuestionCount");
        int id = 0;
        UserDash instance = new UserDash();
        int expResult = 0;
        int result = instance.getQuestionCount(id);
        assertEquals(result, expResult);
    }

    /**
     * Test of main method, of class UserDash.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        UserDash.main(args);
    }

    /**
     * Test of init method, of class UserDash.
     */
    @Test
    public void testInit() throws Exception {
        System.out.println("init");
        String s = "albert";
        String id = "3";
        UserDash instance = new UserDash();
        instance.setVar(s, id);
        instance.init();
    }
    
}

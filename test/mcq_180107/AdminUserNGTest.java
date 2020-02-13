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
public class AdminUserNGTest {
    
    public AdminUserNGTest() {
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
     * Test of reset method, of class AdminUser.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        AdminUser instance = new AdminUser();
        instance.reset();
    }

    /**
     * Test of main method, of class AdminUser.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AdminUser.main(args);
    }

    /**
     * Test of checkUserDup method, of class AdminUser.
     */
    @Test
    public void testCheckUserDup() throws Exception {
        System.out.println("checkUserDup");
        String username = "";
        AdminUser instance = new AdminUser();
        boolean expResult = false;
        boolean result = instance.checkUserDup(username);
        assertEquals(result, expResult);
    }

    /**
     * Test of checkField method, of class AdminUser.
     */
    @Test
    public void testCheckField() {
        System.out.println("checkField");
        AdminUser instance = new AdminUser();
        boolean expResult = false;
        boolean result = instance.checkField();
        assertEquals(result, expResult);
    }

    /**
     * Test of loadData method, of class AdminUser.
     */
    @Test
    public void testLoadData() {
        System.out.println("loadData");
        AdminUser instance = new AdminUser();
        instance.loadData();
    }

    /**
     * Test of tokenGenerator method, of class AdminUser.
     */
    @Test
    public void testTokenGenerator() {
        System.out.println("tokenGenerator");
        AdminUser instance = new AdminUser();
        
        String expResult = "randonwords";
        String result = instance.tokenGenerator();
        assertNotEquals(result, expResult);
    }
    
}

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
public class AdminResultNGTest {
    
    public AdminResultNGTest() {
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
     * Test of init method, of class AdminResult.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        AdminResult instance = new AdminResult();
        instance.init();
    }

    /**
     * Test of main method, of class AdminResult.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AdminResult.main(args);
    }
    
}

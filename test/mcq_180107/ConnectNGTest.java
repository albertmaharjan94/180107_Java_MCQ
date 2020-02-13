/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcq_180107;

import java.sql.Connection;
import java.sql.ResultSet;
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
public class ConnectNGTest {
    
    public ConnectNGTest() {
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
     * Test of getConnection method, of class Connect.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        Connection expResult = null;
        Connection result = Connect.getConnection();
        assertNotEquals(result, expResult);
    }

    /**
     * Test of getResult method, of class Connect.
     */
    @Test
    public void testGetResult() throws Exception {
        System.out.println("getResult");
        String s = "select * from users";
        ResultSet expResult = null;
        ResultSet result = Connect.getResult(s);
        assertNotEquals(result, expResult);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcq_180107;

import javax.swing.JTextField;

import javax.swing.JOptionPane;
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
public class AdminQuestionNGTest {
    
    public AdminQuestionNGTest() {
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
     * Test of setSubId method, of class AdminQuestion.
     */
    @Test
    public void testSetSubId() {
        System.out.println("setSubId");
        String id = "";
        AdminQuestion instance = new AdminQuestion();
        instance.setSubId(id);
    }

    /**
     * Test of setQsId method, of class AdminQuestion.
     */
    @Test
    public void testSetQsId() {
        System.out.println("setQsId");
        String id = "";
        AdminQuestion instance = new AdminQuestion();
        instance.setQsId(id);
    }

    /**
     * Test of main method, of class AdminQuestion.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AdminQuestion.main(args);
    }

    /**
     * Test of reset method, of class AdminQuestion.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        AdminQuestion instance = new AdminQuestion();
        instance.reset();
    }

    /**
     * Test of checkField method, of class AdminQuestion.
     */
    @Test
    public void testCheckField() {
        System.out.println("checkField");
        JTextField txtQuestion= new JTextField();
        JTextField txtA1= new JTextField();
        JTextField txtA2= new JTextField();
        JTextField txtA3= new JTextField();
        JTextField txtA4= new JTextField();
        
        txtQuestion.setText("What is a boolean");
       
        txtA1.setText("yes, no ");
        txtA2.setText("true,false");
        txtA3.setText("null,not null");
        txtA4.setText("None");
        AdminQuestion instance = new AdminQuestion();
        boolean expResult = false;
        boolean result = instance.checkField();
        assertEquals(result, expResult);
    }

    /**
     * Test of loadData method, of class AdminQuestion.
     */
    @Test
    public void testLoadData() {
        System.out.println("loadData");
        String qsId="2";
        AdminQuestion instance = new AdminQuestion();
        instance.loadData();
    }
    
}

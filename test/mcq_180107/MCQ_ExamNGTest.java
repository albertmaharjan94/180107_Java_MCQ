/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcq_180107;

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
public class MCQ_ExamNGTest {
    
    public MCQ_ExamNGTest() {
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
     * Test of setVar method, of class MCQ_Exam.
     */
    @Test
    public void testSetVar() throws Exception {
        System.out.println("setVar");
        String i = "2";
        String u = "albert";
        String uid = "3";
        MCQ_Exam instance = new MCQ_Exam();
        instance.setVar(i, u, uid);
    }

    /**
     * Test of main method, of class MCQ_Exam.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MCQ_Exam.main(args);
    }

    /**
     * Test of init method, of class MCQ_Exam.
     */
    @Test
    public void testInit() throws Exception {
        System.out.println("init");
        MCQ_Exam instance = new MCQ_Exam();
        instance.setVar("2", "albert", "3");
        instance.init();
    }

}

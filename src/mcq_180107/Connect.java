/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcq_180107;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.*;

/**
 *
 * @author albert
 */
public class Connect {
    
   static Connection con =null;
   public static    Connection getConnection()
    {
        try{  
        Class.forName("com.mysql.jdbc.Driver");  
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");  
        System.out.println("Database connected");
        }catch(Exception e){ 
            e.printStackTrace();
            System.out.println(e);

        }  
        return  con; 
    }
   public static ResultSet getResult(String s) throws SQLException        
   {
      
        Connection  con= getConnection();

        PreparedStatement stmt=con.prepareStatement(s);


        ResultSet rs=stmt.executeQuery(); 
        return rs;
    }
}


    
    
 
    
    
   
       
       
   
    
    
    
    

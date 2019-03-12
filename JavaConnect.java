/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaconnect;
import java.sql.*;

/**
 *
 * @author w1669293
 */
public class JavaConnect {
        
    /**
     * @param args the command line arguments
     */
   public static void main(String[] argv){
       Connection connection = null;
 
       try    // open the connection to the MySQL server
       {
          // this is for running on the University network, to elephant:3306; use a localhost tunnel if outside
          connection = DriverManager.getConnection(
                 "jdbc:mysql://elephant.ecs.westminster.ac.uk:3306/w1669293_0",
                 "w1669293", "R9I6h1bDantW");
 
          // connection = DriverManager.getConnection(       // connect through a local tunnel
          //         "jdbc:mysql://localhost:2222/w9999999_0",
          //          "w9999999", "MyMySQLPassWord");
 
       } catch (SQLException e)  // check for connection error
       {
          System.out.println("ERROR: MySQL Connection Failed!");
          e.printStackTrace();
          return;
       }
       System.out.println("Database connected!");
 
   }
}

    


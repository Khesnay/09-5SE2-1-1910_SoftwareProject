/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaconnect;
import java.io.*;
import java.sql.*;
import java.util.*;

/**
 *
 * @author w1669293
 */
public class JavaConnect {
        
    /**
     * @param args the command line arguments
     */
   public static void main(String[] argv) throws FileNotFoundException, IOException{
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
             FileInputStream fstream = new FileInputStream("C:\\Users\\w1669293\\Downloads\\Cape_Town.csv");
             DataInputStream in = new DataInputStream(fstream);
             BufferedReader br = new BufferedReader(new InputStreamReader(in));
             String strLine;
             ArrayList list = new ArrayList();
             while ((strLine = br.readLine()) != null) {
                //System.out.println("list"+list);
                list.add(strLine);
             }
           // Just displaying the file properly
             int count;
       for (count = 0; count < list.size(); count++) {
           int jump = count % 14;
               if (jump == 0) {
                   System.out.print(list.get(count)+"\n");
               } else {
                   System.out.println(list.get(count));
               }
       }
             
             
             
             Iterator itr;
            for (itr = list.iterator(); itr.hasNext();) {
                
                String str = itr.next().toString();
                String[] splitSt = str.split(",");
                String id = "", name = "", host_id = "", host_name = "", neighbourhood = "",latitude = "",longitude = "",room_type = "",price = "",minimum_nights = "",number_of_reviews = "",last_review = "",reviews_per_month = "",calculated_host_listings_count = "",availability_365 = "";
                for (int i = 0; i < splitSt.length; i++) {
                    id = splitSt[0];
                    name = splitSt[1];
                    host_id = splitSt[2];
                    host_name = splitSt[3];
                    neighbourhood = splitSt[4];
                    latitude = splitSt[5];
                    longitude = splitSt[6];
                    room_type = splitSt[7];
                    price = splitSt[8];
                    minimum_nights = splitSt[9];
                    number_of_reviews = splitSt[10];
                    last_review = splitSt[11];
                    reviews_per_month = splitSt[12];
                    calculated_host_listings_count = splitSt[13];
                    availability_365 = splitSt[14];
           
                }
              //System.out.println("sql execution"); FROM HERE PUSH INTO DATABASE

            }
        } 
    }



   


    

package ASimulatorSystem;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/client","root","Kch1992@123");    
            s =c.createStatement();
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  

package airlinemanagementsystem;

import java.sql.*;


public class Conn {
    
    Connection c;
    Statement s;
    
    //Contructor
    public Conn(){
        try{
            
            //Steps To JDBC cONNECTION
            //Step1 : Register the Driver
            //Download Jar File and find below Loctions
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Step2 : Create the Connection String
            c = DriverManager.getConnection("jdbc:mysql:///airlinemanagementsystem","root","k05137849@K");
            
            //Step 3: Create Statement
            s = c.createStatement(); 
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}

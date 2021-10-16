/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Db;

import java.sql.DriverManager;

/**
 *
 * @author Hp
 */

public class ConnectionDB {
     public static java.sql.Connection getConnection(){
        String url="jdbc:mysql://localhost:3306/billing_system";
        final String uname="root";
        final String pwd="";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection(url,uname,pwd);
            return con;
        }
        catch(Exception e){
            System.out.println(e);
            
        }
        return null;
    
}
    
}

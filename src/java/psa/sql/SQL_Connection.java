/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psa.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import com.mysql.jdbc.Driver;
/**
 *
 * @author TALGAT
 */
public class SQL_Connection {
    static final String DB_URL = "jdbc:mysql://localhost:3306/psa?zeroDateTimeBehavior=convertToNull";
    //static final String DB_URL = "jdbc:derby://localhost:1527/PSA";
    static final String USER = "pma";
    static final String PASS = "container";
    
    public Connection getConnection() {
        Connection connection = null;        
        try{          
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL,USER,PASS);          
        }catch(SQLException | ClassNotFoundException exception){
            exception.printStackTrace();
        }
         return connection;
    }
}

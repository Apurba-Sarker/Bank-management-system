package BankManagementSystem;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            //Class.forNamo(com.mysql.cj.jdbc.Driver);
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","Gudasira");
            s = c.createStatement();

        } catch (Exception e){
           System.out.println(e);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhaka
 */
import java.sql.*;
import javax.swing.*;
 
public class javaconnect {
    
    Connection con;
    public static Connection ConnectDb()
    {
        try{
              Class.forName("org.sqlite.JDBC");
                      Connection con;
            con = DriverManager.getConnection("jdbc:sqlite:E:\\java_project\\Library Management System\\LibraryNew2.sqlite");
                      return con;
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
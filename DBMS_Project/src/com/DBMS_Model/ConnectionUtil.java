/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.DBMS_Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Abdul Jabbar
 */
public class ConnectionUtil {
    static Connection con=null;
    private ConnectionUtil(){
        if(con==null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sw_depart1","root","root");
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println(ex);
            }
        }
    }
    public static Connection getConnection(){
        new ConnectionUtil();
        return con;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.registrationsystempmp.persistencia;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Matheus
 */
public class DBConnection {
    
    public Connection getconnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return 
                    (Connection) DriverManager.getConnection("jdbc:mysql://localhost/sistemapmp","root","");
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }catch(ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
    
}

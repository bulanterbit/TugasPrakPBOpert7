/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBconnect;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jaconiah
 */
public class Koneksi {
    private static Connection conn;
    
    public static Connection getConnection(){
        if(conn == null){
            try{
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db?user=root&password=");
            }catch (Exception e){
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, e);
                
            }
        }
        return conn;
    }
    
}

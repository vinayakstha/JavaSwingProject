/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;

/**
 *
 * @author Acer
 */
public class ConnectionProvider {
    public static Connection getCon(){
        Connection con = null;
        try{
//            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryProject", "root", "password");
            System.out.println("connected");
            return con;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}

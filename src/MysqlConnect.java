/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author ธนพล
 */
class MySqlConnect {
    Connection conn = null;
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/member2","root","123456"); //เชื่อมต่อ database โดยกำหนดให้เป็นแต่ละเครื่อง ตาม Username , password ของแต่ละเครื่อง
            //JOptionPane.showMessageDialog(null, "Connect to database");
            return conn;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}

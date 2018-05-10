/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class ketnoi {
     private Connection con;
    public ketnoi () {
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLBHang;user=sa;password=123");
        } catch (SQLException ex) {
            Logger.getLogger(ketnoi.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public Connection getConnection() {
        return con;
    }
    public static void main(String[] args) {
        ketnoi db= new ketnoi();
        Connection a = db.getConnection();
        if (a != null)
            System.out.println("Kết nối thành công!");
        else System.out.println("Kết nối không thành công, vui lòng kiểm tra lại!");
    }
    
}

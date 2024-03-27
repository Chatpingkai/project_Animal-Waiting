package backend;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Connec {
    public Connection con;
    public Statement stm;
    public ResultSet rs;
    public String url = "jdbc:mysql://sql6.freesqldatabase.com:3306/sql6693770";
    public String nameroot = "sql6693770";
    public String passwo = "tEbNPVrjWr";
    public Connec(){
        try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
            }
            con = DriverManager.getConnection(url,nameroot,passwo);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public ResultSet getConnec(String sql){
        try {
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }
    public void getInsert(String sql){
        try {
            stm = con.createStatement();
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
    public void discon(){
        try {
            stm.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    public static void main(String[] args) {
        Connec com = new Connec(); 
        com.getInsert("UPDATE mydb SET name = 'manza' where name = 'man'");
        com.discon();
   }
}

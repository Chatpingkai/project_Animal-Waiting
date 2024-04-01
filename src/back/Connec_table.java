
package back;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connec_table implements Connec{
    private Connection con;
    private Statement stm;
    public static ResultSet rs;
    public Connec_table(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(Connec_db.url,Connec_db.nameroot,Connec_db.password);
        } catch (ClassNotFoundException | SQLException ex) {
        }
    }
    @Override
    public ResultSet getData(String sql) {
        try {
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    @Override
    public void UpdateData(String sql) {
        try {
            stm = con.createStatement();
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public void Discon() {
        try {
            stm.close();
        } catch (SQLException ex) {
        }
        try {
            con.close();
        } catch (SQLException ex) {
        }
    }
    public void Connec_IN_Discon(Connec cn){
        cn.Discon();
    }
    public void Connec_In_Up(Connec cn,String sql){
        cn.UpdateData(sql);
    }
    public ResultSet Connec_In_Date(Connec cn,String sql){
        return cn.getData(sql);
    }
}

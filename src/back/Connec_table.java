
package back;

import java.sql.*;
import java.util.*;

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
        }
        return rs;
    }

    @Override
    public void UpdateData(String sql) {
        try {
            stm = con.createStatement();
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
        }
    }
    @Override
    public void Discon() {
        try {
            stm.close();
            con.close();
        } catch (SQLException ex) {
        }
    }
    
}

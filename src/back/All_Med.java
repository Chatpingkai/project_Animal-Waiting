package back;

import java.util.*;
import java.sql.*;
/**
 *
 * @author Panavat
 */
public class All_Med<t> {
    private ArrayList<t> a_med;
    public All_Med(){
        a_med = new ArrayList<t>();
        Connec_table tabledb = new Connec_table();
        String sql = "SELECT * FROM Med";
        ResultSet rs = tabledb.getData(sql);
        try {
            while (rs.next()) {
                String full_name = rs.getString("Full_Name");
                String recom = rs.getString("Recom");
                String how = rs.getString("How");
                double price = Double.parseDouble(rs.getString("Price"));
                int amount = Integer.parseInt(rs.getString("Amount"));
                String type = rs.getString("Type");
                String name = rs.getString("Name");
                a_med.add((t) new Med(full_name,name,type,amount,price,how,recom));
            }
        } catch (SQLException ex) {
        }
        tabledb.Discon();
    }
    public ArrayList<t> getA_med(){
        return a_med;
    }
}

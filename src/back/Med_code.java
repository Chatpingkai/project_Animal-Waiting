package back;
import java.sql.*;
/**
 *
 * @author Panavat
 */

public class Med_code extends Med{
    private String code_med;
    private double use;
    private Connec_table tabledb;
    public Med_code(Med med,String code_med, double use){
        super(med.getFullName(),med.getName(),med.getType(),med.getAmount(),med.getPrice(),med.getHow(),med.getRecom());
        this.code_med = code_med;
        this.use = use;
    }
    public String getMed_code(){
        return code_med;
    }
    public void setMed_code(String code_med){
        this.code_med = code_med;
    }
    public void setUse(double use){
        this.use = use;
    }
    public double getUse(){
        return use;
    }
    public void updateMed(){
        tabledb = new Connec_table();
        String sql = String.format("UPDATE Med SET Amount = '%s' where Full_name = '%s'", this.getAmount(),this.getFullName());
        tabledb.UpdateData(sql);
        tabledb.Discon();
        keepUseMed();
    }
    public void keepUseMed(){
        tabledb = new Connec_table();
        String sql = String.format("INSERT INTO Med_Code (Med_Code, Name, Amount, How) VALUES('%s', '%s', '%s', '%s')", this.code_med,this.getFullName(),this.use,this.getHow());
        tabledb.UpdateData(sql);
        tabledb.Discon();
    }
}

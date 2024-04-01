
package back;
import java.sql.*;
/**
 *
 * @author ENdDoWn
 */
public class GroomReipt extends Receipt{
    private String groom_code;
    private double cut;
    private double shower;
    private String date;
    private String details;
    public GroomReipt(Customer customer, String groom_code, String date){
        super(customer);
        this.groom_code = groom_code;
        this.cut= 0;
        this.shower = 0;
        this.date = date;
    }
    public void setGroom_code(String groom_code){
        this.groom_code = groom_code;
    }
    
    public String getGroom_code(){
        return groom_code;
    }
    
    public void setCut(double cut) {
        this.cut = cut;
    }
    
    public void setDate(String date){
        this.date = date;
    }
    public String getDate(){
        return date;
    }
    public void setDetails(String details){
        this.details = details;
    }
    public String getDetails(){
        return details;
    }
    public void setShower(double shower) {
        this.shower = shower;
    }

    public double getCut() {
        return cut;
    }

    public double getShower() {
        return shower;
    }
    @Override
    public void setAllprice() {
        allprice = cut+shower;
    }

    @Override
    public void updatedb() {
        Connec_table tabledb = new Connec_table();
        String sql = String.format("INSERT INTO Groomer (Type_Code, Recom, Cut, Shower) VALUES('%s', '%s', '%.2f', '%.2f')", groom_code,details,cut,shower);
        tabledb.UpdateData(sql);
        tabledb.Discon();
    }
    
}

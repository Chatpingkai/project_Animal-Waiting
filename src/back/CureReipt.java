
package back;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ENdDoWn
 */
public class CureReipt extends Receipt{
    private String type_code;
    private String date;
    private String veterinary;
    private String symptom;
    private String diagnose;
    private String cure;
    private ArrayList<Med_code> code_med;
    private String recom;
    private String ohter;
    private double p_med;
    private double p_veter;
    private double p_help;
    private double p_disease;
    private double p_cure;
    public CureReipt(Customer customer, String type_code ,String date) {
        super(customer);
        this.type_code = type_code;
        this.date = date;
        this.veterinary = "";
        this.symptom = "";
        this.diagnose = "";
        this.cure = "";
        this.p_med = 0;
        this.p_veter = 0;
        this.p_help = 0;
        this.p_disease = 0;
        this.p_cure = 0;
        this.ohter = "";
        this.recom = "";
        this.code_med = new ArrayList<Med_code>();
    }
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }
    public void setType_code(String type_code){
        this.type_code = type_code;
    }
    
    public String getType_code(){
        return this.type_code;
    }
    
     public void setVeterinary(String veterinary) {
        this.veterinary = veterinary;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public void setCure(String cure) {
        this.cure = cure;
    }

    public void setP_med(double p_med) {
        this.p_med = p_med;
    }

    public void setP_veter(double p_veter) {
        this.p_veter = p_veter;
    }

    public void setP_help(double p_help) {
        this.p_help = p_help;
    }

    public void setP_disease(double p_disease) {
        this.p_disease = p_disease;
    }

    public void setP_cure(double p_cure) {
        this.p_cure = p_cure;
    }

    public String getVeterinary() {
        return veterinary;
    }

    public String getSymptom() {
        return symptom;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public String getCure() {
        return cure;
    }

    public double getP_med() {
        return p_med;
    }

    public double getP_veter() {
        return p_veter;
    }

    public double getP_help() {
        return p_help;
    }

    public double getP_disease() {
        return p_disease;
    }

    public double getP_cure() {
        return p_cure;
    }
    
    public ArrayList<Med_code> getCode_med() {
        return code_med;
    }

    public void setCode_med(ArrayList<Med_code> code_med) {
        this.code_med = code_med;
    }
    public void setOther(String other) {
        this.ohter = other;
    }
    public String getOther() {
        return ohter;
    }
    public void setRecom(String recom) {
        this.recom = recom;
    }
    public String getRecom() {
        return recom;
    }
    @Override
    public void updatedb(){
        String s = "";
        for(Med_code code: code_med){
            s += code.getMed_code()+"0";
            code.updateMed();
        }
        Connec_table tabledb = new Connec_table();
        System.out.println(s);
        String sql = String.format("INSERT INTO Cure (Type_Code, Veterinary, Symptom, Diagnose, Cure, Med_Code, Price_Med, Price_Veter, Price_Help, Price_Disease, Price_Cure, Recom, Other) "
                + "VALUES('%s', '%s', '%s', '%s', '%s', '%s', %.2f, %.2f, %.2f, %.2f, %.2f, '%s', '%s')", 
                this.type_code,
                this.veterinary,
                this.symptom,
                this.diagnose,
                this.cure,
                s,
                this.p_med,
                this.p_veter,
                this.p_help,
                this.p_disease,
                this.p_cure,
                this.recom,
                this.ohter);
        tabledb.UpdateData(sql);
//        System.out.println("YourClassName{" +
//                "type_code='" + type_code + '\'' +
//                ", date='" + date + '\'' +
//                ", veterinary='" + veterinary + '\'' +
//                ", symptom='" + symptom + '\'' +
//                ", diagnose='" + diagnose + '\'' +
//                ", cure='" + cure + '\'' +
//                ", code_med=" + code_med +
//                ", recom='" + recom + '\'' +
//                ", other='" + ohter + '\'' +
//                ", p_med=" + p_med +
//                ", p_veter=" + p_veter +
//                ", p_help=" + p_help +
//                ", p_disease=" + p_disease +
//                ", p_cure=" + p_cure +
//                '}');
        tabledb.Discon();
    }
    @Override
    public void setAllprice() {
        allprice = p_med+p_veter+p_help+p_disease+p_disease+p_cure;
    }
    public void setData(){
        Connec_table tabledb = new Connec_table();
        String sql = String.format("select * from Cure Where Type_Code = '%s'", type_code);
        ResultSet rs = tabledb.getData(sql);
        try {
            if (rs.next()) {
                this.veterinary = rs.getString("Veterinary");
                this.symptom = rs.getString("Symptom");
                this.diagnose = rs.getString("Diagnose");
                this.cure = rs.getString("Cure");
                this.p_med = rs.getDouble("Price_Med");
                this.p_veter = rs.getDouble("Price_Veter");
                this.p_help = rs.getDouble("Price_Help");
                this.p_disease = rs.getDouble("Price_Disease");
                this.p_cure = rs.getDouble("Price_Cure");
                this.recom = rs.getString("Recom");
                this.ohter = rs.getString("Other");
            }
        } catch (SQLException ex) {
        }
        finally{
            tabledb.Discon();
        }
    }
   public void setReceipt(Receipt r){
        this.setCustomer(r.getCustomer());
        this.allprice = r.getAllprice();
    }
    
}

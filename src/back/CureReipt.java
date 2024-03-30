
package back;

import java.util.*;

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
    private double p_med;
    private double p_veter;
    private double p_help;
    private double p_disease;
    private double p_cure;
    private ArrayList<Med_code> code_med;
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
    @Override
    public void setAllprice() {
        allprice = p_med+p_veter+p_help+p_disease+p_disease+p_cure;
    }
    
    
}

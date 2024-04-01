package back;
import java.security.*;
import java.sql.*;
import java.util.*;

public class Customer extends Account{
    private String first_name;
    private String last_name;
    private String b_name;
    private String sex;
    private String nation;
    private String ethnicity;
    private String religion;
    private String address;
    private String phoneNumber;
    private String email;
    private String other;
    private Pet pet;
    private Connec_table db;
    public Customer(){
        super();
        first_name = "";
        last_name = "";
        sex = "";
        nation = "";
        ethnicity = "";
        religion = "";
        pet = null;
    }
    public Customer(int id_){
        super(id_);
        db = new Connec_table();
        String sql = String.format("SELECT * FROM User_id WHERE ID = '%d'", id);
        ResultSet rs = db.getData(sql);
        try {
            if(rs.next()){
                try {
                    String user = rs.getString("username");
                    String pass = rs.getString("password");
                    this.username = user;
                    this.password = pass;
                } catch (SQLException ex) {
                }
            }
        } catch (SQLException ex) {
        }
        sql = String.format("SELECT * FROM User_Profile WHERE ID = '%d'", id);
        rs = db.getData(sql);
        try {
            if(rs.next()){
                try {
                    this.first_name = rs.getString("Name");
                    this.last_name = rs.getString("Last");
                    this.b_name = rs.getString("B_name");
                    this.sex = rs.getString("Sex");
                    this.nation = rs.getString("Nation");
                    this.ethnicity = rs.getString("Ethnicity");
                    this.religion = rs.getString("Religion");
                    this.address = rs.getString("Contact");
                    this.phoneNumber = rs.getString("Phone");
                    this.email = rs.getString("Email");
                    this.other = rs.getString("Other");
                } catch (SQLException ex) {
                }
            }
        } catch (SQLException ex) {
        }
        this.pet = new Pet(id_);
        db.Discon();
    }
    public String getFirstName(){
        return first_name;
    }
    public void setFirstName(String firstname){
        this.first_name = firstname;
    }
    public String getLastName(){
        return last_name;
    }
    public void setLastName(String lastname){
        this.last_name = lastname;
    }
    public String getb_name(){
        return b_name;
    }
    public void setb_name(String b_name){
        this.b_name = b_name;
    }
    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public String getNation(){
        return nation;
    }
    public void setNation(String nation){
        this.nation = nation;
    }
    public String getEthnicity(){
        return ethnicity;
    }
    public void setEthnicity(String ethnicity){
        this.ethnicity = ethnicity;
    }
    public String getReligion(){
        return religion;
    }
    public void setReligion(String religion){
        this.religion = religion;
    }
    public Pet getPet(){
        return pet;
    }
    public void setPet(Pet pet){
        this.pet = pet;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    
    public void reserve(String date, String time, String type){
        try{
            db = new Connec_table();
            String sql = String.format("INSERT INTO Reserve (ID, Date, Time, Type, Details) VALUES('%s', '%s', '%s', '%s', '%s')", id,date, time, type, "ไม่มีรายละเอียด");
            db.UpdateData(sql);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            db.Discon();
        }
    }
    public void reserve(String date, String time, String type, String detail){
        try{
            db = new Connec_table();
            String sql = String.format("INSERT INTO Reserve (ID, Date, Time, Type, Details) VALUES('%s', '%s', '%s', '%s', '%s')", id,date, time, type, detail);
            db.UpdateData(sql);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            db.Discon();
        }
    }
}

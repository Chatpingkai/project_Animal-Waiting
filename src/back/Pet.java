package back;
import java.security.*;
import java.sql.*;
import java.util.*;

public class Pet {
    private String name;
    private String type;
    private String spicies;
    private String birth;
    private String sex;
    private String disease;
    private String age;
    private double weight;
    private String treat;
    private String place;
    private Connec_table db;
    public Pet(){
        name = "";
        type = "";
        spicies = "";
        birth = "";
        sex = "";
        disease = "";
        age = "";
        weight = 0;
        treat = "";
        place = "";
    }
    public Pet(int id_){
        db = new Connec_table();
        String sql = String.format("SELECT * FROM Pet WHERE ID = '%d'", id_);
        ResultSet rs = db.getData(sql);
        try {
            if(rs.next()){
                try {
                    this.name = rs.getString("Name");
                    this.type = rs.getString("Type");
                    this.spicies = rs.getString("Spicies");
                    this.birth = rs.getString("Birth");
                    this.sex = rs.getString("Sex");
                    this.disease = rs.getString("Disease");
                    this.age = rs.getString("Age");
                    this.weight = rs.getInt("Weight");
                    this.treat = rs.getString("Treat");
                    this.place = rs.getString("Place");
                    
                } catch (SQLException ex) {
                }
            }
        } catch (SQLException ex) {
        }
        db.Discon();
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getSpicies(){
        return spicies;
    }
    public void setSpicies(String spicies){
        this.spicies = spicies;
    }
    public String getBirth(){
        return birth;
    }
    public void setBirth(String birth){
        this.birth = birth;
    }
    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public String getDisease(){
        return disease;
    }
    public void setdisease(String disease){
        this.disease = disease;
    }
    public String getAge(){
        return age;
    }
    public void setAge(String age){
        this.age = age;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public String getTreat(){
        return treat;
    }
    public void setTreat(String treat){
        this.treat = treat;
    }
    public String getPlace(){
        return place;
    }
    public void setPlace(String place){
        this.place = place;
    }
}

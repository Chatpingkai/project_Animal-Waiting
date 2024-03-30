
package back;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ENdDoWn
 */
public class RegisterBackend {
    //owner
    private String nameTitle;
    private String name;
    private String lastname;
    private String ethnicity;
    private String nationality;
    private String religion;
    private String sex;
    //pet
    private String petName;
    private String petType;
    private String breed;
    private String petSex;
    private String petBirthday;
    private double petWeight;
    private String chronicDisease;
    private int ageYear;
    private int ageMonth;
    private String animalHusbandry;
    private String place;
    //address
    private String address;
    private String alley;
    private String swine;
    private String roadName;
    private String subDistrict;
    private String subArea;
    private String area;
    private String postCode;
    private String phoneNumber;
    private String email;
    private String note;
    //username password
    private String username;
    private String password;
    private String hashPass;
    
    public RegisterBackend(String nameTitle, String name, String lastname, String ethnicity, String nationality, String religion, String sex, String petName, String petType, String breed, String petSex, String petBirthday, double petWeight, String chronicDisease, int ageYear, int ageMonth, String animalHusbandry, String place, String address, String alley, String swine, String roadName, String subDistrict, String subArea, String area, String postCode, String phoneNumber, String email, String note, String username, String password) {
        this.nameTitle = nameTitle;
        this.name = name;
        this.lastname = lastname;
        this.ethnicity = ethnicity;
        this.nationality = nationality;
        this.religion = religion;
        this.sex = sex;
        this.petName = petName;
        this.petType = petType;
        this.breed = breed;
        this.petSex = petSex;
        this.petBirthday = petBirthday;
        this.petWeight = petWeight;
        this.chronicDisease = chronicDisease;
        this.ageYear = ageYear;
        this.ageMonth = ageMonth;
        this.animalHusbandry = animalHusbandry;
        this.place = place;
        this.address = address;
        this.alley = alley;
        this.swine = swine;
        this.roadName = roadName;
        this.subDistrict = subDistrict;
        this.subArea = subArea;
        this.area = area;
        this.postCode = postCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.note = note;
        this.username = username;
        this.password = password;
    }
    
    public String hash(String p) {
        try {
            MessageDigest md;
            md = MessageDigest.getInstance("SHA-256");
            md.update(p.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bytes) {
                sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1)); 
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            return null;
        }
    }
    
    public void writeDB() {
        //Table User_id
        hashPass = this.hash(this.password);
        String sql = String.format("INSERT INTO User_id (username, password) VALUES('%s', '%s')",this.username, hashPass);
        String get = String.format("SELECT * FROM User_id WHERE username = '%s'", username);
        Connec_table ct = new Connec_table();
        int id = 0;
        ct.UpdateData(sql); //===========================================================================================
        try {
            ResultSet rs = ct.getData(get);
            System.out.println(rs.next());
            id = Integer.parseInt(rs.getString("id"));
            System.out.println("Yes id = "+id);
        } catch (SQLException ex) {}
        System.out.println(id);
        ct.Discon();
        
        //Table User_Profile
        Connec_table ctPro = new Connec_table();
        String getID = String.format("SELECT * FROM User_Profile WHERE ID = '%s'", id);
        try {
            ResultSet rs = ctPro.getData(getID);
            System.out.println(rs.next());
            System.out.println(rs.getString("ID").getClass());
            String update = String.format(
                "UPDATE User_Profile SET Name = '%s', Last = '%s', B_name = '%s', Sex = '%s', Nation = '%s', Ethnicity = '%s', Religion = '%s', Contact = '%s', Phone = '%s', Email = '%s', Other = '%s' WHERE ID = '%d'",
                name, lastname, nameTitle, sex, nationality, ethnicity, religion, address, phoneNumber, email, note, id);
            ctPro.UpdateData(update);
            System.out.println("Updated");
        } catch (SQLException ex) {
            String insert = String.format(
                "INSERT INTO User_Profile (Name, Last, B_name, Sex, Nation, Ethnicity, Religion, Contact, Phone, Email, Other, ID) VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%d')",
                name, lastname, nameTitle, sex, nationality, ethnicity, religion, address, phoneNumber, email, note, id);
            ctPro.UpdateData(insert);
            System.out.println("Inserted");
        }
        ctPro.Discon();
    }
}

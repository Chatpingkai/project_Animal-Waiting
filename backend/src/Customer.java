
public class Customer {
    private Account acct;
    private String first_name;
    private String last_name;
    private String b_name;
    private String sex;
    private String nation;
    private String ethnicity;
    private String religion;
    private Pet pet;
    private Connec db;
    public Customer(){
        acct = null;
        first_name = "";
        last_name = "";
        sex = "";
        nation = "";
        ethnicity = "";
        religion = "";
        pet = null;
    }
    public Account getAccount(){
        return acct;
    }
    public void setAccount(Account acct){
        this.acct = acct;
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

    
    
    
    
    public void reserve(String date, String time, String type){
        try{
            db = new Connec();
            String sql = String.format("INSERT INTO reserve (Date, Time, Type) VALUES('%s', '%s', '%s')", date, time, type);
            db.getInsert(sql);
            db.discon();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void reserve(String date, String time, String type, String detail){
        try{
            db = new Connec();
            String sql = String.format("INSERT INTO reserve (Date, Time, Type, detail) VALUES('%s', '%s', '%s', '%s')", date, time, type, detail);
            db.getInsert(sql);
            db.discon();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

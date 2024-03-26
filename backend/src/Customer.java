
public class Customer {
    public Account acct;
    public int id;
    public String first_name;
    public String last_name;
    public String b_name;
    public String sex;
    public String nation;
    public String ethnicity;
    public String religion;
    public Pet pet;
    public Customer(){
        acct = new Account();
        first_name = "";
        last_name = "";
        sex = "";
        nation = "";
        ethnicity = "";
        religion = "";
        pet = new Pet();
    }
}

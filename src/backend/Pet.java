package backend;


public class Pet {
    private String name;
    private String type;
    private String spicies;
    private String birth;
    private String sex;
    private String disease;
    private int age;
    private double weight;
    private String treat;
    private String place;
    public Pet(){
        name = "";
        type = "";
        spicies = "";
        birth = "";
        sex = "";
        disease = "";
        age = 0;
        weight = 0;
        treat = "";
        place = "";
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
    public int getAge(){
        return age;
    }
    public void setAge(int age){
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

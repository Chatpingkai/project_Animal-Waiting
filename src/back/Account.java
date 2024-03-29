package back;


public class Account {
    protected int id;
    protected String username;
    protected String password;
    public Account(){
        id = 0;
        username = "";
        password = "";
    }
    public Account(int id){
        this.id = id;
        username = "";
        password = "";
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}

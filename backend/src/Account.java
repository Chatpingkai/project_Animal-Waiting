
public class Account {
    private int id_c;
    private String username;
    private String password;
    public Account(){
        id_c = 0;
        username = "";
        password = "";
    }
    public Account(int id_c, String username, String password){
        this.id_c = id_c;
        this.username = username;
        this.password = password;
    }
    public int getID(){
        return this.id_c;
    }
    public void setID(int id_c){
        this.id_c = id_c;
    }
}

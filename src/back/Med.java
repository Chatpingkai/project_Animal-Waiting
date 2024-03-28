
package back;

/**
 *
 * @author ENdDoWn
 */
public class Med {
    private String fullName;
    private String name;
    private String type;
    private double amount;
    private double price;
    private String how;
    private String recom;
    
    public Med() {
        this("", "", "", 0.0, 0.0, "", "");
    }
    
    public Med(String fullname, String name, String type, double amount, double price, String how, String recom) {
        this.fullName = fullname;
        this.name = name;
        this.type = type;
        this.amount = amount;
        this.price = price;
        this.how = how;
        this.recom = recom;
    }
    
    public String getFullName() {
        return this.fullName;
    }
    
    public void setFullName(String fullname) {
        this.fullName = fullname;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public double getAmount() {
        return this.amount;
    }
    
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public String getHow() {
        return this.how;
    }
    
    public void setHow(String how) {
        this.how = how;
    }
    
    public String getRecom() {
        return this.recom;
    }
    
    public void setRecom(String recom) {
        this.recom = recom;
    }
}

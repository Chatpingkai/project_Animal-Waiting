package back;


/**
 *
 * @author ENdDoWn
 */
public class Contact {
    
    private String address;
    private String phoneNumber;

    public Contact() {
        this("", "");
    }

    public Contact(String address, String num) {
        this.address = address;
        this.phoneNumber = num;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setPhoneNumber(String num) {
        this.phoneNumber = num;
    }
}

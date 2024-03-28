
package back;

/**
 *
 * @author ENdDoWn
 */
import java.util.ArrayList;
public class aRecord<type> {
    private ArrayList<type> allrecord;
    private ArrayList<type> allpayment;
    
    public ArrayList<type> getAllrecord() {
        return this.allrecord;
    }
    
    public void setAllrecord(ArrayList<type> record) {
        this.allrecord = record;
    }
    
    public ArrayList<type> getAllpayment() {
        return this.allpayment;
    }
    
    public void setAllpayment(ArrayList<type> payment) {
        this.allpayment = payment;
    }
}

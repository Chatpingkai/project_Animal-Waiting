
package back;

/**
 *
 * @author ENdDoWn
 */
public class Record_cure {
    //private <type> date; <-- unknow type :(
    private static final String TYPE = null;
    private String details;
    
    public Record_cure(String detail) {
        this.details = detail;
    }
//    public <type> getDate() {
//    
//    }
//    public void setDate(<type> date) {
//        this.date = date;
//    }
    
    public String getType() {
        return Record_cure.TYPE;
    }
    
    public String getDetails() {
        return this.details;
    }
    
    public void setDetails(String detail) {
        this.details = detail;
    }
}

package back;

/**
 *
 * @author Panavat
 */
public class Med_code extends Med{
    private String code_med;
    public Med_code(Med med,String code_med){
        super(med.getFullName(),med.getName(),med.getType(),med.getAmount(),med.getPrice(),med.getHow(),med.getRecom());
        this.code_med = code_med;
    }
    public String getMed_code(){
        return code_med;
    }
    public void setMed_code(String code_med){
        this.code_med = code_med;
    }
    public void updateMed(){
        
    }
    public void keepUseMed(){
        
    }
}

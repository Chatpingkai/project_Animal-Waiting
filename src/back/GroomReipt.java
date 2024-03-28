
package back;

/**
 *
 * @author ENdDoWn
 */
public class GroomReipt extends Receipt{
    private double cutting;
    private double shower;
    public GroomReipt(Customer customer){
        super(customer);
        this.cutting = 0;
        this.shower = 0;
    }
    public void setCutting(double cutting) {
        this.cutting = cutting;
    }

    public void setShower(double shower) {
        this.shower = shower;
    }

    public double getCutting() {
        return cutting;
    }

    public double getShower() {
        return shower;
    }
    @Override
    public void setAllprice() {
        allprice = cutting+shower;
    }
    
}


package back;

/**
 *
 * @author ENdDoWn
 */
public abstract class Receipt {
    private Customer customer;
    protected double allprice;
    public Receipt(Customer customer){
        this.customer = customer;
        this.allprice = 0;
    }
    public Receipt(Customer customer, double allprice){
        this.customer = customer;
        this.allprice = allprice;
    }
    public Customer getCustomer(){
        return customer;
    }
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    public double getAllprice(){
        return allprice;
    }
    public abstract void setAllprice();
    public abstract void updatedb();
}

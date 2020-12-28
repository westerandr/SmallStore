import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Order here.
 *
 * @author Andre Westerlund
 * @version 19/12/2020
 */
public class Order
{
    private int orderNum;
    private String customer;
    private String timeExpected;
    private boolean paid;
    private List<Plate> plates;
    private String dateTime;
    private Status currentStatus;
    
    enum Status {
        NOT_READY,
        DELIVERED
    }
    
    /**
     * Constructor for objects of class Order
     */
    public Order(int orderNum, boolean paid)
    {
        this.orderNum = this.orderNum;
        this.paid = this.paid;
        this.plates = new ArrayList<Plate>();
        this.dateTime = Constants.getDateTimeNowFormatted();
        this.currentStatus = Status.NOT_READY;
    }
    
    /**
     * Constructor for Phone Orders
     */
    public Order(int orderNum, String customer, String timeExpected)
    {
        this.orderNum = this.orderNum;
        this.paid = false;
        this.plates = new ArrayList<Plate>();
        this.dateTime = Constants.getDateTimeNowFormatted();
        this.currentStatus = Status.NOT_READY;
        this.customer = customer;
        this.timeExpected = timeExpected;
    }
    
    
    public void addPlate(Plate p){
        this.plates.add(p);
    }
    
    public void removePlate(Plate p){
        this.plates.remove(p);
    }
    
    public double getTotalCost(){
        double amt = 0;
        for(int i = 0; i < this.plates.size(); i++){
            amt += this.plates.get(i).getPrice();
        }
        return amt;
    }
    
    public void payOrder(){
        this.paid = true;
    }
    
    public int getOrderNumber(){
        return this.orderNum;
    }
    
    public int getNumberOfPlates(){
        return this.plates.size();
    }
    
    public String getOrderDateTime(){
        return this.dateTime;
    }
    
    public boolean orderDelivered(){
        this.currentStatus = Status.DELIVERED;
        return true;
    }    

}

import java.util.*;
/**
 * Write a description of class Store here.
 *
 * @author Andre Westerlund
 * @version 19/12/2020
 */
public class Store
{
    // 1 Hour = 3600000 MS
    private double cash;
    private double cashStartedWith;
    private long shopStartTime;
    private long shopEndTime;
    private double shopDebtAmt;
    private String currentDate;
    private boolean isRunning;
    //queue of orders
    Queue<Order> orders;
    
    //list of phone orders
    List<Order> phoneOrders;
    
    //list of delivered orders
    List<Order> deliveredOrders;
    
    //stats variables
    public double profit;
    public int platesSold;
    public double sessionDuration;
    public int numPhoneOrders;
    
    /**
     * Constructor for objects of class Store
     */
    public Store(double cash)
    {
        // initialise instance variables
        this.isRunning = false;
        this.cash = cash;
        this.cashStartedWith = cash;        
    }
    
    //start shop
    public void open(){
        this.isRunning = true;
        this.shopStartTime = System.currentTimeMillis();
        this.shopDebtAmt = 0;
        this.currentDate = Constants.getDateNowFormatted();
        orders = new LinkedList<Order>();
        phoneOrders = new ArrayList<Order>();
        deliveredOrders = new ArrayList<Order>();
    }
    //close shop
    public void close(){
        this.isRunning = false;
        this.shopEndTime = System.currentTimeMillis();
        this.profit = this.cash - this.shopDebtAmt;
        this.sessionDuration = getHoursSinceShopStart();
    }
    
    //add order
    public void addOrder(Order order){
        this.orders.add(order);
    }
    
    //add phone order
    public void addPhoneOrder(Order order){
        this.phoneOrders.add(order);
    }
    //deliver order
    public void deliverOrder(){
        Order o = this.orders.peek();
        o.orderDelivered();
        this.orders.remove();
    }
    
    //deliver phone order
    public void deliverPhoneOrder(int orderNum){
        for(int i = 0; i < this.phoneOrders.size(); i++){
            int orderNumber = this.phoneOrders.get(i).getOrderNumber();
            if(orderNumber == orderNum){
                this.phoneOrders.get(i).orderDelivered();
            }
        }
    }
    
    public double getHoursSinceShopStart(){
        return (System.currentTimeMillis() - this.shopStartTime)/Constants.MS_TO_HOUR_UNIT;
    }
    
    public void setShopDebtAmount(double amt){
        this.shopDebtAmt = amt;        
    }

}

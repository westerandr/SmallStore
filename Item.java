
/**
 * Write a description of class Item here.
 *
 * @author Andre Westerlund
 * @version 19/12/2020
 */
public class Item
{
    // instance variables - replace the example below with your own
    private double price;
    private String name;
    private int quantity;

    /**
     * Constructor for objects of class Item
     */
    public Item(String name, double price)
    {
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }

    public Item(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = this.quantity;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void incrementQuantity(){
        this.quantity +=1;
    }

    public void decrementQuantity(){
        this.quantity -=1;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double newPrice)
    {
        this.price = newPrice;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }
}
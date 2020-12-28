import java.util.*;
/**
 * Write a description of class Plate here.
 *
 * @author Andre Westerlund
 * @version 19/12/2020
 */
public class Plate
{
    private double price;
    private double sellingPrice;
    private String name;
    private List<Item> items;

    /**
     * Constructor for objects of class Plate
     */
    public Plate(String name, double price)
    {
        this.name = name;
        this.price = price;
        this.sellingPrice = price;
        this.items = new ArrayList<Item>();
    }

    public static Plate createMamoePlate(boolean rice){
        Plate p = new Plate(Constants.MAMOE_PLATE_NAME,12);
        if(rice){
            p.addItem(new Item("Rice",Constants.RICE_PRICE));
        }else{
            p.addItem(new Item("Fa'i",Constants.FAI_PRICE));
        }
        p.addItem(new Item("Pasta",Constants.PASTA_PRICE));//get real price for Pasta
        p.addItem(new Item("Sausage",Constants.SAUSAGE_PRICE));
        p.addItem(new Item("Chicken",Constants.CHICKEN_PRICE,2));
        p.addItem(new Item("Mamoe",Constants.MAMOE_PRICE));
        return p;
    }

    public static Plate createBasicPlate(boolean rice, boolean justChicken){
        Plate p = new Plate(justChicken?Constants.CHICKEN_PLATE_NAME:Constants.PIPI_PLATE_NAME,Constants.BASIC_PLATE_PRICE);
        if(rice){
            p.addItem(new Item("Rice",Constants.RICE_PRICE));
        }else{
            p.addItem(new Item("Fa'i",Constants.FAI_PRICE));
        }

        if(justChicken){
            p.addItem(new Item("Chicken",Constants.CHICKEN_PRICE,3));
        }else{
            p.addItem(new Item("Turkey Tail",Constants.PIPI_PRICE));
            p.addItem(new Item("Chicken",Constants.CHICKEN_PRICE,2));
        }
        p.addItem(new Item("Pasta",Constants.PASTA_PRICE));
        p.addItem(new Item("Sausage",Constants.SAUSAGE_PRICE));
        return p;
    }
    
    public double getSellingPrice(){
        return this.sellingPrice;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double newPrice)
    {
        this.sellingPrice = newPrice;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

}

import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
/**
 * Write a description of class Constants here.
 *
 * @author Andre Westerlund
 * @version 19/12/2020
 */
public class Constants
{
    //plate constants
    public static final String MAMOE_PLATE_NAME = "Mamoe Plate";
    public static final String PIPI_PLATE_NAME = "Pipi(Turkey Tail) Plate";
    public static final String CHICKEN_PLATE_NAME = "Chicken Plate";
    public static final int MAMOE_PLATE_PRICE = 12;
    public static final int BASIC_PLATE_PRICE = 10;
    
    //item constants
    public static final int MAMOE_PRICE = 5;
    public static final int PIPI_PRICE = 4;
    public static final int CHICKEN_PRICE = 3;
    public static final int SAUSAGE_PRICE = 1;    
    public static final int PASTA_PRICE = 2;
    public static final int RICE_PRICE = 1;
    public static final int FAI_PRICE = 1;
    
    //MISC
    public static final int MS_TO_HOUR_UNIT = 3600000;
    
    public static String getDateTimeNowFormatted(){
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        return formattedDate;
    }
    
    public static String getDateNowFormatted(){
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = myDateObj.format(myFormatObj);
        return formattedDate;
    }
}

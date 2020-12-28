import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class StoreGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StoreGUI
{
    private Store store;
    private JFrame mainContainer;
    
    public StoreGUI(Store store){
       this.store = store;
       this.mainContainer = new JFrame("Richard's BBQ");
       
    }
    
    public void setupMainContainer(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int)(screenSize.getWidth());
        int height = (int)(screenSize.getHeight());
        this.mainContainer.setSize(width - 300, height - 300);
        this.mainContainer.setVisible(true);
        
        //setup layout
    }
    
    public static void main(String[] args){
        Store store = new Store(0);
        StoreGUI gui = new StoreGUI(store);
        gui.setupMainContainer();
    }
    
}

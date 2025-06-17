import java.awt.*;
public class MenuDemo extends Frame 
{
    public MenuDemo()
    {
        MenuBar mBar=new MenuBar();
        setMenuBar(mBar); // Add MenuBar to Frame
        Menu files = new Menu ();
        Menu exit = new Menu();
        mBar.add(files);
        mBar.add(exit);
        setTitle("Menu Demo");
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MenuDemo();
    }
}

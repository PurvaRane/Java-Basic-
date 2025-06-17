import java.awt.*;
public class MenusDemo extends Frame 
{
    public MenusDemo(String s)
    {
        MenuBar mBar = new MenuBar();
        setMenuBar(mBar);
        Menu files = new Menu();
        Menu exit = new Menu();
        mBar.add(files);
        mBar.add(exit);
        MenuItem mi1 = new MenuItem();
        

    }
}

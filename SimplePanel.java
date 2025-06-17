
import java.awt.*;
public class SimplePanel 
{
    SimplePanel()
    {
    Frame f=new Frame("Panel Example");
    Panel panel=new Panel();
    panel.setBounds(40,80,200,200);
    panel.setBackground(Color.gray);
    f.add(panel);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
    
    }
    public static void main(String[] args) {
        SimplePanel f=new SimplePanel();
    }
}

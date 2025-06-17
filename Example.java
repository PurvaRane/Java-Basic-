import javax.swing.*;
import java.awt.*;

public class Example 
{
    JFrame f;
    JLabel l;
    JButton b,b1;
    Example()
    {
        f=new JFrame(" Heyyy");
       
        l= new JLabel();
        l.setBounds(200,50,40,80);
        l.add(f);

        b= new JButton("Click Me ");
        b.setBounds(100,60,50,40);
        b.add(f);

        b1=new JButton("Close");
        b1.setBounds(150,80,60,50);
        b1.add(f);

         f.setSize(500,300);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
    }
    public static void main(String[] args) {
        Example e = new Example();
    }

}

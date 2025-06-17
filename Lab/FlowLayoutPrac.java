import javax.swing.*;
import java.awt.*;

public class FlowLayoutPrac extends JFrame {
    FlowLayoutPrac(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,600,300);
        Container c=getContentPane();

        JButton b1=new JButton("Purva 1");
        JButton b2=new JButton("Purva 2");
        JButton b3=new JButton("Purva 3");
        JButton b4=new JButton("Purva 4");
        JButton b5=new JButton("Purva 5");

        c.add(b1);c.add(b2);c.add(b3);c.add(b4);c.add(b5);
        FlowLayout f=new FlowLayout(FlowLayout.CENTER);
        c.setLayout(f);
    }
    public static void main(String[] args) {
        FlowLayoutPrac f = new FlowLayoutPrac();

    }


}

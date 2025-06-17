import javax.swing.*;
import java.awt.*;

public class GridLayoutPrac extends JFrame{
    GridLayoutPrac(){
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100,100,600,300);
    Container c=getContentPane();
        JButton b1=new JButton("Purva 1");
        JButton b2=new JButton("Purva 2");
        JButton b3=new JButton("Purva 3");
        JButton b4=new JButton("Purva 4");
        JButton b5=new JButton("Purva 5");
        JButton b6=new JButton("Purva 6");
        JButton b7=new JButton("Purva 7");
        JButton b8=new JButton("Purva 8");
        JButton b9=new JButton("Purva 9");
        c.add(b1);c.add(b2);c.add(b3);c.add(b4);c.add(b5);c.add(b6);c.add(b7);c.add(b8);c.add(b9);
        GridLayout g=new GridLayout(3,3);
        c.setLayout(g);
        
    }
    public static void main(String[] args) {
        GridLayoutPrac g =new GridLayoutPrac();
    }
}

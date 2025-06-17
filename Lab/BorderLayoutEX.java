
import javax.swing.*;
import java.awt.*;
public class BorderLayoutEX extends JFrame {
    BorderLayoutEX(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,600,300);
        Container c=getContentPane();

       BorderLayout borderLayout=new BorderLayout();
        c.setLayout(borderLayout);
        JButton b1=new JButton("Purva");
        JButton b2=new JButton("Swara");
        JButton b3=new JButton("Swarali");
        JButton b4=new JButton("Shruti");
        JButton b5=new JButton("Vedika");

        c.add(b1,BorderLayout.NORTH);
        c.add(b2,BorderLayout.SOUTH);
        c.add(b3,BorderLayout.WEST);
        c.add(b4,BorderLayout.CENTER);
        c.add(b5,BorderLayout.EAST);


    }

    public static void main(String[] args) {
        BorderLayoutEX ble=new BorderLayoutEX();
    }
}


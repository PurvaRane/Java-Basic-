import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame 
{
    JFrame f;
    JButton b,b2;
    JLabel l;

    Frame(){
        // Creating a frame
        f = new JFrame("Helloo Misss");

        // creating a label
        l = new JLabel();
        l.setBounds(50,40,100,60);
        f.add(l);

        b = new JButton(" Heyyy");
        b.setBounds(60,60,50,40);
        f.add(b);

        b.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                b.setText("I Love You ");
            } 
        });
        f.setSize(500,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Frame();
    }
}

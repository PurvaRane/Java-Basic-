import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//click butttoonnn background change bhooommmmmmmm...
public class JButtonEvent extends JFrame implements ActionListener {
    Container c;
    JButton jb,jb1,jb2;
    JButtonEvent(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 500);
        c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);
        jb= new JButton("Click Here");
        jb.setBounds(100,100,100,10);
        jb1 = new JButton("Click Here");
        jb.setBounds(200,100,100,10);
        jb2 = new JButton("Click Here");
        jb.setBounds(300,100,100,10);
        jb.addActionListener(this);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        c.add(jb);
        c.add(jb1);
        c.add(jb2);


    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==jb){
            c.setBackground(Color.cyan);
        }
        if(e.getSource()==jb1){
            c.setBackground(Color.ORANGE);
        }
        if(e.getSource()==jb2){
            c.setBackground(Color.DARK_GRAY);
        }
    }
    public static void main(String[] args){
        JButtonEvent jb = new JButtonEvent();
       
    }
}

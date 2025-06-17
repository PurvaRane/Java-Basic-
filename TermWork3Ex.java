import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class TermWork3Ex 
{
    TermWork3Ex()
    {
        Frame f =new Frame(" TermWork3");
        f.setSize(600,400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        
        Label l = new Label(" Name");
        l.setBounds(80,50,60,40);
        

        TextField tf = new TextField();
        tf.setBounds(60,100,40,50);
        

        Button b = new Button ("Click");
        b.setBounds(150,60,50,30);
        

        Button bt = new Button ("Cancel");
        bt.setBounds(80,30,50,30);
        

        Button bt3 = new Button("Reset");
        bt3.setBounds(200,80,50,30);

          f.add(l);
         f.add(tf);
         f.add(b);
         f.add(bt);
          f.add(bt3);

    }   
    public static void main(String[] args) {
        new TermWork3Ex();
    }
}

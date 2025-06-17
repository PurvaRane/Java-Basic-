import java.awt.event.*;
import javax.swing.*;

public class Trail extends JFrame implements ActionListener {
Trail(){
    
    JTextField tf = new JTextField("Enter Your Name");
    tf.setBounds(100,100,100,100);
    add(tf);
    JLabel l = new JLabel();
    l.setBounds(100,50,100,70);
    add(l);
    JButton b = new JButton("Click here");
    b.setBounds(150,200,50,50);
    add(b);
    

    b.addActionListener(new ActionListener(){
       String c = tf.getName();
      public void actionPerformed(ActionEvent e){
        l.setText("Welcome" + c);
      }
    });
    setSize(300,300);
    setLayout(null);
    setVisible(true);
}

  public static void main(String[] args) {
    new Trail();

  }
}
/*Name:  kaushal Rajesh shinde
  Prn No.: 2130403245056
Roll No.:2211866*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TermWork3 
{
 public static void main(String[] args) {
    JFrame f = new JFrame("Swing Example");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(500,400);

    JPanel p=new JPanel();
    p.setLayout(new BorderLayout());

    JButton b = new JButton("Swing components in AJP");
    messageButton.setHorizontalAlignment(SwingConstants.RIGHT);
    p.add(messageButton,BorderLayout.NORTH);
    JLabel l = new JLabel("Enter your name");
    p.add(l,BorderLayout.WEST);

    JTextField tf= new JTextField(20);
    p.add(tf,BorderLayout.CENTER);

    JPanel bt = new JPanel();
    JButton okbutton = new JButton("ok");
    JButton resetbutton = new JButton("RESET");
    JButton cancelbutton = new JButton("CANCEL");

    bt.add(okbutton);
    bt.add(resetbutton);
    bt.add(cancelbutton);

    p.add(bt,BorderLayout.SOUTH);
    
    JScrollPane scrollp = new JScrollpane(p);
    f.getContentPane().add(scrollP);

    okbutton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String name = nameField.getText();
        }

    }
 }   
}

import java.awt.event.*; 
import javax.swing.*; 
public class ButtonExampleActionListener
{ public static void main(String[] args) 
{ JFrame f=new JFrame("Button Example"); 
final JTextField tf=new JTextField(); tf.setBounds(50,50, 200,20); 
JButton b=new JButton("Click Here"); b.setBounds(50,100,95,30); 
b.addActionListener (new ActionListener() { 
public void actionPerformed(ActionEvent e)
{ tf.setText("Welcome to SMS AJP classroom."); 
} 
}); 
f.add(b);f.add(tf); f.setSize(400,400); f.setLayout(null); f.setVisible(true); 
} 
}

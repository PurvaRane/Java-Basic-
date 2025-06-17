import java.awt.*;
import javax.swing.*;
public class MyGridLayout
{ JFrame f;
MyGridLayout()
{ f=new JFrame(); JButton b1=new JButton("Button1"); JButton b2=new JButton("Button2");
JButton b3=new JButton("Button3"); JButton b4=new JButton("Button4"); JButton b5=new JButton("5");
JButton b6=new JButton("6"); JButton b7=new JButton("Button7"); JButton b8=new JButton("Button8"); 
JButton b9=new JButton("Button9"); JButton b10=new JButton("Button10");
f.add(b1);f.add(b2);
f.add(b3);f.add(b4);
f.add(b5); f.add(b6);
 f.add(b7); f.add(b8);
f.add(b9);f.add(b10);
 f.setLayout(new GridLayout(2,2));//creating grid layout of 3 row and 3 columns
f.setSize(300,300); f.setVisible(true);
}
public static void main(String[] args)
{ new MyGridLayout(); }
}

//JScrollPaneLayout
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
public class ScrollPaneDemo extends JFrame
{ public ScrollPaneDemo()
{ super("ScrollPane Demo"); 
ImageIcon img = new ImageIcon("child.png");
JScrollPane png = new JScrollPane(new JLabel(img));
 getContentPane().add(png);
setSize(300,250); setVisible(true);
}
public static void main(String[] args)
{ new ScrollPaneDemo();
}
}
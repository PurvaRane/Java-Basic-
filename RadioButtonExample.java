import javax.swing.*;
public class RadioButtonExample
{ JFrameDe f;
RadioButtonExample()
{ f=new JFrameDe();
JRadioButton r1=new JRadioButton("A) Male"); JRadioButton r2=new JRadioButton("B) Female");
r1.setBounds(75,50,100,30); r2.setBounds(75,100,100,30);
ButtonGroup bg=new ButtonGroup(); bg.add(r1); bg.add(r2);
f.add(r1); f.add(r2); f.setSize(300,300); f.setLayout(null); //try adding f.add(bg)……..
f.setVisible(true);
}
public static void main(String[] args)
{ new RadioButtonExample();
}
} 
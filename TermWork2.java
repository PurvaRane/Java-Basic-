/*Name:  kaushal Rajesh shinde
  Prn No.: 2130403245056
  Roll No.:2211866
  Title:  Program of Implementing GUI interface using AWT components(Frame,
  Button, Label, TextField, TextArea, Checkbox, CheckboxGroup, Choice (Radio Button),
  Canvas, Panel)
*/
import java.awt.*;
import java.awt.event.*;
public class TermWork2 extends Frame 
{
    TermWork2()
    {
    setLayout(null);
    setSize(500,500);
    setVisible(true);

    Label l = new Label("Name");
    l.setBounds(40,50,80,30);

    TextField tf = new TextField();
    tf.setBounds(130,50,200,30);

    TextField tf2 = new TextField("Enter ur name");
    tf2.setBounds(230,60,50,40);

    Button b = new Button("Click");
    b.setBounds(40,100,60,30);

    add(l);
    add(tf);
    add(b);
    add(tf2);


    b.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent e)
          {
            tf.setText("Hey,I am Kaushal Rajesh Shinde...");
            tf2.setText("Now i am Live in Mumbai");
          }
      });
    }

    public static void main(String[] args) {
       new TermWork2();
    }
}
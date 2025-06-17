

import java.awt.*;
class AWTComponents1 extends Frame
{ AWTComponents1()
 { setTitle("More AWT components in Frame");//Frame title
 Checkbox chb1=new Checkbox();
 chb1.setBounds(10,50,100,50);
 chb1.setLabel("Checkbox 1");
 Checkbox chb2=new Checkbox("Chechbox 2",true);
 chb2.setBounds(150,50,100,50);

// checkbox group
CheckboxGroup cbg = new CheckboxGroup();
 Checkbox checkBox1 = new Checkbox("C++", cbg, false);
 checkBox1.setBounds(100,100,50,50);
 Checkbox checkBox2 = new
Checkbox("Java", cbg, true);
 checkBox2.setBounds(100,150,50,50);
// creating a choice component
 Choice c = new Choice();
 c.setBounds(100, 200, 75, 75);

 // adding items to the choice menu
 c.add("Item 1"); 
c.add("Item 2");
 c.add("Item 3");
 c.add("Item 4"); 
c.add("Item 5");

 // creating the list of 5 rows
List l1 = new List(5);

 // setting the position of list component
 l1.setBounds(100, 300, 75,75);

 // adding list items into the list
 l1.add("Item 1");
 l1.add("Item 2");
 l1.add("Item 3");
 l1.add("Item 4");
 l1.add("Item 5");

 add(chb1); add(chb2);
add(checkBox1);
add(checkBox2);
add(c); add(l1);

 setSize(500,500);
setLayout(null);
 setVisible(true);
 }

 public static void main(String args[])
 { new AWTComponents1();
 }
}
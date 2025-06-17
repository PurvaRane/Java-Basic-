import java.awt.*;

class AWTComponents {
  AwtComponents(){
   Frame f=new Frame("AWT Components ");  //Frame 
   //Panel 
   Panel p=new Panel(); 
   p.setBounds(200,200,200,200);
   p.setbackground(Color.Black);
   //Button
   Button b=new Button("Click here");
   b.setBounds(20,50,40,50);
   //Label
   Label l=new Label();
   l.setLabel("Here are some AWT components");   
   l.setBounds(50,50,50,50);
   //TextField
   TextField tf=new TextField("Write your name");
   tf.setBounds(10,100,50,50);
   //TextArea
   TextArea ta=new TextArea();
   ta.setText("Comments");
   ta.setBounds(60,50,50,50);
    //chechbox
   Cheackbox cb=new Checkbox("Checkbox,true");
ch.setBounds(10,70,30,40);
   //Checkbox group
   CheckboxGroup cg=new CheckboxGroup();
   CheckBox cb1=new Checkbox("Male",cbg,true);
   cb1.setBounds(100,100,50,50);
    Checkbox cb2=new Checkbox("Female",cbg,false);
  cb2.setBounds(100,150,50,50);
   //choice (Radio button)
  Choice c=new Choice();
  c.setBounds(100,200,50,50);
  
  //adding items to choice
 c.add("Java");    c.add("Python");
 c.add("C++");    c.add("C");

p.add(b);   p.add(l);      p.add(tf);
p.add(ta);  p.add(cb);  p.add(cg);
p.add(cbg);
f.add(p);
f.setSize(400,400);
 f.setLayout(null);
 f.setVisible(true); 
  }

  public static void main(String[] args) {
    new AWTComponents();
  }
}

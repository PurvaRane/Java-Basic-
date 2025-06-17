import java.awt.*;
public class CheckFrame extends Frame
{
  Checkbox cb1,cb2;
  String msg="";
  CheckFrame()
  {
    setLayout(null);
    setSize(300,300);
    setVisible(true);
    setTitle("Hello");
    cb1= new Checkbox("java",false);
    cb1.setBounds(100,100,50,50);
    add(cb1);
    cb2= new Checkbox("c++",false);
    cb2.setBounds(100,200,50,50);
    add(cb2);
  } 
  public static void main(String[] args) {
    CheckFrame cf=new CheckFrame();
  }
}

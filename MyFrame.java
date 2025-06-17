import java.awt.*;
public class MyFrame extends Frame
{
    MyFrame(String s)
    {
        super(s);
        setLayout(null);
        setVisible(true);
        setSize(400,200);
        Label one =new Label("Label one");
        Label two=new Label("Label Two");
        Label three= new Label("Label Three");
        one.setBounds(50,50,100,100);
        two.setBounds(150,50,100,100);
        three.setBounds(250,50,100,100); 
        add(one);
        add(  two);
        add(   three);
    }
    public static void main(String[] args) {
        MyFrame mf=new MyFrame("Demonstrating Frame");
    }
}

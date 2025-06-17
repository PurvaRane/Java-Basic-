import java.awt.*;
public class TextF extends Frame 
{
    TextField tf1,tf2;
    Label l1,l2;
    TextF(String s)
    {
        super(s);
        setLayout(null);
        setVisible(false);
        setSize(600,500);
        setTitle("TextField");
        l1=new Label("Enter user Name");
        l1.setBounds(50,100,100,50);
        tf1 = new TextField(12);
        tf1.setBounds(150,100,100,50);
        add(l1);
        add(tf1);
        l2=new Label("Enter ur Password");
        l2.setBounds(50,200,100,50);
        tf2 = new TextField(8);
        tf2.setBounds(150,200,100,50);
       
        add(l2);
        add(tf2);
    }
    public static void main(String[] args) {
        TextF tf=new TextF("Frame");
    }
}

import java.awt.*;
public class Sample extends Frame
{
    Checkbox cb1,cb2;
    String mag="";
    Sample()
    {
        setLayout(null);
        setVisible(true);
        setSize(500,300);
        setTitle("Hello");
        cb1 = new Checkbox("OKAY",true);
        cb1.setBounds(100,150,50,50);
        add(cb1);
        cb2 = new Checkbox("CANCEL", true);
        cb2.setBounds(150,100,50,50);
        add(cb2);
    }
    public static void main(String[] args) {
        Sample s = new Sample();
        }
}

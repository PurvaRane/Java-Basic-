import java.awt.*;
public class ChoiceControl extends Frame
{
    String msg="";
    Choice c;
    ChoiceControl()
    {
        setLayout(null); 
        setVisible(true);
        setSize(500,400);
        setTitle("Hello");
        c = new Choice(); 
        c.add("Sunday");
        c.add("Monday");
        c.add("Tuesday");
        c.add("Thursday");
        c.setBounds(100,100,100,100);
        add(c);
    }
    public static void main(String[] args) {
        ChoiceControl cn= new ChoiceControl();
    }
}
 
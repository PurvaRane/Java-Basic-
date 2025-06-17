import java.awt.*;
public class FlowLayoutDemo extends Frame
{
    private Button btn1,btn2,btn3,btn4,btn5,btn6;
    public FlowLayoutDemo()
    {
        setLayout( new FlowLayout());
        btn1=new Button("Button 1");
        add(btn1);
        btn2=new Button("Button 2");
        add(btn2);
        btn3=new Button("Button 3");
        add(btn3);
        btn4=new Button("Button 4");
        add(btn4);
        btn5=new Button("Button 5");
        add(btn5);
        btn6=new Button("Button 6");
        add(btn6);
        setTitle("FlowLayout Demo");
        setVisible(true);
        setSize(300,200);
    }
    public static void main(String[] args) 
    {
    new FlowLayoutDemo();
    }
}

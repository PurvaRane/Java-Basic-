import java.awt.*;
public class GridLayoutDemo extends Frame
{
    private Button btn1,btn2,btn3,btn4,btn5,btn6;
    public GridLayoutDemo()
    {
        setLayout(new GridLayout(3,2,3,3));
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
        setTitle("GridLayout Demo");
        setVisible(true);
        setSize(800,500);
    }
    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}

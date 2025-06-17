import java.awt.*;
public class SimpleFrame1 extends Frame
{
    SimpleFrame1()
    {
        setLayout(null);
        setVisible(true);
        setSize(500,500);
        setTitle("Hello");
    }
    public void paint(Graphics g)
    {
        g.drawString("How Are You ?", 100,50);
    }
    public static void main(String[] args) {
        SimpleFrame1 f=new SimpleFrame1();
    }
}

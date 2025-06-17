
import java.awt.*;
public class TestAwt 
{
    TestAwt()
    {
        Frame fm=new Frame("Javaaaaaaaaa");
        Label lb=new Label( "Welcomeee");
        lb.setBounds(200,300,100,200);
        fm.add(lb);
        fm.setVisible(true);
        fm.setSize(500,500);
    }
    public static void main(String[] args) {
        new TestAwt();  
    }
}


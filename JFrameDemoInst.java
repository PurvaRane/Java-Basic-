import javax.swing.*;
import java.awt.*;
public class JFrameDemoInst 
{
    JFrameDe jf;
    JFrameDemoInst()
    {
        JFrameDe jf = new JFrameDe("MyWindow");
        JButton btn = new JButton("Say Hello");
        jf.add(btn);        
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrameDe.EXIT_ON_CLOSE);
        jf.setSize(440,400);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        new JFrameDemoInst();
    }
}

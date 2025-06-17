import javax.swing.*;
import java.awt.*;
public class JFrameDemoExtend extends Frame 
{
    JFrameDe jf;
    JFrameDemoExtend()
    {
        setTitle("My Window");
        JLabel jl = new JLabel("Welcome");
        add(jl);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(300,300);
    }
    public static void main(String[] args) {
        new JFrameDemoExtend();
    }
}

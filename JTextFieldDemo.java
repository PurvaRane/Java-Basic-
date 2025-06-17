import javax.swing.*;
import java.awt.*;
public class JTextFieldDemo extends Frame 
{
    JTextFieldDemo()
    {
        setLayout(new FlowLayout());
        JLabel jl=new JLabel("TextField");
        add(jl);
        JTextField jtf=new JTextField(30);
        add(jtf);
        setSize(600,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new JTextFieldDemo();
    }
}

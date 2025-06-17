import javax.swing.*;
import java.awt.*;
public class Project extends JFrameDe 
{
    Project()
    {   
       setLayout(new FlowLayout ());
        JLabel j = new JLabel("Name");
        add(j);
        
        JTextFieldDemo T = new JTextFieldDemo(40);
        add(T);
        setSize(500,200);
        setVisible(true);

        JButton jb = new JButton("Back");
        jb.setBounds(50,50,90,20);
        add(jb);
        
    }
    public static void main(String[] args) {
        new Project();
    }
}

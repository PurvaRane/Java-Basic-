import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class JFrameDe extends JFrame
{
    private JLabel JLabel1=new JLabel();
    private JLabel JLabel2=new JLabel();
    public JFrameDe()
    {setLayout(null);
    setSize(new Dimension(400,300));
    JLabel1.setText("Username");
    JLabel1.setBounds(new Rectangle(40,80,80,50));
    JLabel2.setText("Password");
    JLabel2.setBounds(new Rectangle(50,60,100,25));
    add(JLabel2,null);
    add(JLabel1,null);
    }
    public static void main(String[] args) {
        JFrameDe frame=new JFrameDe();
        frame.setVisible(true);
    }
}

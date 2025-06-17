import java.awt.*;
import javax.swing.*;
public class BoxLayoutEx extends JFrame {
    BoxLayoutEx() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 700, 600);
        Container c = getContentPane();
        JButton b1 = new JButton("Purva");
        JButton b2 = new JButton("Nitin");
        JButton b3 = new JButton("Rane");
        JButton b4 = new JButton("Hello");
        BoxLayout bl = new BoxLayout(c, BoxLayout.Y_AXIS);
        c.setLayout(bl) ;c.add(b1);  c.add(b2);   c.add(b3);c.add(b4);

        b1.setAlignmentX(c.CENTER_ALIGNMENT);
        b2.setAlignmentX(c.CENTER_ALIGNMENT);
        b3.setAlignmentX(c.CENTER_ALIGNMENT);
        b4.setAlignmentX(c.CENTER_ALIGNMENT);
    }
    public static void main(String[] args) {
        BoxLayoutEx box = new BoxLayoutEx();
    }
}

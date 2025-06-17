import javax.swing.*;
import java.awt.*;

public class Borderlayout1 extends JFrame {
    Borderlayout1() {
        // Set window properties
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 300);

        // Get the content pane
        Container c = getContentPane();

        // Create BorderLayout and set it to the content pane
        BorderLayout borderLayout = new BorderLayout();
        c.setLayout(borderLayout);

        // Create buttons
        JButton b1 = new JButton("PAGE_START");
        JButton b2 = new JButton("PAGE_END");
        JButton b3 = new JButton("LINE_START");
        JButton b4 = new JButton("CENTER");
        JButton b5 = new JButton("LINE_END");

        // Add buttons to the layout in specific positions
        c.add(b1, BorderLayout.NORTH);
        c.add(b2, BorderLayout.SOUTH);
        c.add(b3, BorderLayout.WEST);
        c.add(b4, BorderLayout.CENTER);
        c.add(b5, BorderLayout.EAST);

        // Set horizontal and vertical gaps for the layout
        borderLayout.setHgap(15);
        borderLayout.setVgap(5);
    }

    public static void main(String[] args) {
        new Borderlayout1(); 
    }
}
import java.awt.Color;
import java.awt.event.*;
import java.lang.ProcessBuilder.Redirect;

import javax.swing.*;

class Welcome {
    JLabel l;
    JButton b;
    JTextFieldDemo tf;

    Welcome() {
        JFrameDe f = new JFrameDe("Harshal More ");
        // JButton
        b = new JButton("Click here");
        b.setBounds(100, 210, 100, 30);

        // JLabel
        l = new JLabel();
        l.setBounds(150, 70, 100, 100);
        // JTextField
        tf = new JTextFieldDemo("Name");
        tf.setBounds(100, 150, 150, 50);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s = tf.getText();
                l.setText("Welcome " + s);
            }
        });
        f.getContentPane().setBackground(Color.ORANGE);

        f.add(b);
        f.add(l);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrameDe.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Welcome();
    }
}

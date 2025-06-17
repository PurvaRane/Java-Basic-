/*Name: Omkar Shirish Shitole
 *PRN no:2030408245013
  Title:Implemnting GUI Interface using AWT Components
 */

import java.awt.*;
import java.awt.event.*;

public class Omkar {
    public static void main(String args[]) {
        Frame f = new Frame("My Frame");
        f.add(new MyCanvas());
        Font a1 = new Font("Arial", Font.BOLD, 15);
        Font a2 = new Font("Arial", Font.PLAIN, 15);
        Font a3 = new Font("Arial", Font.BOLD, 25);
        Panel panel = new Panel();
        panel.setBounds(100, 700, 100, 70);
        panel.setBackground(Color.blue);
        f.add(panel);

        Label l = new Label("My Form");
        l.setBounds(260, 9, 250, 85);
        l.setFont(a3);

        Label l1 = new Label("First Name :");
        l1.setBounds(50, 85, 100, 50);
        l1.setFont(a1);

        TextField t1 = new TextField();
        t1.setBounds(180, 93, 400, 30);
        t1.setFont(a1);

        Label l2 = new Label("Father's Name:");
        l2.setBounds(50, 126, 130, 50);
        l2.setFont(a1);

        TextField t2 = new TextField();
        t2.setBounds(180, 138, 400, 30);
        t2.setFont(a1);

        Label l3 = new Label("Last Name :");
        l3.setBounds(50, 176, 130, 50);
        l3.setFont(a1);

        TextField t3 = new TextField();
        t3.setBounds(180, 188, 400, 30);
        t3.setFont(a1);

        Label l4 = new Label("Mobile Number:");
        l4.setBounds(50, 226, 130, 50);
        l4.setFont(a1);

        TextField t4 = new TextField();
        t4.setBounds(180, 238, 400, 30);
        t4.setFont(a1);

        Label l5 = new Label("Gender :");
        l5.setBounds(50, 276, 100, 50);
        l5.setFont(a1);

        CheckboxGroup c = new CheckboxGroup();
        Checkbox c1 = new Checkbox("Male", c, false);
        c1.setBounds(180, 275, 50, 50);
        c1.setFont(a2);
        Checkbox c2 = new Checkbox("Female", c, false);
        c2.setBounds(280, 275, 70, 50);
        c2.setFont(a2);

        Label l6 = new Label("Hobbies :");
        l6.setBounds(50, 326, 100, 50);
        l6.setFont(a1);

        Checkbox cb1 = new Checkbox("Playing Instruments.", false);
        cb1.setBounds(180, 326, 170, 50);
        cb1.setFont(a2);
        Checkbox cb2 = new Checkbox("Dancing", false);
        cb2.setBounds(180, 366, 170, 50);
        cb2.setFont(a2);
        Checkbox cb3 = new Checkbox("Singing", false);
        cb3.setBounds(180, 406, 170, 50);
        cb3.setFont(a2);
        Checkbox cb4 = new Checkbox("Drawing", false);
        cb4.setBounds(180, 446, 200, 50);
        cb4.setFont(a2);
        Checkbox cb5 = new Checkbox("Other", false);
        cb5.setBounds(180, 486, 170, 50);
        cb5.setFont(a2);

        Label l7 = new Label("Address :");
        l7.setBounds(50, 536, 100, 50);
        l7.setFont(a1);

        TextArea ta1 = new TextArea();
        ta1.setBounds(180, 540, 400, 100);
        ta1.setFont(a1);

        Button b1 = new Button();
        b1.setBounds(200, 700, 75, 50);
        b1.setLabel("Submit");
        b1.setFont(a1);

        Button b2 = new Button();
        b2.setBounds(350, 700, 75, 50);
        b2.setLabel("Reset");
        b2.setFont(a1);

        f.add(l);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(t4);
        f.add(l5);
        f.add(c1);
        f.add(c2);
        f.add(l6);
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(cb4);
        f.add(cb5);
        f.add(l7);
        f.add(ta1);
        panel.add(b1);
        panel.add(b2);

        f.setSize(700, 800);
        f.setLayout(null);

        f.setVisible(true);
    }
}

class MyCanvas extends Canvas {
    public MyCanvas() {
        setBackground(Color.blue);
        setSize(70, 50);

    }

    public void paint(Graphics g) {
        g.fillOval(10, 10, 20, 20);
    }
}
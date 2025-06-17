//Name: Sidhik Udaysing Thorat
//PRN: 2030408245028
//Title: Implementing GUI interface using AWT Components

import java.awt.*;
import java.awt.event.*;

public class Sidhik {

    public static void main(String args[]) {

        Frame f = new Frame("AWt components");
        f.add(new MyCanvas());
        Panel panel = new Panel();
        panel.setBounds(100, 650, 100, 70);
        panel.setBackground(Color.GRAY);
        f.add(panel);
        Font a1 = new Font("Arial", Font.BOLD, 15);
        Font a2 = new Font("Arial", Font.PLAIN, 15);
        Font a3 = new Font("Arial", Font.BOLD, 25);

        Label l = new Label("Form");
        l.setBounds(260, 39, 250, 85);
        l.setFont(a3);

        Label label1 = new Label("Full Name:");
        label1.setBounds(50, 126, 130, 30);
        label1.setFont(a1);

        TextField tf1 = new TextField();
        tf1.setBounds(180, 138, 400, 30);
        tf1.setFont(a1);

        Label label2 = new Label("Email I'd :");
        label2.setBounds(50, 176, 130, 50);
        label2.setFont(a1);

        TextField tf2 = new TextField();
        tf2.setBounds(180, 188, 400, 30);
        tf2.setFont(a1);

        Label label3 = new Label("Gender :");
        label3.setBounds(50, 226, 100, 50);
        label3.setFont(a1);

        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox c1 = new Checkbox("Male", cbg, false);
        Checkbox c2 = new Checkbox("Female", cbg, false);

        c1.setBounds(180, 228, 50, 50);
        c1.setFont(a2);

        c2.setBounds(280, 228, 70, 50);
        c2.setFont(a2);

        Label label4 = new Label("Hobbies :");
        label4.setBounds(50, 426, 100, 50);
        label4.setFont(a1);

        Checkbox cb1 = new Checkbox("Traveling.", false);

        cb1.setBounds(180, 426, 170, 50);
        cb1.setFont(a2);

        Checkbox cb2 = new Checkbox("Cooking", false);
        cb2.setBounds(180, 466, 170, 50);

        cb2.setFont(a2);

        Checkbox cb3 = new Checkbox("Listening Music", false);
        cb3.setBounds(180, 506, 170, 50);

        cb3.setFont(a2);

        Checkbox cb4 = new Checkbox("Swimming", false);

        cb4.setBounds(180, 546, 200, 50);

        cb4.setFont(a2);
        Checkbox cb5 = new Checkbox("Other", false);
        cb5.setBounds(180, 586, 170, 50);

        cb5.setFont(a2);

        Label label5 = new Label("Address :");

        label5.setBounds(50, 300, 100, 50);
        label5.setFont(a1);

        TextArea tal = new TextArea();

        tal.setBounds(180, 300, 400, 100);
        tal.setFont(a1);

        Button b1 = new Button();
        b1.setBounds(250, 650, 150, 50);

        b1.setLabel("Submit");

        b1.setFont(a1);

        f.add(l);

        f.add(label1);
        f.add(tf1);

        f.add(label3);
        f.add(c1);
        f.add(c2);

        f.add(label5);
        f.add(tal);

        f.add(label2);
        f.add(tf2);
        f.add(label4);
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(cb4);
        f.add(cb5);

        panel.add(b1);
        f.setSize(700, 750);
        f.setLayout(null);

        f.setVisible(true);
    }
}

class MyCanvas extends Canvas {
    public MyCanvas() {
        setBackground(Color.blue);
        setSize(70, 50);

    }

}
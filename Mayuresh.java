
//Name : Mayuresh Madhukar Pawar.
// Prn No:2030408245011.
// Title : Implementing Gui interface using AWT components.*/
import java.awt.*;

public class Mayuresh {
    public static void main(String args[]) {
        Frame f = new Frame("AWt Components");
        Panel panel = new Panel();
        panel.setBounds(100, 400, 100, 50);
        panel.setBackground(Color.blue);
        Label l1 = new Label("School Name:");
        l1.setBounds(50, 45, 80, 50);
        TextField t1 = new TextField();
        t1.setBounds(130, 53, 400, 30);
        Label l2 = new Label("School Address :");
        l2.setBounds(50, 100, 100, 50);
        TextArea ta1 = new TextArea();
        ta1.setBounds(150, 100, 400, 100);
        Label l3 = new Label("Division :");
        l3.setBounds(50, 200, 100, 50);
        CheckboxGroup c = new CheckboxGroup();
        Checkbox c1 = new Checkbox("A", c, false);
        c1.setBounds(150, 200, 50, 50);
        Checkbox c2 = new Checkbox("B", c, false);
        c2.setBounds(200, 200, 70, 50);
        Label l4 = new Label("Favorite Subject :");
        l4.setBounds(50, 250, 100, 50);
        Checkbox cb1 = new Checkbox("English", false);
        cb1.setBounds(150, 250, 170, 50);
        Checkbox cb2 = new Checkbox("Science", false);
        cb2.setBounds(150, 300, 170, 50);
        Checkbox cb3 = new Checkbox("History", false);
        cb3.setBounds(150, 350, 170, 50);

        Button b1 = new Button();
        b1.setBounds(250, 400, 75, 50);
        b1.setLabel("Submit");
        f.add(l1);
        f.add(new MyCanvas());
        panel.add(b1);
        f.add(t1);
        f.add(panel);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(c1);
        f.add(c2);
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(ta1);

        f.setSize(700, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
}

class MyCanvas extends Canvas {
    public MyCanvas() {
        setBackground(Color.cyan);
        setSize(50, 50);

    }

}
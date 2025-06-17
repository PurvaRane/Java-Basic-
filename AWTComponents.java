
/*Name:   Harshal Sagar More
  Prn No.: 2030408245006
  Roll No.:2201845
  Title:  Program of Implementing GUI interface using AWT components(Frame,
  Button, Label, TextField, TextArea, Checkbox, CheckboxGroup, Choice (Radio Button),
  Canvas, Panel)
*/
import java.awt.*;

class AWTComponents {
    AWTComponents() {
        Frame f = new Frame("AWT Components "); // Frame
        f.add(new MyCanvas());
        // Panel
        Panel panel = new Panel();
        panel.setBounds(200, 200, 500, 400);
        panel.setBackground(Color.yellow);
        // Button
        Button b = new Button("Click here");
        b.setBounds(100, 200, 100, 100);
        // Label
        Label l1 = new Label("Here are some AWT components");
        l1.setBounds(10, 50, 100, 100);
        // TextField
        TextField tf = new TextField("Write your name");
        tf.setBounds(100, 100, 100, 100);
        // TextArea
        TextArea ta = new TextArea();
        ta.setText("Comments");
        ta.setBounds(150, 150, 100, 100);
        // chechbox
        Checkbox cb = new Checkbox("Checkbox", true);
        cb.setBounds(10, 70, 30, 40);
        // Checkbox group
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox cb1 = new Checkbox("Male", cbg, true);
        cb1.setBounds(100, 100, 100, 100);
        Checkbox cb2 = new Checkbox("Female", cbg, false);
        cb2.setBounds(100, 150, 100, 100);
        // choice (Radio button)
        Choice c = new Choice();
        c.setBounds(100, 200, 100, 100);

        // adding items to choice
        c.add("Java");
        c.add("Python");
        c.add("C++");
        c.add("C");

        panel.add(b);
        panel.add(l1);
        panel.add(tf);
        panel.add(ta);
        panel.add(cb);
        panel.add(cb1);
        panel.add(cb2);
        panel.add(c);
        f.add(panel);

        f.setSize(800, 800);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AWTComponents();
    }
}

class MyCanvas extends Canvas {
    public MyCanvas() {
        setBackground(Color.cyan);
        setSize(200, 200);

    }

    public void paint(Graphics g) {
        g.fillOval(100, 100, 100, 100);
    }
}

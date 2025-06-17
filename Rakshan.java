import java.awt.*;

class Awt extends Frame {
    Awt() {
        // Creating Panel
        add(new MyCanvas());

        Panel panel = new Panel();
        setBounds(200, 200, 500, 500);
        setBackground(Color.green);

        // Label- SMS AJP Classroom
        Label message = new Label("Welome To Advance Java Programming");
        message.setBounds(130, 30, 300, 30);
        add(message);

        // Checkbox Subjects
        Label subjects = new Label("Subjects of 5th semister");
        subjects.setBounds(115, 55, 300, 40);
        add(subjects);

        // Advanced Java Programming Checkbox
        Checkbox ajp = new Checkbox("Advanced Java Programming");
        ajp.setBounds(110, 80, 250, 50);
        add(ajp);

        // Operating System Checkbox
        Checkbox os = new Checkbox("Operating System");
        os.setBounds(110, 120, 250, 50);
        add(os);

        // Computer Networks and Security
        Checkbox cns = new Checkbox("Computer Networks and Security");
        cns.setBounds(110, 160, 250, 50);
        add(cns);

        // Javascript and PHP
        Checkbox e1 = new Checkbox("Javascript and PHP");
        e1.setBounds(110, 200, 250, 50);
        add(e1);

        // Entrepreneurship Development
        Checkbox ed = new Checkbox("Entrepreneurship Development");
        ed.setBounds(110, 240, 250, 50);
        add(ed);

        // Creating Textfield
        TextField tf = new TextField("Name of the Student");
        tf.setBounds(380, 135, 200, 30);
        add(tf);

        // Creating TextArea
        TextArea ta = new TextArea("Write about your hobby");
        ta.setBounds(380, 195, 200, 150);
        add(ta);

        // Creating Checkbox Group
        CheckboxGroup bg = new CheckboxGroup();
        Checkbox cb1 = new Checkbox("Regular", bg, true);
        cb1.setBounds(25, 90, 70, 30);
        Checkbox cb2 = new Checkbox("DSY", bg, false);
        cb2.setBounds(25, 120, 70, 30);
        add(cb1);
        add(cb2);

        // choice(Radio button)

        Choice c = new Choice();
        c.setBounds(400, 95, 135, 100);

        // Adding items to the choice
        c.add("17");
        c.add("18");
        c.add("19");
        c.add("20");

        // Creating Buttons
        // Button OK
        Button ok = new Button("OK");
        ok.setBounds(50, 330, 65, 35);
        add(ok);

        // BUTTON RESET
        Button RESET = new Button("RESET");
        RESET.setBounds(120, 330, 65, 35);
        add(RESET);

        // BUTTON CANCEL
        Button CANCEL = new Button("CANCEL");
        CANCEL.setBounds(190, 330, 65, 35);
        add(CANCEL);

        setSize(800, 800);
        setTitle("AJP lab TW:3");
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Awt();

    }

}

class MyCanvas extends Canvas {
    MyCanvas() {

        setSize(10, 50);
    }

    // Using paint() method
    public void paint(Graphics g) {
        g.drawOval(50, 50, 30, 30);

    }
}
